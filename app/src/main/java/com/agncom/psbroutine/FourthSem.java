package com.agncom.psbroutine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FourthSem extends AppCompatActivity {


    Button monday4th, tuesday4th, wedday4th, thursday4th, friday4th;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth_sem);


        monday4th = findViewById(R.id.monday4th);
        tuesday4th = findViewById(R.id.tuesday4th);
        wedday4th = findViewById(R.id.wedday4th);
        thursday4th = findViewById(R.id.thursday4th);
        friday4th = findViewById(R.id.friday4th);

        monday4th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mon4th = new Intent(FourthSem.this, Monday4th.class);
                startActivity(mon4th);
            }
        });
        tuesday4th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tues4th = new Intent(FourthSem.this, TuesDay4th.class);
                startActivity(tues4th);
            }
        });
        wedday4th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent wed4th = new Intent(FourthSem.this, WednesDay4th.class);
                startActivity(wed4th);
            }
        });
        thursday4th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent thrus4th = new Intent(FourthSem.this, ThursDay4th.class);
                startActivity(thrus4th);
            }
        });
        friday4th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fri4th = new Intent(FourthSem.this, FriDay4th.class);
                startActivity(fri4th);
            }
        });


    }
}