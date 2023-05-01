package com.example.tuklin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class YogaExersisesActivity extends AppCompatActivity {

    String layoutValue;

    Button startTimer;
    private CountDownTimer  countDownTimer;
    TextView timerText;
    private boolean isTimerRunnin;
    private long leftMills;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yoga_exersises);

        Intent intent = getIntent();
        layoutValue = intent.getStringExtra("value");

        int intvalue = Integer.valueOf(layoutValue);
        switch(intvalue){
            case 1:
                setContentView(R.layout.activity_twist);
                break;

            case 2:
                setContentView(R.layout.activity_cat);
                break;

            case 3:
                setContentView(R.layout.activity_bridge);
                break;

            case 4:
                setContentView(R.layout.activity_incline);
                break;

            case 5:
                setContentView(R.layout.activity_table);
                break;

            case 6:
                setContentView(R.layout.activity_rider);
                break;

            case 7:
                setContentView(R.layout.activity_plank);
                break;
        }

        startTimer = findViewById(R.id.btnTimer);
        timerText = findViewById(R.id.txtTime);

        startTimer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isTimerRunnin){
                    StopTimer();
                }

                else{
                    StartTimer();
                }
            }
        });


    }

    private void StopTimer(){
        countDownTimer.cancel();
        isTimerRunnin = false;
        startTimer.setText("Start");
    }

    private void StartTimer(){
        final CharSequence value = timerText.getText();
        String num1 = value.toString();
        String num2 = num1.substring(0,2);
        String num3 = num1.substring(3,5);


        final int number = Integer.valueOf(num2) * 60 + Integer.valueOf(num3);
        leftMills = number*1000;

        countDownTimer = new CountDownTimer(leftMills,1000) {
            @Override
            public void onTick(long millisUntilFinished) {

                leftMills = millisUntilFinished;
                upgradeTimer();

            }

            @Override
            public void onFinish() {

                int newvalue = Integer.valueOf(layoutValue) + 1;
                if (newvalue <= 100){
                    Intent intent = new Intent(YogaExersisesActivity.this, YogaExersisesActivity.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    intent.putExtra("value", String.valueOf(newvalue));
                    startActivity(intent);
                }
                else{
                    newvalue = 1;
                    Intent intent = new Intent(YogaExersisesActivity.this,YogaExersisesActivity.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    intent.putExtra("value",String.valueOf(newvalue));
                    startActivity(intent);
                }

            }
        }.start();
        startTimer.setText("Pause");
        isTimerRunnin = true;
    }

    private void upgradeTimer(){
        int minutes = (int)leftMills/60000;
        int seconds = (int)leftMills%60000/1000;

        String timeLeft = "";
        if (minutes < 10){
            timeLeft = "0";
        }
        timeLeft = timeLeft + minutes + ":";
        if ( seconds < 10){
            timeLeft += "0";
        }
        timeLeft += seconds;
        timerText.setText(timeLeft);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}