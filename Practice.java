package com.example.converterapp;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;
import  java.lang.Math;
import java.util.Random;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Practice extends AppCompatActivity {
    private EditText edttxt2;
    private Button btnl2;
    private TextView txtV2;
    private TextView txtV3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice);
        txtV3 = findViewById(R.id.textView5);
         Random v = new Random();
         int v2 = v.nextInt(300000000);
        double c = 3 * (Math.pow(10,8));
        double d1 = Math.pow(1- (Math.pow(v2/c,2)),0.5);
        double  ans = 1/ d1;
//        float an1 =
        DecimalFormat digit2 = new DecimalFormat("0.000");
        double ans1 = Double.parseDouble(digit2.format(ans));
//
         txtV2 = findViewById(R.id.textView3);
         txtV2.setText("find Lorentz value for v = "+v2);

         edttxt2 = findViewById(R.id.editTextNumberDecimal);

//         txtV3.setText(""+ss);
//         double v3 = Double.parseDouble(digit2.format());
         btnl2 = findViewById(R.id.button5);
         btnl2.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 String ss = edttxt2.getText().toString();
             if((TextUtils.isEmpty(ss)==false)){
                 double vVal = Double.parseDouble((ss));
                 double v3 = Double.parseDouble(digit2.format(vVal));

                 if(v3 == ans1){
                     txtV3.setText("Wow your ans is write. \n \n  L = "+ v3);
                     int v2 = v.nextInt(300000000);
                     txtV2.setText("find Lorentz value for v = "+v2);
                 }
                 else if(v3 != ans1){
                     txtV3.setText("Sorry your answer is wrong. \n \n The right answer is : "+ans1);

                 }

             }
             else{
                 txtV3.setText(("Please write your answer!"));
             }

//                 else{
//                     txt.
//                 }
//                 if(vVal==)
             }
         });
//
//




    }
}