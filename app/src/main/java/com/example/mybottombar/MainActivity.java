package com.example.mybottombar;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.BottomBarBadge;
import com.roughike.bottombar.OnMenuTabClickListener;

public class MainActivity extends AppCompatActivity {
    TextView t;
    BottomBar bottomBar;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        android.support.v7.app.ActionBar ab = getSupportActionBar();
        ab.setTitle("Select Dine");
        t= (TextView) findViewById(R.id.textView1);
        t.setBackgroundColor(Color.parseColor("#3E2315"));
        t.setTextColor(Color.WHITE);
        b=(Button) findViewById(R.id.button1);
        b.setBackgroundColor(Color.parseColor("#EB4224"));
        bottomBar=BottomBar.attach(this,savedInstanceState);
        bottomBar.setItemsFromMenu(R.menu.menu_main, new OnMenuTabClickListener() {
            @Override
            public void onMenuTabSelected(@IdRes int menuItemId) {
            if(menuItemId==R.id.Bottombaritemone)
            {
                PeopleFragment f=new PeopleFragment();
                getSupportFragmentManager().beginTransaction().replace(R.id.Frame,f).commit();
            }
            else  if(menuItemId==R.id.Bottombaritemtwo)
            {
                    Cardsfragment f=new Cardsfragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.Frame,f).commit();
            }
            else  if(menuItemId==R.id.Bottombaritemthree)
            {
                Phonefragment f=new Phonefragment();
                getSupportFragmentManager().beginTransaction().replace(R.id.Frame,f).commit();
            }
            else  if(menuItemId==R.id.Bottombaritemfour)
            {
                Mailsfragment f=new Mailsfragment();
                getSupportFragmentManager().beginTransaction().replace(R.id.Frame,f).commit();
            }

            else  if(menuItemId==R.id.Bottombaritemfive)
            {
                Favouritesfragment f=new Favouritesfragment();
                getSupportFragmentManager().beginTransaction().replace(R.id.Frame,f).commit();
            }

            }

            @Override
            public void onMenuTabReSelected(@IdRes int menuItemId) {

            }
        });
        bottomBar.mapColorForTab(0,"#3E2315");
        bottomBar.mapColorForTab(1,"#3E2315");
        bottomBar.mapColorForTab(2,"#3E2315");
        bottomBar.mapColorForTab(3,"#3E2315");
        bottomBar.mapColorForTab(4,"#3E2315");
        BottomBarBadge unread;
        unread=bottomBar.makeBadgeForTabAt(3,"#3E2315",13);
        unread.show();
    }
    public void next(View v)
    {
        Intent i=new Intent(this,SecondActivity.class);
        startActivity(i);
    }
/*
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_two, menu);
        return true;
    }
*/
}
