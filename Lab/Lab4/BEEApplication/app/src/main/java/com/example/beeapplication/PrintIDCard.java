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

public class PrintIDCard extends AppCompatActivity{

    Spinner spinner_when, spinner_where;
    SpinnerControl s = new SpinnerControl();
    Button btnRegister;
    EditText edtName, edtBirth, edtMssv, edtHome, edtForm, edtGrade, edtFaculty;

    View.OnClickListener myClick = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if ( view.getId() == R.id.btnRegister) {

                Intent intent = new Intent(PrintIDCard.this, Load.class);
                startActivity(intent);
            }
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_print_idcard);
        addControls();
        addEvents();
    }

    private void addEvents() {
        s.selectHK(PrintIDCard.this, spinner_when);
        s.selectCS(PrintIDCard.this,spinner_where);

    }
    private void addControls() {
        spinner_when    = findViewById(R.id.spinner_when);
        spinner_where   =findViewById(R.id.spinner_where);

        btnRegister = findViewById(R.id.btnRegister);

        edtBirth    = findViewById(R.id.edtBirth);
        edtName     = findViewById(R.id.edtName);
        edtFaculty  = findViewById(R.id.edtFaculty);
        edtForm     = findViewById(R.id.edtForm);
        edtHome     = findViewById(R.id.edtHome);
        edtMssv     = findViewById(R.id.edtMssv);
        edtGrade    = findViewById(R.id.edtGrade);

    }

    public void Register(View view) {
        if ((edtName.getText().toString().isEmpty() || edtFaculty.getText().toString().isEmpty() || edtFaculty.getText().toString().isEmpty() || edtHome.getText().toString().isEmpty() ||
        edtBirth.getText().toString().isEmpty() || edtMssv.getText().toString().isEmpty() || edtForm.getText().toString().isEmpty()) && view.getId() == R.id.btnRegister)
        {
            Toast.makeText(this, "Vui lòng nhập đầy đủ thông tin!", Toast.LENGTH_SHORT).show();
        }
        else{
                Toast.makeText(this, "Đăng ký thành công!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(PrintIDCard.this, Load.class);
                startActivity(intent);

        }
    }
}
