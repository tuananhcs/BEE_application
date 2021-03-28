package com.example.beeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ForgotPassword extends AppCompatActivity {
    EditText edtEmail;
    //Button btnGetPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);
        addControls();
    }

    private void addControls() {
        edtEmail=findViewById(R.id.edtEmail);
        //btnGetPassword=findViewById(R.id.btnGetPassword);
    }

    public void getPassword(View view) {
        String s = edtEmail.getText().toString();

        if (!s.isEmpty()) {
            Toast.makeText(this, "Email sẽ được gửi đến " + s, Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this, "Nhập Email!", Toast.LENGTH_SHORT).show();
        }
    }

    public void backLogin(View view) {
        finish();
    }
}