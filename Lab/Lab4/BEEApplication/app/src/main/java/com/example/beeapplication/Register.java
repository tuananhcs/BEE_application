package com.example.beeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Register extends AppCompatActivity {
    ImageView imgBangdiem, imgThesv, imgXacnsv;
    TextView txtBangdiem, txtThesv, txtXacnsv;

    ImageView imgBack, imgTTCN, imgHome, imgThongbao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        addControls();
        addEvents();
    }
    private void addEvents() {

        imgBangdiem.setOnClickListener(myClick);
        imgThesv.setOnClickListener(myClick);
        imgXacnsv.setOnClickListener(myClick);


        txtBangdiem.setOnClickListener(myClick);
        txtThesv.setOnClickListener(myClick);
        txtXacnsv.setOnClickListener(myClick);

        imgBack.setOnClickListener(myClick);
        imgTTCN.setOnClickListener(myClick);
        imgHome.setOnClickListener(myClick);
        imgThongbao.setOnClickListener(myClick);

    }

    private void addControls() {
        imgBangdiem = findViewById(R.id.imgBangdiem);
        imgThesv = findViewById(R.id.imgThesv);
        imgXacnsv = findViewById(R.id.imgXacnsv);


        txtBangdiem = findViewById(R.id.txtBangdiem);
        txtThesv = findViewById(R.id.txtThesv);
        txtXacnsv = findViewById(R.id.txtXacnsv);

        imgBack = findViewById(R.id.imgBack);
        imgTTCN = findViewById(R.id.imgTTCN);
        imgHome = findViewById(R.id.imgHome);
        imgThongbao=findViewById(R.id.imgThongbao);
    }
    View.OnClickListener myClick = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            int id = view.getId();
             if (id == R.id.imgBangdiem || id == R.id.txtBangdiem) {
                Intent intent = new Intent(Register.this, PrintTrans.class);
                startActivity(intent);
            } else if (id == R.id.imgThesv || id == R.id.txtThesv) {
                Intent intent = new Intent(Register.this, PrintIDCard.class);
                startActivity(intent);
            } else if (id == R.id.imgXacnsv || id == R.id.txtXacnsv) {
                Intent intent = new Intent(Register.this, PrintCerf.class);
                startActivity(intent);
            }else if (view.equals(imgBack)) {
                 finish();
             } else if (view.equals(imgTTCN)) {
                 Intent intent = new Intent(Register.this, Profile.class);
                 startActivity(intent);
             } else if (view.equals(imgHome)) {
                 Intent intent = new Intent(Register.this, MainActivity.class);
                 startActivity(intent);
                 finish();
             }else if(view.equals(imgThongbao)){
                 Intent intent = new Intent(Register.this, Notification.class);
                 startActivity(intent);
             }
        }
    };
}