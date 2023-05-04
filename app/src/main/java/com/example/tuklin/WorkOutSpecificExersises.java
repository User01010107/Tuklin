package com.example.tuklin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class WorkOutSpecificExersises extends AppCompatActivity {

    String layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work_out_specific_exersises);


        Intent intent = getIntent();
        layout = intent.getStringExtra("value");



        int intvalue = Integer.valueOf(layout);
        switch(intvalue){
            case 1:
                setContentView(R.layout.layout_planche);
                break;

            case 2:
                setContentView(R.layout.layout_frontlever);
                break;

            case 3:
                setContentView(R.layout.layout_handstand);
                break;
        }
    }
}