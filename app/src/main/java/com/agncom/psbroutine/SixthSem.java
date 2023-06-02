package com.agncom.psbroutine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.ScrollView;

public class SixthSem extends AppCompatActivity {

    RelativeLayout daySelectionSix;
    Button mondaySix, tuesdaySixth, weddaySixth, thursdaySixth, fridaySixth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixth_sem);

        daySelectionSix = findViewById(R.id.daySelectionSix);
        mondaySix = findViewById(R.id.mondaySix);
        tuesdaySixth = findViewById(R.id.tuesdaySixth);
        weddaySixth = findViewById(R.id.weddaySixth);
        thursdaySixth = findViewById(R.id.thursdaySixth);
        fridaySixth = findViewById(R.id.fridaySixth);

        mondaySix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent monSix = new Intent(SixthSem.this, Monday6th.class);
                startActivity(monSix);
            }
        });
        tuesdaySixth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tuesSix = new Intent(SixthSem.this, TuesDay6th.class);
                startActivity(tuesSix);
            }
        });
        weddaySixth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent wedSix = new Intent(SixthSem.this, WednesDay6th.class);
                startActivity(wedSix);
            }
        });
        thursdaySixth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent thrusSix = new Intent(SixthSem.this, ThursDay6th.class);
                startActivity(thrusSix);
            }
        });
        fridaySixth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent friSix = new Intent(SixthSem.this, FriDay6th.class);
                startActivity(friSix);
            }
        });


    }
}