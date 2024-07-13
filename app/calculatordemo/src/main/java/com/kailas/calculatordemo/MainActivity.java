package com.kailas.calculatordemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private final String TAG = "MainActivity";
    EditText et_first_no, et_second_no;
    Button addition, substraction, multiplication, division, btn_reset;
    TextView tv_result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        someClickListener();
    }

    private void someClickListener() {
        addition.setOnClickListener(v -> {
            String num1 = et_first_no.getText().toString();
            String num2 = et_second_no.getText().toString();
            if (validateET(num1, num2)) {
                int sum = additionOfTwoNo(num1, num2);
                tv_result.setText(String.valueOf(sum));
            }
        });

        substraction.setOnClickListener(v -> {
            String num1 = et_first_no.getText().toString();
            String num2 = et_second_no.getText().toString();
            if (validateET(num1, num2)) {
                int sub = substractionOfTwoNo(num1, num2);
                tv_result.setText(String.valueOf(sub));
            }
        });

        multiplication.setOnClickListener(v -> {
            String num1 = et_first_no.getText().toString();
            String num2 = et_second_no.getText().toString();
            if (validateET(num1, num2)) {
                int mul = multiplicationOfTwoNo(num1, num2);
                tv_result.setText(String.valueOf(mul));
            }
        });


        division.setOnClickListener(v -> {
            String num1 = et_first_no.getText().toString();
            String num2 = et_second_no.getText().toString();
            if (validateET(num1, num2)) {
                int division = divisionOfTwoNo(num1, num2);
                tv_result.setText(String.valueOf(division));
            }
        });

        btn_reset.setOnClickListener(v -> resetControls());
    }

    private boolean validateET(String no1, String no2) {
        if (no1.isEmpty()) {
            et_first_no.setError("Please enter no1");
            et_first_no.requestFocus();
            return false;
        } else if (no2.isEmpty()) {
            et_second_no.setError("Please enter no2");
            et_second_no.requestFocus();
            return false;
        }
        return true;
    }

    private void resetControls() {
        et_first_no.setText("");
        et_second_no.setText("");
        et_first_no.requestFocus();
    }

    private int additionOfTwoNo(String num1, String num2) {
        int sum;
        sum = Integer.parseInt(num1) + Integer.parseInt(num2);
        return sum;
    }

    private int substractionOfTwoNo(String num1, String num2) {
        int sum;
        sum = Integer.parseInt(num1) - Integer.parseInt(num2);
        return sum;
    }

    private int multiplicationOfTwoNo(String num1, String num2) {
        int sum;
        sum = Integer.parseInt(num1) * Integer.parseInt(num2);
        return sum;
    }

    private int divisionOfTwoNo(String num1, String num2) {
        int sum;
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