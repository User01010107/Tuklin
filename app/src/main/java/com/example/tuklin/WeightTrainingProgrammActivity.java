package com.example.tuklin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class WeightTrainingProgrammActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight_training_programm);
    }

    public void Beginner(View view) {
        Intent intent = new Intent(WeightTrainingProgrammActivity.this, WeightProgramm1.class);
        startActivity(intent);
    }

    public void Middle(View view) {
        Intent intent = new Intent(WeightTrainingProgrammActivity.this, WeightProgramm2.class);
        startActivity(intent);
    }

    public void Advanced(View view) {
        Intent intent = new Intent(WeightTrainingProgrammActivity.this, WeightProgramm3.class);
        startActivity(intent);
    }



}