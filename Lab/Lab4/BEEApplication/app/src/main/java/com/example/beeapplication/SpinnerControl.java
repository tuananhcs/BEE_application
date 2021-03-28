package com.example.beeapplication;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

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
    
    protected void select(Context c, Spinner s, String []a) {
        spinner = s;
        adapter = new ArrayAdapter<String>(c,
                android.R.layout.simple_spinner_item,
                a);
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

    protected void selectCS(Context c, Spinner s) {
        spinner = s;
        adapter = new ArrayAdapter<String>(c,
                android.R.layout.simple_spinner_item);
        adapter.add("  Chọn nơi nhận kết quả");
        adapter.add("  Cơ sở 1 - Dĩ An");
        adapter.add("  Cơ sở 2 - Quận 10");
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
    protected void selectWhy(Context c, Spinner s) {
        spinner = s;
        adapter = new ArrayAdapter<String>(c,
                android.R.layout.simple_spinner_item);
        adapter.add("  ...");
        adapter.add("  Xin học bổng");
        adapter.add("  Du học");
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
