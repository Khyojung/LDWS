package com.example.hyojung.ldws;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    View drawerView;
    DrawerLayout dlDrawer;
    ImageButton tvSlideMenu;
    TextView location;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView situMes = (TextView)findViewById(R.id.situation);
        situMes.setText("주변이 조용해요");

        location = (TextView)findViewById(R.id.location);
        location.setText("충남대학교 공과대학 5호관 1층");



    }
    public void popup(View v){
        startActivity(new Intent(this, Popup.class));
    }
    public void sound(View v){
        Intent intent = new Intent(this, SoundActivity.class);
        startActivity(intent);
    }
    public void vibrate(View v){
        Intent intent = new Intent(this, VibarationActivity.class);
        startActivity(intent);
    }
    public void setting(View v){
        Intent intent = new Intent(this, SettingActivity.class);
        startActivity(intent);
    }
    public void home(View v){
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);

    }
    public void login(View v){


        DrawerLayout drawerLayout = (DrawerLayout) findViewById(R.id.drawer);
        if(! drawerLayout.isDrawerOpen(Gravity.END)){
            drawerLayout.openDrawer(Gravity.END);
        }
    }

    public boolean onCreateOptionsMenu(Menu menu){
        ActionBar actionBar = getSupportActionBar();

        actionBar.setDisplayShowCustomEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(false);
        actionBar.setDisplayShowTitleEnabled(false);
        actionBar.setDisplayShowHomeEnabled(false);

        LayoutInflater inflater = (LayoutInflater)getSystemService(LAYOUT_INFLATER_SERVICE);
        View actionbar = inflater.inflate(R.layout.custom_actionbar, null);

        actionBar.setCustomView(actionbar);

        //액션바 양쪽 공백 없애기
        Toolbar parent = (Toolbar)actionbar.getParent();
        parent.setContentInsetsAbsolute(0,0);



        return true;
    }


}
