package com.example.tuklin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SplashActivity extends AppCompatActivity {

    Button btnYoga,btnWorkOut,btnWeight;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Toolbar toolBar = findViewById(R.id.toolBar);
        setSupportActionBar(toolBar);


        btnYoga = findViewById(R.id.btnGetStartedYoga);
        btnWorkOut = findViewById(R.id.btnGetStartedWorkOut);
        btnWeight = findViewById(R.id.btnGetStartedWeight);


        btnYoga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SplashActivity.this,YogaActivity.class);
                startActivity(intent);
            }
        });

        btnWeight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SplashActivity.this, WeightDirectionActivity.class);
                startActivity(intent);
            }
        });

        btnWorkOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SplashActivity.this, WorkOutActivity.class);
                startActivity(intent);
            }
        });

    }

    public void setSupportActionBar(Toolbar toolbar) {

    }


    public void Food(View view) {
        Intent intent = new Intent(SplashActivity.this, FoodActivity.class);
        startActivity(intent);
    }
}

