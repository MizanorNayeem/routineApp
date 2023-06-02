package com.agncom.psbroutine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button secondSem, fourthSem, sixthSem, aboutUs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        secondSem = findViewById(R.id.secondSem);
        fourthSem = findViewById(R.id.fourthSem);
        sixthSem = findViewById(R.id.sixthSem);
        aboutUs = findViewById(R.id.aboutUs);

        sixthSem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sixthsemIntent = new Intent(MainActivity.this, SixthSem.class);
                startActivity(sixthsemIntent);
            }
        });
        secondSem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent secondsemIntent = new Intent(MainActivity.this, SecondSem.class);
                startActivity(secondsemIntent);
            }
        });
        fourthSem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fourthSemIntent = new Intent(MainActivity.this, FourthSem.class);
                startActivity(fourthSemIntent);
            }
        });
        aboutUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent aboutUsIntent = new Intent(MainActivity.this, AboutUs.class);
                startActivity(aboutUsIntent);
            }
        });



    }
}