package com.example.android.fivethings;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SRLearnin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_srlearnin);
    }

    //This is the on click method attached to the finished button when pressed the app is "closed".
    public void exitApp(View view) {
        Intent home = new Intent(Intent.ACTION_MAIN);
        home.addCategory(Intent.CATEGORY_HOME);
        home.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(home);

    }

    // This onclick method sends the user  back to the start.
    public void startOver(View view) {
        Intent start = new Intent(this, MainActivity.class);
        startActivity(start);
    }
}