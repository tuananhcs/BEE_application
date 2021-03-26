package com.example.beeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

public class Load extends AppCompatActivity {
    Handler handler = new Handler(Looper.myLooper());

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_load);
        handler.postDelayed(runnable, 1500);
    }
    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            Intent intent = new Intent(Load.this, MainActivity.class);
            startActivity(intent);
        }
    };

}