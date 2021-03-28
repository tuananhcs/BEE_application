package com.example.beeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class PaymentDetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_detail);
    }
    public void pay(View view) {

        Toast.makeText(this, "Đang tiến hành liên kết với ví MoMo ", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(PaymentDetail.this, Load.class);
        startActivity(intent);

    }
}