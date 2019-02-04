package com.example.fffru.game;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

public class Game extends View {
    public float corX = 500;
    public float corY = 400;
    public float startX = 0;
    public float startY = 510;
    public float stopX = 5000;
    public float stopY = 510;


    public Game(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Game(Context context) {
        super(context);
    }

    void move(){
        corX += 2;
        corY += 0;
        try {
            Thread.sleep(50);
            Log.d("Фиксирую полет","Так точно");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint1 = new Paint();
        paint1.setColor(Color.BLUE);
        paint1.setStrokeWidth(10);
        canvas.drawCircle(corX,corY,100, paint1);
        Paint paint2 = new Paint();
        paint2.setColor(Color.BLACK);
        paint2.setStrokeWidth(30);
        canvas.drawLine(startX, startY, stopX, stopY, paint2);
        Paint paint3 = new Paint();
        paint3.setColor(Color.GREEN);
        paint3.setStrokeWidth(10);
        canvas.drawCircle(corX,corY,50, paint3);




    }
}
