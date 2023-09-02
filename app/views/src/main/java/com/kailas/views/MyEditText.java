package com.kailas.views;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MyEditText extends AppCompatActivity {
    EditText edit_text_name;
    Button button_display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_edit_text);
        edit_text_name = findViewById(R.id.edit_text_name);
        button_display = findViewById(R.id.button_display);
        button_display.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!edit_text_name.getText().toString().isEmpty()) {
                    Toast.makeText(MyEditText.this, edit_text_name.getText().toString(), Toast.LENGTH_SHORT).show();
                } else {
                    edit_text_name.setError("Please enter your name first");
                }
            }
        });
    }
}