package com.kailas.views;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MySpinner extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner_demo);
//        String[] country = {"India", "USA", "China", "Japan", "Other"};

        ArrayList<String> country = new ArrayList<>();
        country.add("India");
        country.add("UK");
        country.add("India");
        country.add("UK");
        country.add("India");
        country.add("UK");
        country.add("India");
        country.add("UK");



        Spinner spinner = findViewById(R.id.spinner);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, country);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(arrayAdapter);
    }
}