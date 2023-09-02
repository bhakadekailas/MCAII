package com.kailas.views;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Toast;
import android.widget.ToggleButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

public class MyToggleButton extends AppCompatActivity {
    ToggleButton toggleButton;
    SwitchCompat switchCompat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_toogle_button);
        toggleButton = findViewById(R.id.toggleButton);
        switchCompat = findViewById(R.id.switchCompat);
        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                Toast.makeText(MyToggleButton.this, " Value is = " + b, Toast.LENGTH_LONG).show();
            }
        });

        switchCompat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                Toast.makeText(MyToggleButton.this, " Value is = " + b, Toast.LENGTH_LONG).show();
            }
        });
    }
}