package com.example.android.bluetoothlegatt;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

public class HomeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_home);
    }

    public void onClickStartScanning(View v) {
//        Intent toChallengeActivityIntent = new Intent(getBaseContext(), DeviceScanActivity.class);
        Intent toChallengeActivityIntent = new Intent(getBaseContext(), DeviceScanActivityWifi.class);
        startActivity(toChallengeActivityIntent);
    }
}
