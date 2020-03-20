package com.atikur.resultsheet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import yanzhikai.textpath.TextPathView;

public class SplashActivity extends AppCompatActivity {

    private TextPathView mPathView;
    private AppPreferences appPreferences = null;

    private void launchHomeScreen() {


        if (appPreferences.getBoolean(AppPreferences.SPLASH_STATUS) == false) {

            appPreferences.putBoolean(AppPreferences.SPLASH_STATUS, true);
        } else {
            startActivity(new Intent(SplashActivity.this, MainActivity.class));
        }
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        appPreferences = new AppPreferences(this);

        if (!appPreferences.getBoolean(AppPreferences.SPLASH_STATUS) == false) {
            launchHomeScreen();
            finish();
        }

        mPathView = findViewById(R.id.text_pathView);
        mPathView.startAnimation(0, 1);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashActivity.this, MainActivity.class));
                finish();
            }
        }, 4000);
    }
}
