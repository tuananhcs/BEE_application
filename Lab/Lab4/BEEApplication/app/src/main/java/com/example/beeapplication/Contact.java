package com.example.beeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Contact extends AppCompatActivity {
    ImageView imgBack, imgTTCN, imgHome, imgThongbao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
        addControls();
        addEvents();
    }

    private void addEvents() {
        imgBack.setOnClickListener(myClick);
        imgTTCN.setOnClickListener(myClick);
        imgHome.setOnClickListener(myClick);
        imgThongbao.setOnClickListener(myClick);

    }

    private void addControls() {
        imgBack = findViewById(R.id.imgBack);
        imgTTCN = findViewById(R.id.imgTTCN);
        imgHome = findViewById(R.id.imgHome);
        imgThongbao=findViewById(R.id.imgThongbao);
    }


    View.OnClickListener myClick = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            if (v.equals(imgBack)) {
                finish();
            } else if (v.equals(imgTTCN)) {
                Intent intent = new Intent(Contact.this, Profile.class);
                startActivity(intent);
            } else if (v.equals(imgHome)) {
                Intent intent = new Intent(Contact.this, MainActivity.class);
                startActivity(intent);
                finish();
            }else if(v.equals(imgThongbao)){
                Intent intent = new Intent(Contact.this, Notification.class);
                startActivity(intent);
            }
        }
    };
}