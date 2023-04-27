package com.example.tuklin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class WorkOutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work_out);
    }

    public void DoBaseExersises(View view) {
        Intent intent = new Intent(WorkOutActivity.this, WorkOutBaseActivity.class);
        startActivity(intent);
    }
    public void DoPlanche(View view) {
        Intent intent = new Intent(WorkOutActivity.this, WorkOutPlanche.class);
        startActivity(intent);
    }
    public void DoFrontLever(View view) {
        Intent intent = new Intent(WorkOutActivity.this, WorkOutFL.class);
        startActivity(intent);
    }
    public void DoHandstand(View view) {
        Intent intent = new Intent(WorkOutActivity.this, WorkOutHandstand.class);
        startActivity(intent);
    }
}