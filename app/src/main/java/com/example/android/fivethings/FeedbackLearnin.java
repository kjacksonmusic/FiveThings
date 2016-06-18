package com.example.android.fivethings;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FeedbackLearnin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback_learnin);
    }


    //OnClick method to handle the button press to advance the user.
    public void goToComp(View view) {
        Intent eq = new Intent(this, CompLearning.class);
        startActivity(eq);

    }
}



