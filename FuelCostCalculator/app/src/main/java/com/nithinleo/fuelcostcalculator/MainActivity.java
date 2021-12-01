package com.nithinleo.fuelcostcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText num1;
    private EditText num2;
    private EditText num3;
    private Button button1;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.editTextNumberDecimal);
        num2 = findViewById(R.id.editTextNumberDecimal2);
        num3 = findViewById(R.id.editTextNumberDecimal3);
        button1 = findViewById(R.id.button);
        tv1 = findViewById(R.id.textView4);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this,"Success!!",Toast.LENGTH_SHORT).show();
                String a = num1.getText().toString();
                float aa = Float.parseFloat(a);
                String b = num2.getText().toString();
                float bb = Float.parseFloat(b);
                String c = num3.getText().toString();
                float cc = Float.parseFloat(c);

                float result = (bb/aa)*cc;
                tv1.setText("Fuel Cost is : "+result+"/-");
            }
        });

    }
}