package com.example.beeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class Subject extends AppCompatActivity {
    Spinner spinner;
    SpinnerControl s=new SpinnerControl();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject);
        addControls();
        addEvents();
    }

    private void addEvents() {
        s.selectHK(Subject.this,spinner);

    }

    private void addControls() {
        spinner=findViewById(R.id.spinner);

    }
}