package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        EditText e1 = (EditText) findViewById(R.id.edittext1);
        Double a = Double.parseDouble(e1.getText().toString());

        EditText e2 = (EditText) findViewById(R.id.edittext2);
        Double b = Double.parseDouble(e2.getText().toString());

        Button button1= (Button) findViewById(R.id.add);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double c = a+b;
                TextView t = (TextView) findViewById(R.id.textView1);
                t.setText("" + c);
            }
        });

        Button button2= (Button) findViewById(R.id.sub);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double c = a-b;
                TextView t = (TextView) findViewById(R.id.textView1);
                t.setText("" + c);
            }
        });

        Button button3= (Button) findViewById(R.id.mul);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double c = a*b;
                TextView t = (TextView) findViewById(R.id.textView1);
                t.setText("" + c);
            }
        });

        Button button4= (Button) findViewById(R.id.div);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double c = a/b;
                TextView t = (TextView) findViewById(R.id.textView1);
                t.setText("" + c);
            }
        });
    }
}