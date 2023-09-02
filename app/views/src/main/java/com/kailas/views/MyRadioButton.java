package com.kailas.views;

import android.os.Bundle;
import android.util.Log;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MyRadioButton extends AppCompatActivity {
    RadioGroup radioGroup;
    RadioButton radioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_radio_button);
        radioGroup = findViewById(R.id.radioGroup);


        radioGroup.setOnCheckedChangeListener((radioGroup, buttonId) -> {
            Log.d("KAILASA", "onCheckedChanged: " + buttonId);
            radioButton = findViewById(buttonId);
            Toast.makeText(MyRadioButton.this, radioButton.getText(), Toast.LENGTH_SHORT).show();
        });
    }
}