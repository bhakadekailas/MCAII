package com.kailas.views;

import android.os.Bundle;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class MyImageButton extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_button);
        ImageButton imageButton = findViewById(R.id.image_button);
        imageButton.setImageResource(R.drawable.imcc);
    }
}