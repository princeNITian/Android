package com.example.prince.explicitintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Activity3 extends AppCompatActivity {

    EditText etAct3;
    Button btnSub,btnCacel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        etAct3 = findViewById(R.id.etAct3);
        btnSub = findViewById(R.id.btnSub);
        btnCacel = findViewById(R.id.btnCancel);

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              //  Toast.makeText(Activity3.this,"Submit button is clicked.",Toast.LENGTH_SHORT).show();
                if(etAct3.getText().toString().isEmpty()){
                    Toast.makeText(Activity3.this,"Please Enter the data!",Toast.LENGTH_SHORT).show();
                }
                else{
                    String str = etAct3.getText().toString().trim();
                    //Toast.makeText(Activity3.this, str, Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent();
                    intent.putExtra("dataAct3",str);
                    setResult(RESULT_OK,intent);
                    Activity3.this.finish();
                }
            }
        });

        btnCacel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setResult(RESULT_CANCELED);
                Activity3.this.finish();
            }
        });

    }
}
