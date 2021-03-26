package com.example.beeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageView imgTKB, imgLichthi, imgBangdiem, imgDK, imgMonhoc, imgThanhtoan, imgLienhe;
    ImageView imgTTCN, imgThongbao, imgLogout;
    TextView txtTKB, txtLichthi, txtBangdiem, txtDK, txtMonhoc, txtThanhtoan, txtLienhe;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();
        addEvents();
    }

    private void addEvents() {
        imgTKB.setOnClickListener(myClick);
        imgBangdiem.setOnClickListener(myClick);
        imgDK.setOnClickListener(myClick);
        imgMonhoc.setOnClickListener(myClick);
        imgThanhtoan.setOnClickListener(myClick);
        imgLienhe.setOnClickListener(myClick);
        imgLichthi.setOnClickListener(myClick);

        imgTTCN.setOnClickListener(myClick);
        imgThongbao.setOnClickListener(myClick);
        imgLogout.setOnClickListener(myClick);

        txtTKB.setOnClickListener(myClick);
        txtBangdiem.setOnClickListener(myClick);
        txtDK.setOnClickListener(myClick);
        txtMonhoc.setOnClickListener(myClick);
        txtThanhtoan.setOnClickListener(myClick);
        txtLienhe.setOnClickListener(myClick);
        txtLichthi.setOnClickListener(myClick);

    }

    private void addControls() {
        imgBangdiem = findViewById(R.id.imgBangdiem);
        imgDK = findViewById(R.id.imgDK);
        imgTKB = findViewById(R.id.imgTKB);
        imgLichthi = findViewById(R.id.imgLichthi);
        imgMonhoc = findViewById(R.id.imgMonhoc);
        imgThanhtoan = findViewById(R.id.imgThanhtoan);
        imgLienhe = findViewById(R.id.imgLienhe);

        imgTTCN = findViewById(R.id.imgTTCN);
        imgThongbao = findViewById(R.id.imgThongbao);
        imgLogout=findViewById(R.id.imgLogout);

        txtBangdiem = findViewById(R.id.txtBangdiem);
        txtDK = findViewById(R.id.txtDK);
        txtTKB = findViewById(R.id.txtTKB);
        txtLichthi = findViewById(R.id.txtLichthi);
        txtMonhoc = findViewById(R.id.txtMonhoc);
        txtThanhtoan = findViewById(R.id.txtThanhtoan);
        txtLienhe=findViewById(R.id.txtLienhe);
    }
    View.OnClickListener myClick = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            int id = view.getId();
            if (id == R.id.imgTKB || id == R.id.txtTKB) {
                Intent intent = new Intent(MainActivity.this, Timetable.class);
                startActivity(intent);
            } else if (id == R.id.imgLichthi || id == R.id.txtLichthi) {
                Intent intent = new Intent(MainActivity.this, ExamSchedule.class);
                startActivity(intent);
            } else if (id == R.id.imgBangdiem || id == R.id.txtBangdiem) {
                Intent intent = new Intent(MainActivity.this, Result.class);
                startActivity(intent);
            } else if (id == R.id.imgDK || id == R.id.txtDK) {
                Intent intent = new Intent(MainActivity.this, Register.class);
                startActivity(intent);
            } else if (id == R.id.imgMonhoc || id == R.id.txtMonhoc) {
                Intent intent = new Intent(MainActivity.this, Subject.class);
                startActivity(intent);
            } else if (id == R.id.imgThanhtoan || id == R.id.txtThanhtoan) {
                Intent intent = new Intent(MainActivity.this, Payment.class);
                startActivity(intent);
            } else if (id == R.id.imgLienhe || id == R.id.txtLienhe) {
                Intent intent = new Intent(MainActivity.this, Contact.class);
                startActivity(intent);
            } else if (id == R.id.imgTTCN) {
                Intent intent = new Intent(MainActivity.this, Profile.class);
                startActivity(intent);
            } else if (id == R.id.imgThongbao) {
                Intent intent = new Intent(MainActivity.this, Notification.class);
                startActivity(intent);
            }else if(id==R.id.imgLogout){
                Intent intent = new Intent(MainActivity.this, Login.class);
                startActivity(intent);
            }
        }
    };
}