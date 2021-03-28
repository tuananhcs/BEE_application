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

    }

    private void addControls() {
        imgBangdiem = findViewById(R.id.imgBangdiem);
        imgThesv = findViewById(R.id.imgThesv);
        imgXacnsv = findViewById(R.id.imgXacnsv);


        txtBangdiem = findViewById(R.id.txtBangdiem);
        txtThesv = findViewById(R.id.txtThesv);
        txtXacnsv = findViewById(R.id.txtXacnsv);
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
            }
        }
    };
}