package com.example.tuklin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class WeightMuslesExersisesActivity extends AppCompatActivity {

    String layoutValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight_chest_exersises);


        Intent intent = getIntent();
        layoutValue = intent.getStringExtra("value");

        int intvalue = Integer.valueOf(layoutValue);
        switch(intvalue){
            case 1:
                setContentView(R.layout.layout_chest);
                break;

            case 2:
                setContentView(R.layout.layout_biceps);
                break;

            case 3:
                setContentView(R.layout.layout_triceps);
                break;

            case 4:
                setContentView(R.layout.layout_shoulders);
                break;

            case 5:
                setContentView(R.layout.layout_back);
                break;

            case 6:
                setContentView(R.layout.layout_core);
                break;

            case 7:
                setContentView(R.layout.layout_legs);
                break;


        }
    }
}