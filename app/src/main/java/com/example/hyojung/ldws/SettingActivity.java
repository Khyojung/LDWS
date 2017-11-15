package com.example.hyojung.ldws;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class SettingActivity extends AppCompatActivity {
    TextView tv_1;
    TextView tv_2;
    TextView tv_3;
    TextView tv_4;
    TextView tv_5;
    TextView tv_6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        tv_1 = (TextView)findViewById(R.id.set_tv_1);
        tv_2 = (TextView)findViewById(R.id.set_tv_2);
        tv_3 = (TextView)findViewById(R.id.set_tv_3);
        tv_4 = (TextView)findViewById(R.id.set_tv_4);
        tv_5 = (TextView)findViewById(R.id.set_tv_5);
        tv_6 = (TextView)findViewById(R.id.set_tv_6);

        tv_1.setText("비상 모드 설정");
        tv_2.setText("테마 변경");
        tv_3.setText("절전 모드");
        tv_4.setText("계정 설정");
        tv_5.setText("최근 알림");
        tv_6.setText("도움말");

    }
    public boolean onCreateOptionsMenu(Menu menu){
        ActionBar actionBar = getSupportActionBar();

        actionBar.setDisplayShowCustomEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(false);
        actionBar.setDisplayShowTitleEnabled(false);
        actionBar.setDisplayShowHomeEnabled(false);

        LayoutInflater inflater = (LayoutInflater)getSystemService(LAYOUT_INFLATER_SERVICE);
        View actionbar = inflater.inflate(R.layout.custom_actionbar_menu, null);

        actionBar.setCustomView(actionbar);

        //액션바 양쪽 공백 없애기
        Toolbar parent = (Toolbar)actionbar.getParent();
        parent.setContentInsetsAbsolute(0,0);



        return true;
    }
    public void back(View v){
        finish();
    }
}
