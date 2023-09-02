package com.kailas.views;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MyAutoCompleteText extends AppCompatActivity {
    AutoCompleteTextView autoCompleteTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_auto_complete_text);
        autoCompleteTextView = findViewById(R.id.autoCompleteTextView);

        ArrayList<String> countries = new ArrayList<String>();
        countries.add("India");
        countries.add("Japan");
        countries.add("UK");
        countries.add("US");

        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, countries);
        autoCompleteTextView.setAdapter(itemsAdapter);
    }
}