package com.example.securityapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv1, tv2;
    Button b1, b2, b3;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1 = (TextView) findViewById(R.id.tvTitle);
        tv2 = (TextView) findViewById(R.id.tvCount);
        b1 = (Button) findViewById(R.id.btIn);
        b2 = (Button) findViewById(R.id.btOut);
        b3 = (Button) findViewById(R.id.btReset);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count = count + 1;
                tv2.setText("" + count);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count = count - 1;
                tv2.setText("" + count);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count = 0;
                tv2.setText("" + count);
            }
        });
    }
}