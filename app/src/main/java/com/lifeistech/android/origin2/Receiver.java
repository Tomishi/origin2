package com.lifeistech.android.origin2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by takashi on 2015/06/28.
 */
public class Receiver extends BroadcastReceiver{

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context,"時間ですよ！",Toast.LENGTH_SHORT).show();
    }

}
