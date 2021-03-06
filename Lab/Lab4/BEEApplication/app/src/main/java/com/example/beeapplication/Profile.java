package com.example.beeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Profile extends AppCompatActivity {
    ImageView imgTTCN, imgHome, imgThongbao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        addControls();
        addEvents();
    }

    private void addEvents() {
        imgTTCN.setOnClickListener(myClick);
        imgHome.setOnClickListener(myClick);
        imgThongbao.setOnClickListener(myClick);

    }

    private void addControls() {
        imgTTCN = findViewById(R.id.imgTTCN);
        imgHome = findViewById(R.id.imgHome);
        imgThongbao=findViewById(R.id.imgThongbao);
    }


    View.OnClickListener myClick = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            if (v.equals(imgHome)) {
                Intent intent = new Intent(Profile.this, MainActivity.class);
                startActivity(intent);
                finish();
            }else if(v.equals(imgThongbao)){
                Intent intent = new Intent(Profile.this, Notification.class);
                startActivity(intent);
            }
        }
    };
}