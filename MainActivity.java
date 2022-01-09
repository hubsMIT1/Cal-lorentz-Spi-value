package com.example.converterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {

    private Button btn1;
    private Button btb2;
    private Button btn3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.button);

//        btn1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
////                        Intent intent1 = new Intent(this,Lorentz_ans.class);
////        startActivity(intent1);
//            }
//        });
    }

    public void openLorentz(View v) {
        Toast.makeText(this, "Lorentz Value", Toast.LENGTH_SHORT).show();
        Intent intent1 = new Intent(this,Lorentz_ans.class);
        startActivity(intent1);

    }

    public void openPractice(View v){
        Intent intent2 = new Intent(this,Practice.class);
        startActivity(intent2);


    }
    public void openSpi(View v){
        Intent intent3 = new Intent(this,Spi_Factor.class);
        startActivity(intent3);


    }


}