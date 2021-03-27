package com.example.beeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Spinner;

public class Result extends AppCompatActivity {
    Spinner spinner;
    SpinnerControl s=new SpinnerControl();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        addControls();
        addEvents();
    }

    private void addEvents() {
        s.selectHK(Result.this,spinner);

    }

    private void addControls() {
        spinner=findViewById(R.id.spinner);

    }
}