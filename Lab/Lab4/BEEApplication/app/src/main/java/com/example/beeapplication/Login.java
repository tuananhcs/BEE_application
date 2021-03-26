package com.example.beeapplication;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    EditText edtEmail, edtPassword;
    Button btnLogin;
    TextView txtForgot;
    View.OnClickListener myClick = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (view.getId() == R.id.txtForgot) {
                Intent intent = new Intent(Login.this, MainActivity.class);
                startActivity(intent);
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        addControls();
        clickForgotPassword();
    }

    private void clickForgotPassword() {
        txtForgot.setOnClickListener(myClick);
    }

    private void addControls() {
        edtEmail = findViewById(R.id.edtEmail);
        edtPassword = findViewById(R.id.edtPassword);
        btnLogin = findViewById(R.id.btnLogin);
        txtForgot = findViewById(R.id.txtForgot);
    }

    public void login(View view) {
        if (edtEmail.getText().toString().isEmpty()) {
            Toast.makeText(this, "Nhập Email!", Toast.LENGTH_SHORT).show();
        } else if (edtPassword.getText().toString().isEmpty()) {
            Toast.makeText(this, "Nhập Password!", Toast.LENGTH_SHORT).show();
        } else {
            Intent intent = new Intent(Login.this, Load.class);
            startActivity(intent);
        }
    }


}