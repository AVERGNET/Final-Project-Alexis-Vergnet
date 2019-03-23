package com.example.extstudent.finalproject;

import android.content.Intent;
import android.renderscript.Sampler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class RollRestult extends AppCompatActivity {

    TextView textViewResults = null;
    Button restart = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roll_restult);

        textViewResults = (TextView)findViewById(R.id.textViewResults);
        Intent resutls = getIntent();
        int ValueResults = resutls.getIntExtra("rollResult", 1);
        textViewResults.setText(Integer.toString(ValueResults));

        restart = (Button)findViewById(R.id.restart);
        this.restart.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent restart = new Intent(com.example.extstudent.finalproject.RollRestult.this,
                        com.example.extstudent.finalproject.rollpage.class);
                startActivity(restart);
            }
        }));
    }
}
