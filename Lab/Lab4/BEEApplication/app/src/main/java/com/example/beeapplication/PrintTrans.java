package com.example.beeapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class PrintTrans extends AppCompatActivity {
    Spinner spinner;
    SpinnerControl s = new SpinnerControl();
    CheckBox chbox;
    Button btnRegister;
    EditText edtAmount;
    View.OnClickListener myClick = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (chbox.isChecked() && view.getId() == R.id.btnRegister) {

                Intent intent = new Intent(PrintTrans.this, PrintTrans.class);
                startActivity(intent);
            }
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_print_trans);
        addControls();
        addEvents();

    }
    private void addEvents() {
        s.selectCS(PrintTrans.this, spinner);

    }
    private void addControls() {
        spinner = findViewById(R.id.spinner);
        chbox = findViewById(R.id.chbox);
        btnRegister = findViewById(R.id.btnRegister);
        edtAmount = findViewById(R.id.edtAmount);
    }

    public void Register(View view) {
        if (edtAmount.getText().toString().isEmpty()) {
            Toast.makeText(this, "Vui lòng điền số lượng cần in!", Toast.LENGTH_SHORT).show();
        }
        else {
            if (!chbox.isChecked() && view.getId() == R.id.btnRegister) {

                Toast.makeText(this, "Bạn chưa chấp hành quy định!", Toast.LENGTH_SHORT).show();

            }
            if (chbox.isChecked() && view.getId() == R.id.btnRegister) {
                Toast.makeText(this, "Đăng ký thành công!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(PrintTrans.this, Load.class);
                startActivity(intent);
            }
        }
    }

}
