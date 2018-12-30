package com.example.prince.explicitintent;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etName;
    Button btn1,btn2;
    TextView etAct1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName = findViewById(R.id.etName);
        btn1 = findViewById((R.id.btn1));
        btn2 = findViewById(R.id.btn2);
        etAct1 = findViewById(R.id.etAct1);



        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(etName.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this,"Please Enter all the fields!",Toast.LENGTH_SHORT).show();
                }
                else{
                    String name = etName.getText().toString().trim();
                    Intent intent = new Intent(MainActivity.this,com.example.prince.explicitintent.Activity2.class);
                    intent.putExtra("data",name);
                    startActivity(intent);
                }

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,com.example.prince.explicitintent.Activity3.class);
                startActivityForResult(intent,88);
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==88)
        {
            if(resultCode==RESULT_OK)
            {
                etAct1.setText(data.getStringExtra("dataAct3"));
            }
            if(resultCode==RESULT_CANCELED)
            {
                etAct1.setText("No Data Received!");
            }
        }
    }
}
