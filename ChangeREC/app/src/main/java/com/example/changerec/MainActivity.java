package com.example.changerec;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    Button b1, b2, b3;
    int count = 10;
    LinearLayout lay;
    int switchVar = 1;
    String color = "WHITE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(R.id.tvREC);
        b1 = (Button) findViewById(R.id.bFontSize);
        b2 = (Button) findViewById(R.id.bFontColor);
        b3 = (Button) findViewById(R.id.bBgColor);
        lay = (LinearLayout) findViewById(R.id.linearLayout);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count <= 50) {
                    count = count + 5;
                    tv.setTextSize(count);
                } else {
                    count = 10;
                    tv.setTextSize(count);
                }
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tv.getCurrentTextColor() == Color.BLUE){
                    tv.setTextColor(Color.BLACK);
                }
                else if (tv.getCurrentTextColor() == Color.BLACK){
                    tv.setTextColor(Color.RED);
                }
                else if(tv.getCurrentTextColor() == Color.RED){
                    tv.setTextColor(Color.GREEN);
                }
                else if(tv.getCurrentTextColor() == Color.GREEN){
                    tv.setTextColor(Color.BLUE);
                }
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch(switchVar) {

                    case 1:
                        lay.setBackgroundColor(Color.RED);
                        switchVar = switchVar + 1;
                        break;

                    case 2:
                        lay.setBackgroundColor(Color.GREEN);
                        switchVar = switchVar + 1;
                        break;

                    case 3:
                        lay.setBackgroundColor(Color.BLUE);
                        switchVar = switchVar + 1;
                        break;

                    default:
                        switchVar = 1;
                        lay.setBackgroundColor(Color.WHITE);
                }
            }
        });
    }
}