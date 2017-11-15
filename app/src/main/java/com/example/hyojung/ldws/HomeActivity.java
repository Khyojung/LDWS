package com.example.hyojung.ldws;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {
    TextView tv_1;
    TextView tv_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        tv_1 = (TextView)findViewById(R.id.list_tv_1);
        tv_2 = (TextView)findViewById(R.id.list_tv_2);

        tv_1.setText("첫번째 소리 항목");
        tv_2.setText("두번째 소리 항목");
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
    public void add_list(View v){
        Toast.makeText(this, "항목을 추가합니다.", Toast.LENGTH_SHORT).show();
    }
}
