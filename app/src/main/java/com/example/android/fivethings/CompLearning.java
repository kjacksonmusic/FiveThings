package com.example.android.fivethings;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CompLearning extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comp_learnin);
    }

    //OnClick method to handle the button press to advance the user.
    public void goToSR(View view) {
        Intent sr = new Intent(this, SRLearnin.class);
        startActivity(sr);

    }

    // goes to the more info illustration
    public void goToCompImage(View view) {
        Intent compgo = new Intent(this, CompImage.class);
        startActivity(compgo);

    }
}
