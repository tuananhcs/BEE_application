package com.example.beeapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class PrintCerf extends AppCompatActivity{
    Spinner spinner_when, spinner_why, spinner_where;
    SpinnerControl s = new SpinnerControl();
    CheckBox chbox;
    Button btnRegister;

    View.OnClickListener myClick = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (chbox.isChecked() && view.getId() == R.id.btnRegister) {

                Intent intent = new Intent(PrintCerf.this, Load.class);
                startActivity(intent);
            }
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_print_cerf);
        addControls();
        addEvents();

    }
    private void addEvents() {
        s.selectHK(PrintCerf.this, spinner_when);
        s.selectWhy(PrintCerf.this,spinner_why);
        s.selectCS(PrintCerf.this,spinner_where);

    }
    private void addControls() {
        spinner_when = findViewById(R.id.spinner_when);
        spinner_where =findViewById(R.id.spinner_where);
        spinner_why = findViewById(R.id.spinner_why);
        chbox = findViewById(R.id.chbox);
        btnRegister = findViewById(R.id.btnRegister);

    }

    public void Register(View view) {

            if (!chbox.isChecked() && view.getId() == R.id.btnRegister) {

                Toast.makeText(this, "Bạn chưa chấp hành quy định!", Toast.LENGTH_SHORT).show();

            }
            if (chbox.isChecked() && view.getId() == R.id.btnRegister) {
                Toast.makeText(this, "Đăng ký thành công!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(PrintCerf.this, Load.class);
                startActivity(intent);
            }
        }
}


