package com.example.android.fivethings;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class SoundLearnin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sound_learnin);
    }
// Just like in the last Activity, this handles the button click. It includes an if else statement to direct the user to the proper destination.

    public void goToPage3(View view) {
        Button but = (Button) findViewById(R.id.go_pg2_button);
        Intent noAdvance = new Intent(this, SoundLearninPt2.class);
        Intent advance = new Intent(this, EqualizerLearnin.class);
        CheckBox iLearned = (CheckBox) findViewById(R.id.sound_learnin_checkbox1);
        boolean iLearnedChecked = iLearned.isChecked();
        CheckBox iNoNothing = (CheckBox) findViewById(R.id.idontunderstandsoundwaves);
        boolean ididNotLearned = iNoNothing.isChecked();
        ///if else used to advance the user if the checkbox is checked or if the user needs further teaching they will go to a different page.
        if (iLearnedChecked) {
            startActivity(advance);
            //else if used to take the user to another activity if they did not learn something.
        } else if (ididNotLearned) {
            startActivity(noAdvance);
            //if nothing is selected and the user tries to advance a toast will show telling them to make a selection.
        } else if (but.isPressed()) {
            Toast toast = Toast.makeText(this, "Please make a selection", Toast.LENGTH_SHORT);
            toast.show();
        }
    }
}
