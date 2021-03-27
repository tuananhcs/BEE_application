package com.example.beeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Subject extends AppCompatActivity {
    Spinner spinner;
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject);
        addControl();
    }

    private void addControl() {
        spinner=findViewById(R.id.spinner);
        adapter=new ArrayAdapter<String>(Subject.this,
                android.R.layout.simple_spinner_item);
        adapter.add("  Học kì 2 2020-2021");
        adapter.add("  Học kì 1 2020-2021");
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
    }
}