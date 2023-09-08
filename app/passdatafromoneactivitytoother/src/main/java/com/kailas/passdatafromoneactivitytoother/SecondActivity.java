package com.kailas.passdatafromoneactivitytoother;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView tv_message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        tv_message = findViewById(R.id.tv_message);
//        String msg = getIntent().getStringExtra("msg");
//        tv_message.setText(msg);

        Bundle extras = getIntent().getExtras();
        String value =extras.getString("msg");
        tv_message.setText(value);
    }
}