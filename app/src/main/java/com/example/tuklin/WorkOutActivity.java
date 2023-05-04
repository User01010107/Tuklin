package com.example.tuklin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class WorkOutActivity extends AppCompatActivity {

    int[] specificExersises;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work_out);


        specificExersises = new int[]{
                R.id.planche, R.id.frontLever,R.id.handstand,
        };
    }

    public void DoBaseExersises(View view) {
        Intent intent = new Intent(WorkOutActivity.this, WorkOutBaseActivity.class);
        startActivity(intent);
    }

    public void DoSpecificExersises(View view) {
        for (int i = 0;i < specificExersises.length; i++){
            if ( view.getId() == specificExersises[i]){
                int value = i + 1;
                Log.i("FIRST",String.valueOf(value));
                Intent intent = new Intent(WorkOutActivity.this, WorkOutSpecificExersises.class);
                intent.putExtra("value",String.valueOf(value));
                startActivity(intent);
            }
        }
    }
}