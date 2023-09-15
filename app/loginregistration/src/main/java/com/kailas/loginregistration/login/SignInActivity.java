package com.kailas.loginregistration.login;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.kailas.loginregistration.R;
import com.kailas.loginregistration.dashboard.DashBoardActivity;
import com.kailas.loginregistration.db.MyDbHelper;

public class SignInActivity extends AppCompatActivity {
    Button btn_signin, btn_signup;
    EditText et_username, et_password;

    Context context;
    String username;
    String password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        context = SignInActivity.this;
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
                Intent intent = new Intent(context, SignUpActivity.class);
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
            /*
             We can check user is present or not directly from database
             *
             */
            MyDbHelper myDbHelper = new MyDbHelper(context);
            boolean isUserAvailable = myDbHelper.isValidUser(username, password);
            if (isUserAvailable) {
                Intent intent = new Intent(context, DashBoardActivity.class);
                startActivity(intent);
                finish();
            } else {
                Toast.makeText(context, "User not found", Toast.LENGTH_SHORT).show();
            }

            /*
             We can get all values from database and then we can check user is present or not
             */
//            MyDbHelper myDbHelper = new MyDbHelper(context);
//            ArrayList<StudentDataModel> studentDataModelArrayList = myDbHelper.getAllStudent();
//            for (int i = 0; i < studentDataModelArrayList.size(); i++) {
//                StudentDataModel studentDataModel = studentDataModelArrayList.get(i);
//                if (studentDataModel.getUsername().equals(username) && studentDataModel.getPassword().equals(password)) {
//                    Toast.makeText(context, "Success", Toast.LENGTH_SHORT).show();
//                    Intent intent = new Intent(context, DashBoardActivity.class);
//                    startActivity(intent);
//                    finish();
//                    return;
//                } else {
//                    Toast.makeText(context, "Failed, User not found", Toast.LENGTH_SHORT).show();
//                }
//            }
        }
    }

    private boolean validation() {
        username = et_username.getText().toString();
        password = et_password.getText().toString();
        if (username.isEmpty()) {
            Toast.makeText(context, "Please enter username", Toast.LENGTH_SHORT).show();
            et_username.setError("Please enter username");
            et_username.requestFocus();
            return false;
        } else if (password.isEmpty()) {
            Toast.makeText(context, "Please enter password", Toast.LENGTH_SHORT).show();
            et_password.setError("Please enter password");
            et_password.requestFocus();
            return false;
        }
        return true;
    }
}