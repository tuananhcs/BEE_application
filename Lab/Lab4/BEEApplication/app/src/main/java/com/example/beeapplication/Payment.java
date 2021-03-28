package com.example.beeapplication;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;
import android.widget.TableLayout;


public class Payment extends AppCompatActivity{
    Spinner spinner,spinner1;
    SpinnerControl s=new SpinnerControl();

    TableLayout tblout19_20_1, tblout18_19_1, tblout18_19_2;
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
        tblout18_19_1.setOnClickListener(myClick);
        tblout18_19_2.setOnClickListener(myClick);
        tblout19_20_1.setOnClickListener(myClick);
    }

    private void addControls() {
        spinner=findViewById(R.id.spinner);
        spinner1=findViewById(R.id.spinner_pm);
        tblout19_20_1 = findViewById(R.id.tthpki1_19_20);
        tblout18_19_2 = findViewById(R.id.tthpki2_18_19);
        tblout18_19_1 = findViewById(R.id.tthpki1_18_19);
    }
    View.OnClickListener myClick = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            int id = view.getId();
            if (id == R.id.tthpki1_18_19 || id == R.id.tthpki2_18_19 || id == R.id.tthpki1_19_20) {
                Intent intent = new Intent(Payment.this, PaymentDetail.class);
                startActivity(intent);
            }
        }
    };

}