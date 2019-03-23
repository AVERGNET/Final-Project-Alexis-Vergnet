package com.example.extstudent.finalproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class rollpage extends AppCompatActivity {

    Button ROLL4 = null;
    Button ROLL6 = null;
    Button ROLL12 = null;
    Button ROLL20 = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rollpage);
        ROLL4 = (Button)findViewById(R.id.ROLL4);
        this.ROLL4.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int rollResult = getRandomInt(1, 4);
                Intent result = new Intent(com.example.extstudent.finalproject.rollpage.this,
                        com.example.extstudent.finalproject.RollRestult.class);
                result.putExtra("rollResult", rollResult);
                startActivity(result);
            }
        }));
        ROLL6 = (Button)findViewById(R.id.ROLL6);
        this.ROLL6.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int rollResult = getRandomInt(1, 6);
                Intent result = new Intent(com.example.extstudent.finalproject.rollpage.this,
                        com.example.extstudent.finalproject.RollRestult.class);
                result.putExtra("rollResult", rollResult);
                startActivity(result);
            }
        }));
        ROLL12 = (Button)findViewById(R.id.ROLL12);
        this.ROLL12.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int rollResult = getRandomInt(1, 12);
                Intent result = new Intent(com.example.extstudent.finalproject.rollpage.this,
                        com.example.extstudent.finalproject.RollRestult.class);
                result.putExtra("rollResult", rollResult);
                startActivity(result);
            }
        }));
        ROLL20 = (Button)findViewById(R.id.ROLL20);
        this.ROLL20.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int rollResult = getRandomInt(1, 20);
                Intent result = new Intent(com.example.extstudent.finalproject.rollpage.this,
                        com.example.extstudent.finalproject.RollRestult.class);
                result.putExtra("rollResult", rollResult);
                startActivity(result);
            }
        }));
    }
    private int getRandomInt(int min, int max) {
        Random rand = new Random();
        return rand.nextInt(max) + min;
    }

}