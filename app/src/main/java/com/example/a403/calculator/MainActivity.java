package com.example.a403.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText e1, e2;
    Button b1, b2, b3, b4, b5;
    TextView t1;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1 = (EditText)findViewById(R.id.editText);
        e2 = (EditText)findViewById(R.id.editText2);
        t1 = (TextView)findViewById(R.id.textView);
        b1 = (Button) findViewById(R.id.button);
        b2 = (Button) findViewById(R.id.button2);
        b3 = (Button) findViewById(R.id.button3);
        b4 = (Button) findViewById(R.id.button4);
        b5 = (Button) findViewById(R.id.button5);

        b1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (e1.getText().toString().equals("") || e2.getText().toString().equals("")) {
                        Toast.makeText(getApplicationContext(),
                                "값을 입력하세요",
                            Toast.LENGTH_LONG).show();
                    return;
                } else {

                    double num1 = Double.parseDouble(e1.getText().toString());
                    double num2 = Double.parseDouble(e2.getText().toString());
                    double num3 = num1 + num2;

                    t1.setText(num3 + " ");
                }
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (e1.getText().toString().equals("") || e2.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(),
                            "값을 입력하세요",
                            Toast.LENGTH_LONG).show();
                    return;
                } else {

                    double num1 = Double.parseDouble(e1.getText().toString());
                    double num2 = Double.parseDouble(e2.getText().toString());
                    double num3 = num1 - num2;

                    t1.setText(num3 + " ");
                }
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (e1.getText().toString().equals("") || e2.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(),
                            "값을 입력하세요",
                            Toast.LENGTH_LONG).show();
                    return;
                } else {

                    double num1 = Double.parseDouble(e1.getText().toString());
                    double num2 = Double.parseDouble(e2.getText().toString());
                    double num3 = num1 * num2;

                    t1.setText(num3 +  " ");
                }
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (e1.getText().toString().equals("") || e2.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(),
                            "값을 입력하세요",
                            Toast.LENGTH_LONG).show();
                    return;
                } else {

                    double num1 = Double.parseDouble(e1.getText().toString());
                    double num2 = Double.parseDouble(e2.getText().toString());
                    double num3 = num1 / num2;

                    t1.setText(num3 + " ");
                }
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (e1.getText().toString().equals("") || e2.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(),
                            "값을 입력하세요",
                            Toast.LENGTH_LONG).show();
                    return;
                } else if (e1.getText().toString().equals("0")) {
                    Toast.makeText(getApplicationContext(),
                            "0으로 나눌수 없습니다.",
                            Toast.LENGTH_LONG).show();
                    return;
                }else {


                    double num1 = Double.parseDouble(e1.getText().toString());
                    double num2 = Double.parseDouble(e2.getText().toString());
                    double num3 = num1 % num2;

                    t1.setText(num3 + " ");
                }
            }
        });

    }
}
