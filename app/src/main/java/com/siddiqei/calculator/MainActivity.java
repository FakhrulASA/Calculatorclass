package com.siddiqei.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText n1, n2;
    TextView s1;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n1=findViewById(R.id.num1);
        n2=findViewById(R.id.num2);
        s1=findViewById(R.id.sum);
        b1=findViewById(R.id.add);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               String number1=  n1.getText().toString();
               String number2= n2.getText().toString();
               int sum= Integer.parseInt(number1)+Integer.parseInt(number2);
               s1.setText(String.valueOf(sum));
            }
        });

    }
}