package com.example.tuklin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.tuklin.R;

public class WeightMusculeGroupActivity extends AppCompatActivity {

    int[] musclesExersises;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight_muscule_group);

        musclesExersises = new int[]{
                R.id.pectoralMuscles,R.id.biceps,R.id.triceps,R.id.shoulders,R.id.back,R.id.core,R.id.legs,
        };
    }


    public void DoExersise(View view) {
        for (int i = 0;i < musclesExersises.length; i++){
            if ( view.getId() == musclesExersises[i]){
                int value = i + 1;
                Log.i("FIRST",String.valueOf(value));
                Intent intent = new Intent(WeightMusculeGroupActivity.this, WeightMuslesExersisesActivity.class);
                intent.putExtra("value",String.valueOf(value));
                startActivity(intent);
            }
        }
    }
}