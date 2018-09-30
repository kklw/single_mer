package com.example.android.bluetoothlegatt;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.Toast;

public class CheckpointClaimEntry extends Activity {
    final String claim_password = "0803";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_checkpoint_claim_entry);
    }

    public void onClickCheckPointClaimEntry(View v) {
        EditText claim_edittext = (EditText)findViewById(R.id.checkpoint_claim_edittext);
        String content = claim_edittext.getText().toString();

        if(content.contentEquals(claim_password)) {
            Intent toPictureActivityIntent = new Intent(getBaseContext(), PictureActivity.class);
            startActivity(toPictureActivityIntent);
        } else {
            Context context = getApplicationContext();
            CharSequence text = "Wrong Password!";
            int duration = Toast.LENGTH_SHORT;
            Toast.makeText(context, text, duration).show();
        }
    }
}
