package com.kailas.loginregistration.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.kailas.loginregistration.R;
import com.kailas.loginregistration.dataModel.StudentDataModel;
import com.kailas.loginregistration.db.MyDbHelper;
import com.kailas.loginregistration.utils.SignUpFormValidation;

public class SignUp extends AppCompatActivity {
    Button btn_signup, btn_signin;
    Context context;

    EditText et_first_name, et_last_name, et_email, et_mobile, et_usename, et_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = SignUp.this;
        setContentView(R.layout.activity_sign_up);
        initViews();
        clickListeners();
    }

    private void clickListeners() {
        btn_signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, SignIn.class);
                startActivity(intent);
                finish();
            }
        });

        btn_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                registration();
            }
        });
    }

    private void initViews() {
        btn_signin = findViewById(R.id.btn_signin);
        btn_signup = findViewById(R.id.btn_signup);
        et_first_name = findViewById(R.id.et_first_name);
        et_last_name = findViewById(R.id.et_last_name);
        et_email = findViewById(R.id.et_email);
        et_mobile = findViewById(R.id.et_mobile);
        et_usename = findViewById(R.id.et_usename);
        et_password = findViewById(R.id.et_password);
    }

    private void registration() {
        if (validate()) {
            StudentDataModel studentDataModel = new StudentDataModel();

            studentDataModel.setFirstName(et_first_name.getText().toString());
            studentDataModel.setLastName(et_last_name.getText().toString());
            studentDataModel.setEmail(et_email.getText().toString());
            studentDataModel.setMobile(et_mobile.getText().toString());
            studentDataModel.setUsername(et_usename.getText().toString());
            studentDataModel.setPassword(et_password.getText().toString());

            MyDbHelper myDbHelper = new MyDbHelper(context);
        }
    }

    private boolean validate() {
        if (et_first_name.getText().toString().isEmpty()) {
            et_first_name.setError(getResources().getString(R.string.enter_first_name));
            et_first_name.requestFocus();
            return false;
        } else if (et_last_name.getText().toString().isEmpty()) {
            et_last_name.setError(getResources().getString(R.string.enter_last_name));
            et_last_name.requestFocus();
            return false;
        } else if (et_email.getText().toString().isEmpty() && SignUpFormValidation.isEmailValid(et_email.getText().toString())) {
            et_email.setError(getResources().getString(R.string.enter_email));
            et_email.requestFocus();
            return false;
        } else if (et_mobile.getText().toString().isEmpty()) {
            et_mobile.setError(getResources().getString(R.string.enter_mobile_number));
            et_mobile.requestFocus();
            return false;
        } else if (et_usename.getText().toString().isEmpty()) {
            et_usename.setError(getResources().getString(R.string.enter_username));
            et_usename.requestFocus();
            return false;
        } else if (et_password.getText().toString().isEmpty()) {
            et_password.setError(getResources().getString(R.string.enter_password));
            et_password.requestFocus();
            return false;
        }
        return true;
    }
}