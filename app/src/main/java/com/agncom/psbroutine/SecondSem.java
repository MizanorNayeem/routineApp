package com.agncom.psbroutine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondSem extends AppCompatActivity {


    Button monday2nd, tuesday2nd, wedday2nd, thursday2nd, friday2nd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_sem);

        monday2nd = findViewById(R.id.monday2nd);
        tuesday2nd = findViewById(R.id.tuesday2nd);
        wedday2nd = findViewById(R.id.wedday2nd);
        thursday2nd = findViewById(R.id.thursday2nd);
        friday2nd = findViewById(R.id.friday2nd);

        monday2nd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mon2nd = new Intent(SecondSem.this, Monday2nd.class);
                startActivity(mon2nd);
            }
        });
        tuesday2nd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tues2nd = new Intent(SecondSem.this, TuesDay2nd.class);
                startActivity(tues2nd);
            }
        });
        wedday2nd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent wed2nd = new Intent(SecondSem.this, WednesDay2nd.class);
                startActivity(wed2nd);
            }
        });
        thursday2nd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent thrus2nd = new Intent(SecondSem.this, ThursDay2nd.class);
                startActivity(thrus2nd);
            }
        });
        friday2nd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fri2nd = new Intent(SecondSem.this, FriDay2nd.class);
                startActivity(fri2nd);
            }
        });


    }
}