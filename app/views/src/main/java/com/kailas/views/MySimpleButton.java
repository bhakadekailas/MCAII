package com.kailas.views;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MySimpleButton extends AppCompatActivity {
    Button button_simple;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_simple_button);
        button_simple = findViewById(R.id.button_simple);
        button_simple.setOnClickListener(view -> {
            Toast.makeText(MySimpleButton.this, "This is your simple button", Toast.LENGTH_SHORT).show();
        });
    }
}