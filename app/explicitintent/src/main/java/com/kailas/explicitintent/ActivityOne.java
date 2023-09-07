package com.kailas.explicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ActivityOne extends AppCompatActivity {
    Button btn_go_to_next_activity;
    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = ActivityOne.this;
        btn_go_to_next_activity = findViewById(R.id.btn_go_to_next_activity);
        btn_go_to_next_activity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, ActivityTwo.class);
                startActivity(intent);
                finish();
            }
        });
//        Intent intent = new Intent(this, ActivityTwo.class);
//        startActivity(intent);
    }
}