package com.example.beeapplication;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.widget.Spinner;


public class Payment extends AppCompatActivity{
    Spinner spinner,spinner1;
    SpinnerControl s=new SpinnerControl();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
        addControls();
        addEvents();
    }

    private void addEvents() {
        s.selectHK(Payment.this,spinner);
        s.selectStatus(Payment.this,spinner1);
    }

    private void addControls() {
        spinner=findViewById(R.id.spinner);
        spinner1=findViewById(R.id.spinner1);
    }

}