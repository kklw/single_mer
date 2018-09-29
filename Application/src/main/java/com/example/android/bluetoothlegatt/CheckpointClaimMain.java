package com.example.android.bluetoothlegatt;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;

public class CheckpointClaimMain extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_checkpoint_claim_main);
    }

    public void onClickClaimSubmit(View v) {
        Log.d("FAT","FAT");
        Intent toCheckpointClaimSuccessIntent = new Intent(this, CheckpointClaimSuccess.class);
        startActivity(toCheckpointClaimSuccessIntent);
    }
}
