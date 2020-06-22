package com.example.user.quiznnu;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {
    private final int SPLASH_DISPLAY_LENGTH =500;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(
                new Runnable() {
            @Override
            public void run() {
                startActivity();
            }
        },SPLASH_DISPLAY_LENGTH);
    }
    private void startActivity(){
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
