package com.example.converterapp;

import androidx.appcompat.app.AppCompatActivity;
import java.lang.Math;
import java.text.DecimalFormat;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Lorentz_ans extends AppCompatActivity {

    private EditText edttxt;
    private Button btnl1;
    private TextView txtV1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lorentz_ans);

        btnl1 = findViewById(R.id.button4);
        edttxt = findViewById(R.id.editTextNumber);
        txtV1 = findViewById(R.id.textView2);

        btnl1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double c = 3 * (Math.pow(10, 8));
                double n1 = Double.parseDouble(edttxt.getText().toString());
                double d1 = Math.pow(1 - (Math.pow(n1 / c, 2)), 0.5);
                double ans = 1 / d1;
                DecimalFormat digit2 = new DecimalFormat("0.000000");
                // double an1 = digit2.format(ans);
                // digit2.setMaximumFractionDigits(3);
                if (d1 != 0) {
                    txtV1.setText(digit2.format(ans));
                } else if (n1 >= c) {
                    txtV1.setText("Enter a valid value of v!");
                }

            }
        });
    }
}