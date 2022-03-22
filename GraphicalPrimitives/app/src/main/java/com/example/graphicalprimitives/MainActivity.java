package com.example.graphicalprimitives;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        SampleCanvas sc = new SampleCanvas(this);
        setContentView(sc);
    }
    private class SampleCanvas extends View {
        public SampleCanvas (Context context) {
            super(context);
        }
        @Override
        protected void onDraw(Canvas canvas) {
            //super.onDraw(canvas);
            Paint paint = new Paint();
            Paint obj = new Paint();
            Paint t = new Paint();
            paint.setColor(Color.YELLOW);
            canvas.drawPaint(paint);
            obj.setColor(Color.GRAY);
            t.setColor(Color.BLACK);
            t.setTextSize(48f);
            canvas.drawText("Circle", 140, 150, t);
            canvas.drawCircle(200, 350, 150, obj);

            canvas.drawText("Rectangle", 420, 150, t);
            canvas.drawRect(400, 200, 650, 700, obj);

            canvas.drawText("Square", 120, 800, t);
            canvas.drawRect(50, 850, 350, 1150, obj);

            canvas.drawText("Line", 480, 800, t);
            canvas.drawLine(520,850,520,1150,obj);
        }
    }
}