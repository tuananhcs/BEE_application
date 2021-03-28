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

import java.util.ArrayList;


public class Payment extends AppCompatActivity{
    Spinner spinner,spinner1;
    SpinnerControl s=new SpinnerControl();

    TableLayout tblout19_20_1, tblout18_19_1, tblout18_19_2;
    ImageView imgBack, imgTTCN, imgHome, imgThongbao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
        addControls();
        addEvents();
    }

    private void addEvents() {
        s.selectHK(Payment.this,spinner);
        String []status={"  Tất cả","  Đã thanh toán","  Chưa thanh toán"};
        s.select(Payment.this,spinner1,status);
        tblout18_19_1.setOnClickListener(myClick);
        tblout18_19_2.setOnClickListener(myClick);
        tblout19_20_1.setOnClickListener(myClick);

        imgBack.setOnClickListener(myClick);
        imgTTCN.setOnClickListener(myClick);
        imgHome.setOnClickListener(myClick);
        imgThongbao.setOnClickListener(myClick);
    }

    private void addControls() {
        spinner=findViewById(R.id.spinner);
        spinner1=findViewById(R.id.spinner_pm);
        tblout19_20_1 = findViewById(R.id.tthpki1_19_20);
        tblout18_19_2 = findViewById(R.id.tthpki2_18_19);
        tblout18_19_1 = findViewById(R.id.tthpki1_18_19);

        imgBack = findViewById(R.id.imgBack);
        imgTTCN = findViewById(R.id.imgTTCN);
        imgHome = findViewById(R.id.imgHome);
        imgThongbao=findViewById(R.id.imgThongbao);
    }
    View.OnClickListener myClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int id = v.getId();
            if (id == R.id.tthpki1_18_19 || id == R.id.tthpki2_18_19 || id == R.id.tthpki1_19_20) {
                Intent intent = new Intent(Payment.this, PaymentDetail.class);
                startActivity(intent);
            }else if (v.equals(imgBack)) {
                finish();
            } else if (v.equals(imgTTCN)) {
                Intent intent = new Intent(Payment.this, Profile.class);
                startActivity(intent);
            } else if (v.equals(imgHome)) {
                Intent intent = new Intent(Payment.this, MainActivity.class);
                startActivity(intent);
                finish();
            }else if(v.equals(imgThongbao)){
                Intent intent = new Intent(Payment.this, Notification.class);
                startActivity(intent);
            }
        }
    };

}