package com.example.beeapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;


public class Subject extends AppCompatActivity {
    Spinner spinner;
    SpinnerControl s = new SpinnerControl();
    ImageView imgBack, imgTTCN, imgHome, imgThongbao;
    View.OnClickListener myClick = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            if (v.equals(imgBack)) {
                finish();
            } else if (v.equals(imgTTCN)) {
                Intent intent = new Intent(Subject.this, Profile.class);
                startActivity(intent);
            } else if (v.equals(imgHome)) {
                Intent intent = new Intent(Subject.this, MainActivity.class);
                startActivity(intent);
                finish();
            } else if (v.equals(imgThongbao)) {
                Intent intent = new Intent(Subject.this, Notification.class);
                startActivity(intent);
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject);
        addControls();
        addEvents();
    }

    private void addEvents() {
        s.selectHK(Subject.this, spinner);

        imgBack.setOnClickListener(myClick);
        imgTTCN.setOnClickListener(myClick);
        imgHome.setOnClickListener(myClick);
        imgThongbao.setOnClickListener(myClick);

    }

    private void addControls() {
        spinner = findViewById(R.id.spinner);

        imgBack = findViewById(R.id.imgBack);
        imgTTCN = findViewById(R.id.imgTTCN);
        imgHome = findViewById(R.id.imgHome);
        imgThongbao = findViewById(R.id.imgThongbao);
    }
}