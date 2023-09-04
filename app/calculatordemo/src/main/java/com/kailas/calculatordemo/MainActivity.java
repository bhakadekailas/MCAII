package com.kailas.calculatordemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText et_first_no, et_second_no;
    Button addition, substraction, multiplication, division, btn_reset;
    TextView tv_result;
    private final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        someClickListener();
    }

    private void someClickListener() {
        addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int sum = additionOfTwoNo();
                Log.e(TAG, "onClick: " + sum);
                tv_result.setText(String.valueOf(sum));
            }
        });

        substraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e(TAG, "onClick: ");
                int sub = substractionOfTwoNo();
                tv_result.setText(String.valueOf(sub));
            }
        });

        multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e(TAG, "onClick: ");
                int mul = multiplicationOfTwoNo();
                tv_result.setText(String.valueOf(mul));
            }
        });


        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e(TAG, "onClick: ");
                int division = divisionOfTwoNo();
                tv_result.setText(String.valueOf(division));
            }
        });

        btn_reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetControls();
            }
        });
    }

    private void resetControls() {
        et_first_no.setText("");
        et_second_no.setText("");
        et_first_no.requestFocus();
    }

    private int additionOfTwoNo() {
        int sum;
        String num1 = et_first_no.getText().toString();
        String num2 = et_second_no.getText().toString();
        sum = Integer.parseInt(num1) + Integer.parseInt(num2);
        return sum;
    }

    private int substractionOfTwoNo() {
        int sum;
        String num1 = et_first_no.getText().toString();
        String num2 = et_second_no.getText().toString();
        sum = Integer.parseInt(num1) - Integer.parseInt(num2);
        return sum;
    }

    private int multiplicationOfTwoNo() {
        int sum;
        String num1 = et_first_no.getText().toString();
        String num2 = et_second_no.getText().toString();
        sum = Integer.parseInt(num1) * Integer.parseInt(num2);
        return sum;
    }

    private int divisionOfTwoNo() {
        int sum;
        String num1 = et_first_no.getText().toString();
        String num2 = et_second_no.getText().toString();
        sum = Integer.parseInt(num1) / Integer.parseInt(num2);
        return sum;
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