package com.example.fffru.game;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    Game g;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        g = new Game(this);
        setContentView(g);
        new Thread() {
            @Override
            public void run() {
                super.run();
                while (true) {
                    g.move();
                    g.invalidate();
                }
            }
        }.start();


    }
}
