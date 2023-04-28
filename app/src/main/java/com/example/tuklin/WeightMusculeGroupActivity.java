package com.example.tuklin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.tuklin.R;

public class WeightMusculeGroupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight_muscule_group);
    }


    public void ImageBtnClick(View view) {
    }
    public void PectoralMuscles(View view) {
        Intent intent = new Intent(WeightMusculeGroupActivity.this , WeightChest.class);
        startActivity(intent);
    }


    public void Biceps(View view) {
        Intent intent = new Intent(WeightMusculeGroupActivity.this , WeightBiceps.class);
        startActivity(intent);
    }

    public void Triceps(View view) {
        Intent intent = new Intent(WeightMusculeGroupActivity.this , WeightTriceps.class);
        startActivity(intent);
    }

    public void Shoulders(View view) {
        Intent intent = new Intent(WeightMusculeGroupActivity.this , WeightShoulders.class);
        startActivity(intent);
    }

    public void Core(View view) {
        Intent intent = new Intent(WeightMusculeGroupActivity.this , WeightCore.class);
        startActivity(intent);
    }

    public void Back(View view) {
        Intent intent = new Intent(WeightMusculeGroupActivity.this , WeightBack.class);
        startActivity(intent);
    }

    public void Legs(View view) {
        Intent intent = new Intent(WeightMusculeGroupActivity.this , WeightLegs.class);
        startActivity(intent);
    }

}