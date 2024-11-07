package com.example.calapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class BasicCal extends AppCompatActivity {

    Button bmi,plus,min,multy,div;
    EditText nmb1, nmb2;
    TextView rslt;

    float rs,number11,number22;
    int number1,number2;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_cal);

        bmi=findViewById(R.id.btnGoBMI);
        plus=findViewById(R.id.btnPlus);
        min=findViewById(R.id.btnMin);
        multy=findViewById(R.id.btnMulty);
        div=findViewById(R.id.btnDiv);
        nmb1=findViewById(R.id.txtn1);
        nmb2=findViewById(R.id.txtn2);
        rslt=findViewById(R.id.txtRslt);

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (nmb1.getText().toString().equals("") || nmb2.getText().toString().equals("")){
                    Toast.makeText(BasicCal.this, "Enter some Value", Toast.LENGTH_SHORT).show();
                }else {
                    number1=Integer.parseInt(nmb1.getText().toString());
                    number2=Integer.parseInt(nmb2.getText().toString());

                    rs=number1+number2;

                    rslt.setText(String.valueOf(rs));
                }

            }
        });

        min.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (nmb1.getText().toString().equals("") || nmb2.getText().toString().equals("")){
                    Toast.makeText(BasicCal.this, "Enter some Value", Toast.LENGTH_SHORT).show();
                }else {
                    number1=Integer.parseInt(nmb1.getText().toString());
                    number2=Integer.parseInt(nmb2.getText().toString());

                    rs=number1-number2;

                    rslt.setText(String.valueOf(rs));
                }

            }
        });

        multy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                if (nmb1.getText().toString().equals("") || nmb2.getText().toString().equals("")){
                    Toast.makeText(BasicCal.this, "Enter some Value", Toast.LENGTH_SHORT).show();
                }else {
                    number1=Integer.parseInt(nmb1.getText().toString());
                    number2=Integer.parseInt(nmb2.getText().toString());

                    rs=number1*number2;

                    rslt.setText(String.valueOf(rs));
                }

            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (nmb1.getText().toString().equals("") || nmb2.getText().toString().equals("")){
                    Toast.makeText(BasicCal.this, "Enter some Value", Toast.LENGTH_SHORT).show();
                }else {

                    number11=Float.parseFloat(nmb1.getText().toString());
                    number22=Float.parseFloat(nmb2.getText().toString());

                    rs=number11/number22;

                    rslt.setText(String.valueOf(rs));
                }
            }
        });

        bmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent ii=new Intent(getApplicationContext(), MainActivity.class);
                startActivity(ii);

            }
        });



    }
}