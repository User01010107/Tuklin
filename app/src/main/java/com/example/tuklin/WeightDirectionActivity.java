package com.example.tuklin;



import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class WeightDirectionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight_direction);
    }


    public void trainingProgramms(View view) {
        Intent intent = new Intent(WeightDirectionActivity.this, WeightTrainingProgrammActivity.class);
        startActivity(intent);
    }

    public void exersises(View view) {
        Intent intent = new Intent(WeightDirectionActivity.this, WeightMusculeGroupActivity.class);
        startActivity(intent);
    }
}