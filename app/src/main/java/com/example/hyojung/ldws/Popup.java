package com.example.hyojung.ldws;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;

/**
 * Created by hyojung on 2017-11-14.
 */

public class Popup extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_popup);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        ColorDrawable colorDrawable = new ColorDrawable(Color.BLACK);
        colorDrawable.setAlpha(200);

        getWindow().setLayout((int) (width), (int)(height));
        getWindow().setBackgroundDrawable(colorDrawable);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_SHOW_WHEN_LOCKED | WindowManager.LayoutParams.FLAG_DISMISS_KEYGUARD| WindowManager.LayoutParams.FLAG_TURN_SCREEN_ON);
    }
    public void popupOk(View v){
        finish();
    }
}
