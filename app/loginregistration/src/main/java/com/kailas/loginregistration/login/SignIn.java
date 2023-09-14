package com.kailas.loginregistration.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.kailas.loginregistration.R;
import com.kailas.loginregistration.dashboard.MainActivity;
import com.kailas.loginregistration.dataModel.StudentDataModel;
import com.kailas.loginregistration.db.MyDbHelper;

import java.util.ArrayList;

public class SignIn extends AppCompatActivity {

    Button btn_signin, btn_signup;
    EditText et_username, et_password;

    Context context;
    String username;
    String password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        context = SignIn.this;
        initViews();

        btn_signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("KAILAS", "onClick: ");
                login();
            }
        });

        btn_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, SignUp.class);
                startActivity(intent);
            }
        });
    }

    private void initViews() {
        btn_signin = findViewById(R.id.btn_signin);
        btn_signup = findViewById(R.id.btn_signup);
        et_username = findViewById(R.id.et_username);
        et_password = findViewById(R.id.et_password);
    }

    private void login() {
        if (validation()) {
            if (username.equals("abc") && password.equals("123")) {
                Toast.makeText(context, "Success", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(context, MainActivity.class);
                startActivity(intent);
                finish();
            } else {
                Toast.makeText(context, "Failed, User not found", Toast.LENGTH_SHORT).show();
            }
        }
    }

    private boolean validation() {
        username = et_username.getText().toString();
        password = et_password.getText().toString();

        if (username.isEmpty()) {
            Toast.makeText(context, "Please enter username", Toast.LENGTH_SHORT).show();
//            et_username.setError("Please enter username");
            et_username.requestFocus();
            return false;
        } else if (password.isEmpty()) {
            Toast.makeText(context, "Please enter password", Toast.LENGTH_SHORT).show();
            et_password.requestFocus();
            return false;
        }
        return true;
    }
}