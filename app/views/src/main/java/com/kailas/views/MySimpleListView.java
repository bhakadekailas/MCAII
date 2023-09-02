package com.kailas.views;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MySimpleListView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_list_view);

        ArrayList<String> items = new ArrayList<String>();
        items.add("Android");
        items.add("Java");
        items.add("Kotlin");
        items.add("Android");
        items.add("Java");
        items.add("Kotlin");
        items.add("Android");
        items.add("Java");
        items.add("Kotlin");
        items.add("Android");
        items.add("Java");
        items.add("Kotlin");
        items.add("Android");
        items.add("Java");
        items.add("Kotlin");

        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items);
        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(itemsAdapter);
    }
}