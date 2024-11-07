package com.example.calapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button basic, cal;
    TextView result,normal;
    EditText weight,height;

    Float Weight;
    Float Height,rs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        basic=findViewById(R.id.btnGoBasic);
        cal=findViewById(R.id.btnCal);
        result=findViewById(R.id.txtResult);
        normal=findViewById(R.id.txtNormal);
        weight=findViewById(R.id.txtWeight);
        height=findViewById(R.id.txtHeight);

        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                if (weight.getText().toString().equals("") && height.getText().toString().equals("")) {
                    Toast.makeText(MainActivity.this, "Enter your Weight and Height", Toast.LENGTH_SHORT).show();
                }
                else if (weight.getText().toString().equals("")) {
                    Toast.makeText(MainActivity.this, "Enter your Weight", Toast.LENGTH_SHORT).show();
                } else if (height.getText().toString().equals("")) {
                    Toast.makeText(MainActivity.this, "Enter your Height", Toast.LENGTH_SHORT).show();
                } else
                {
                    Weight=Float.parseFloat(weight.getText().toString());
                    Height=Float.parseFloat(height.getText().toString());

                    rs=Weight/(Height*Height);

                    result.setText(String.valueOf(rs));

                    if (rs>=36){
                        normal.setText("Fat");
                    } else if (rs<18) {
                        normal.setText("Thin");
                    }
                    else {
                        normal.setText("Normal");
                    }
                }




            }
        });

        basic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(getApplicationContext(), BasicCal.class);
                startActivity(i);
            }
        });
    }
}