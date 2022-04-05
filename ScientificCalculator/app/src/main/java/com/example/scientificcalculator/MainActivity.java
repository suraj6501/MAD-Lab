package com.example.scientificcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button add, sub, mul, div, sin, cos, tan, pow, sqrt, mod, log, ln, clear, bksp, equals, one, two, three, four, five, six, seven, eight, nine, zero;
    TextView result;
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}