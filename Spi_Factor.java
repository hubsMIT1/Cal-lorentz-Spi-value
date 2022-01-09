package com.example.converterapp;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.widget.TextView;

import java.sql.Date;
import java.sql.Time;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import  java.lang.Math;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Timer;
import java.util.TimerTask;

public class Spi_Factor extends AppCompatActivity {
    private TextView txtV4;

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spi_factor);
        txtV4 = findViewById(R.id.textView6);
//        timeIntrval(1000);
        DecimalFormat digit2 = new DecimalFormat("0.00000000");

        double t_intrvl = 0;


        final Handler tm = new Handler();
//        final Runnable run1 = new Runnable() {
            tm.postDelayed(new Runnable() {
 private long tim = 0;
                int h1 =0 ;
                long tmf = 0;
                long fac=0;
//int fac += 1;
            @Override
            public void run() {
fac = 1;
                        LocalDateTime now1 = LocalDateTime.now();
//                        DateTimeFormatter time1 = DateTimeFormatter.ofPattern("hh:mm:ss a");

                        DateTimeFormatter sec = DateTimeFormatter.ofPattern("ss");
                        DateTimeFormatter hrs = DateTimeFormatter.ofPattern("hh");
                        DateTimeFormatter min = DateTimeFormatter.ofPattern("mm");

//                        String s = now1.format(time1);
                        int  ts = Integer.parseInt(now1.format(sec));
                         int  th = Integer.parseInt(now1.format(hrs));
                          int  tm1 = Integer.parseInt(now1.format(min));
//                        String  h = (s.substring(0,2));

//                        String m =(s.substring(3,5));
//                        String sec = (s.substring(6,9));
//                       int th = Integer.parseInt(h);
//                int tm1 = Integer.parseInt(m);
//                int ts = Integer.parseInt(s2);

        if( h1 == 0 || th>h1 ){
            for (int i = th; i>= 1; i--){
                fac *= (i);
                tmf = fac;
                h1 = 1;
//                Log.d(" dfasdf ");
            }
        }
        else{
            fac = tmf;
        }
                double spi = fac/(Math.pow(tm1,3) + ts);
                double ans1 = Double.parseDouble(digit2.format(spi));
        txtV4.setText("Spi value = " + ans1  );
//                        txtV4.setText("" + tim + " "+ th + ts +tm1);


                        tm.postDelayed(this,1000);
//
//                txtV4.setText(s.substring(0,2)  +" " + s.substring(3,5)+ " " + s.substring(6,9) );
//
//                        txtV4.setText("timeInterv");
                h1 = th;
            }

//        };
            },1000);
//        tm.postDelayed(run1, 1000);

    }

//    }
}

