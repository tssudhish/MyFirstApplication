package com.example.tssudhish.myfirstapplication;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.AnimationDrawable;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

import java.util.Timer;
import java.util.TimerTask;

public class SplashScreen extends AppCompatActivity {

    private long splashDelay = 11000; //5 seconds

    private ImageView imgSplashView;
    private Bitmap bitmapImage;
    private int intTransitionResource;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_splash_screen);

        imgSplashView = (ImageView) findViewById(R.id.splashImageView);
        intTransitionResource = R.drawable.trans;

        if (imgSplashView != null) {
            imgSplashView.setBackgroundResource(intTransitionResource);

            AnimationDrawable splashAnimation = (AnimationDrawable) imgSplashView.getBackground();
            splashAnimation.start();
        }

        TimerTask task = new TimerTask()
        {

            @Override
            public void run() {
                finish();
                Intent mainIntent = new Intent().setClass(SplashScreen.this, MainActivity.class);
                startActivity(mainIntent);
            }

        };

        Timer timer = new Timer();
        timer.schedule(task, splashDelay);


    }
}
