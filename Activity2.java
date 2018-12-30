package com.example.prince.explicitintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    TextView etAct2;
    Button btnAct2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        etAct2 = findViewById(R.id.etAct2);
        etAct2.setVisibility(View.GONE);
        String name1 = getIntent().getStringExtra("data");
        etAct2.setText(name1+", Welcome to  Activity 2");
        etAct2.setVisibility(View.VISIBLE);
        btnAct2 = findViewById(R.id.btnAct2);
        btnAct2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Activity2.this,com.example.prince.explicitintent.MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
