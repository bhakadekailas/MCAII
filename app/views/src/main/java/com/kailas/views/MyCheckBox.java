package com.kailas.views;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MyCheckBox extends AppCompatActivity {
    CheckBox check_box_option1, check_box_option2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_check_box);
        check_box_option1 = findViewById(R.id.check_box_option1);
        check_box_option2 = findViewById(R.id.check_box_option2);


        check_box_option1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean myValue) {
                Toast.makeText(MyCheckBox.this, "The value of check box is = " + myValue, Toast.LENGTH_SHORT).show();
            }
        });

        check_box_option2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean myValue) {
                Toast.makeText(MyCheckBox.this, "The value of check box is = " + myValue, Toast.LENGTH_SHORT).show();
            }
        });
    }
}