package com.example.week2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class ExamResult extends AppCompatActivity {
    Spinner spinner;
    ArrayAdapter<String> adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam_result);
        addControl();
    }

    private void addControl() {
        spinner=findViewById(R.id.spinner);
        adapter=new ArrayAdapter<String>(ExamResult.this,
                android.R.layout.simple_spinner_item);
        adapter.add("Final Exam");
        adapter.add("Midterm Exam");
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
    }


}