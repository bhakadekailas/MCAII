package com.kailas.dialogs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button_alert_dialog, button_date_picker, button_time_picker_dialog, button_custom_dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        setListeners();
    }

    private void setListeners() {
        button_alert_dialog.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, MyAlertDialog.class);
            startActivity(intent);
        });


        button_date_picker.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, MyDatePicker.class);
            startActivity(intent);
        });


        button_time_picker_dialog.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, MyTimePicker.class);
            startActivity(intent);
        });

        button_custom_dialog.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, MyCustomDialog.class);
            startActivity(intent);
        });
    }

    private void initViews() {
        button_alert_dialog = findViewById(R.id.button_alert_dialog);
        button_date_picker = findViewById(R.id.button_date_picker);
        button_time_picker_dialog = findViewById(R.id.button_time_picker_dialog);
        button_custom_dialog = findViewById(R.id.button_custom_dialog);
    }
}