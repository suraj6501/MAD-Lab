package com.example.simplecalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button add, sub, mul, div;
    EditText n1, n2;
    TextView result;
    float f1, f2, res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        add = (Button) findViewById(R.id.add);
        sub = (Button) findViewById(R.id.sub);
        mul = (Button) findViewById(R.id.mul);
        div = (Button) findViewById(R.id.div);
        n1 = (EditText) findViewById(R.id.firstNo);
        n2 = (EditText) findViewById(R.id.secondNo);
        result = (TextView) findViewById(R.id.result);

        add.setOnClickListener(this);
        sub.setOnClickListener(this);
        mul.setOnClickListener(this);
        div.setOnClickListener(this);
    }

    @Override
    public void onClick(View view){
        f1 = Float.parseFloat(n1.getText().toString());
        f2 = Float.parseFloat(n2.getText().toString());

        if(view == add){
            res = f1 + f2;
            result.setText(""+ res);
        }
        if(view == sub){
            res = f1 - f2;
            result.setText(""+ res);
        }
        if(view == mul){
            res = f1 * f2;
            result.setText(""+ res);
        }
        if(view == div){
            res = f1 / f2;
            result.setText(""+ res);
        }
    }
}