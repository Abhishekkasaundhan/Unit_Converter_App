package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    CardView cv_s;
    CardView cv_a;
    CardView cv_t;
    CardView cv_w;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        cv_t = findViewById(R.id.cv_tmp);
        cv_w = findViewById(R.id.cv_weight);
        cv_s = findViewById(R.id.cv_speed);
        cv_a = findViewById(R.id.cv_area);

        cv_t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, temp_calculation.class));
            }
        });
        cv_w.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, weight_calculation.class));
            }
        });
        cv_s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, speed_calculation.class));
            }
        });
        cv_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, area_calculation.class));
            }
        });


    }
}
