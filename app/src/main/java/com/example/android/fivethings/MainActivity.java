package com.example.android.fivethings;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    //This is the on click method attached to the button on the main layout. This sends the user to the next activity.
    public void goToPage2(View view) {
        Intent intent = new Intent(this, SoundLearnin.class);
        startActivity(intent);

    }
}
