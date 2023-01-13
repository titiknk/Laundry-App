package com.titikhofifa.laundryapp;

import static java.time.LocalDateTime.now;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.window.SplashScreen;

import java.time.LocalDateTime;

@RequiresApi(api = Build.VERSION_CODES.O)
public class ActivitySplash extends AppCompatActivity {

    private LocalDateTime waktu = now();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(decorView.SYSTEM_UI_FLAG_FULLSCREEN);

        if (getSupportActionBar() != null){
            getActionBar().hide();
        }
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = null;
                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
                    intent = new Intent(ActivitySplash.this, MainActivity.class);
                }
                startActivity(intent);
                finish();
            }
        },1850);
    }

    @Override
    public void onStart(){
        super.onStart();
        Log.d("SplashScreen onStart: ", String.valueOf(waktu));
    }
    @Override
    public void onStop(){
        super.onStop();
        Log.d("SplashScreen onStop: ", String.valueOf(waktu));
    }
}