package com.wicak.socile;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Timer;
import java.util.TimerTask;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        //Set timer for splash screen timeout
        int timeout = 2000; // make the activity visible for 1.5 seconds
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {

            @Override
            public void run() {
                Intent homepage = new Intent(com.wicak.socile.SplashScreen.this, com.wicak.socile.BottomActivity.class);
                startActivity(homepage);
                finish();
            }
        }, timeout);

    }
}