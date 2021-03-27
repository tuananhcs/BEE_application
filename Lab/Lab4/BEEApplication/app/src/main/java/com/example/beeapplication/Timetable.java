package com.example.beeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Timetable extends AppCompatActivity {
    Spinner spinner;
    SpinnerControl s=new SpinnerControl();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timetable);
        addControls();
        addEvents();

        Spinner mySpinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(Timetable.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.names));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner.setAdapter(myAdapter);
    }

    private void addEvents() {
        s.selectHK(Timetable.this,spinner);

    }

    private void addControls() {
        spinner=findViewById(R.id.spinner);

    }
}