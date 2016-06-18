package com.example.android.fivethings;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SoundLearninPt2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sound_learnin_pt2);
    }

    //OnClick method to handle the button press to advance the user.
    public void goToEQ(View view) {
        Intent eq = new Intent(this, EqualizerLearnin.class);
        startActivity(eq);

    }
}

