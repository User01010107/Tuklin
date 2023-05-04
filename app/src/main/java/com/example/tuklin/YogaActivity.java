package com.example.tuklin;


import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class YogaActivity extends AppCompatActivity {

    int[] yogaExersises;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yoga);

        yogaExersises = new int[]{
                R.id.twist, R.id.cat,R.id.bride,R.id.incline,
                R.id.table, R.id.rider,R.id.butterfly,
        };

    }

    public void ImageBtnClick(View view) {
        for (int i = 0;i < yogaExersises.length; i++){
            if ( view.getId() == yogaExersises[i]){
                int value = i + 1;
                Log.i("FIRST",String.valueOf(value));
                Intent intent = new Intent(YogaActivity.this, YogaExersisesActivity.class);
                intent.putExtra("value",String.valueOf(value));
                startActivity(intent);
            }
        }
    }
}