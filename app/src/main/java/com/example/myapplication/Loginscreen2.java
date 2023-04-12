package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;


public class Loginscreen2 extends AppCompatActivity {

    Button btnvisible, btnhide;

    ProgressBar progressbr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_loginscreen2);
        initView();

    }

    private void initView() {
        btnvisible = findViewById(R.id.btnvisible);
        btnhide = findViewById(R.id.btnhide);
        progressbr = findViewById(R.id.progressbr);

        btnvisible.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View View) {
                progressbr.setVisibility(View.VISIBLE);
            }

        });

        btnhide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View View) {
                progressbr.setVisibility(View.INVISIBLE);
            }
        });


    }
}



