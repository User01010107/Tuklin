package com.example.tuklin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class WorkOutBaseActivity extends AppCompatActivity {

    int[] workoutExersises;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work_out_base);



        workoutExersises = new int[]{
                R.id.pushUps, R.id.pullUps,R.id.sitUps,R.id.boat,
        };
    }

    public void DoExersise(View view) {
        for (int i = 0;i < workoutExersises.length; i++){
            if ( view.getId() == workoutExersises[i]){
                int value = i + 1;
                Log.i("FIRST",String.valueOf(value));
                Intent intent = new Intent(WorkOutBaseActivity.this, WorkOutBaseExersises.class);
                intent.putExtra("value",String.valueOf(value));
                startActivity(intent);
            }
        }
    }

}