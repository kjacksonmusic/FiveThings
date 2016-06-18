package com.example.android.fivethings;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class EqualizerLearnin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_equalizer_learnin);
    }

    //OnClick method to handle the button press to advance the user.
    public void goToFeed(View view) {
        Intent feed = new Intent(this, FeedbackLearnin.class);
        startActivity(feed);

    }
}
