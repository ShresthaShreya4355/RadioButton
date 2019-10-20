package com.example.project1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    RadioButton radioButton1,radioButton2,radioButton3;

    ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioButton1 = findViewById(R.id.rbBike);
        radioButton2 = findViewById(R.id.rbCar);

        radioButton3 = findViewById(R.id.rbCycle);
        imageView = findViewById(R.id.ivShow);

        radioButton1.setOnClickListener(this);
        radioButton2.setOnClickListener(this);
        radioButton3.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.rbBike:
                imageView.setImageResource(R.drawable.bike);
                break;

            case R.id.rbCar:
                imageView.setImageResource(R.drawable.car);
                break;

            case R.id.rbCycle:
                imageView.setImageResource(R.drawable.cycle);
                break;


        }}

}

