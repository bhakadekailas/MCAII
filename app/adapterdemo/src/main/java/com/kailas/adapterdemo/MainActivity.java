package com.kailas.adapterdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.kailas.adapterdemo.arrayAdapter.MovieListActivity;
import com.kailas.adapterdemo.baseAdapter.CountryListActivity;
import com.kailas.adapterdemo.photoGalleryUsingAdapter.CollegeGridActivity;

public class MainActivity extends AppCompatActivity {
    Button buttonBaseAdapter, buttonArrayAdapter, buttonPhotoGalleryUsingAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonBaseAdapter = findViewById(R.id.buttonBaseAdapter);
        buttonArrayAdapter = findViewById(R.id.buttonArrayAdapter);
        buttonPhotoGalleryUsingAdapter = findViewById(R.id.buttonPhotoGalleryUsingAdapter);

        buttonBaseAdapter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, CountryListActivity.class);
                startActivity(intent);
            }
        });

        buttonArrayAdapter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MovieListActivity.class);
                startActivity(intent);
            }
        });

        buttonPhotoGalleryUsingAdapter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, CollegeGridActivity.class);
                startActivity(intent);
            }
        });
    }
}