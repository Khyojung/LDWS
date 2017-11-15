package com.example.hyojung.ldws;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by hyojung on 2017-11-14.
 */

public class BroadcastReceiver extends android.content.BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Bundle bundle = intent.getExtras();
        if(bundle != null){
            getMessage(intent,context);

        }
    }

    private void getMessage(Intent intent, Context context){
        Intent popupIntent = new Intent(context, Popup.class).setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(popupIntent);
    }

}
