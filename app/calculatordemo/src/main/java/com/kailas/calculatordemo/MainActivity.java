package com.kailas.calculatordemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText et_first_no, et_second_no;
    Button addition, substraction, multiplication, division, btn_reset;
    TextView tv_result;
    private String TAG = "Kailas";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        allClickListener();
    }

    private void allClickListener() {
        addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e(TAG, "onClick: ");
                Toast.makeText(getApplicationContext(), "Addition Click", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void initViews() {
        et_first_no = findViewById(R.id.et_first_no);
        et_second_no = findViewById(R.id.et_second_no);
        addition = findViewById(R.id.btn_add);
        substraction = findViewById(R.id.btn_sub);
        multiplication = findViewById(R.id.btn_mul);
        division = findViewById(R.id.btn_div);
        tv_result = findViewById(R.id.tv_result);
        btn_reset = findViewById(R.id.btn_reset);
    }


}