package com.example.beeapplication;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class SpinnerControl {
    Spinner spinner;
    ArrayAdapter<String> adapter;

    protected void selectHK(Context c, Spinner s) {
        spinner = s;
        adapter = new ArrayAdapter<String>(c,
                android.R.layout.simple_spinner_item);
        adapter.add("  Học kì 2 2020-2021");
        adapter.add("  Học kì 1 2020-2021");
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                ((TextView) parent.getChildAt(0)).setTextColor(Color.WHITE);
                ((TextView) parent.getChildAt(0)).setTextSize(15);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    protected void selectStatus(Context c, Spinner s) {
        spinner = s;
        adapter = new ArrayAdapter<String>(c,
                android.R.layout.simple_spinner_item);
        adapter.add("  Tất cả");
        adapter.add("  Chưa thanh toán");
        adapter.add("  Đã thanh toán");
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                ((TextView) parent.getChildAt(0)).setTextColor(Color.WHITE);
                ((TextView) parent.getChildAt(0)).setTextSize(15);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
