package com.kailas.webservicesdemo.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.kailas.webservicesdemo.R;
import com.kailas.webservicesdemo.api.RetrofitAPI;
import com.kailas.webservicesdemo.get.MyResponse;
import com.kailas.webservicesdemo.post.MyPostRequest;
import com.kailas.webservicesdemo.post.MyPostResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    Button buttonGetRequest, buttonPostRequest, buttonReset;
    private EditText editTextName, editTextJob;
    private TextView textViewResult;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextName = findViewById(R.id.editTextName);
        editTextJob = findViewById(R.id.editTextJob);
        buttonGetRequest = findViewById(R.id.buttonGetRequest);
        buttonPostRequest = findViewById(R.id.buttonPostRequest);
        buttonReset = findViewById(R.id.buttonReset);
        textViewResult = findViewById(R.id.textViewResult);
        progressBar = findViewById(R.id.progressBar);

        buttonGetRequest.setOnClickListener(v -> {
            fetchDataUsingGetRequest();
        });

        buttonPostRequest.setOnClickListener(v -> {
            fetchDataUsingPostRequest();
        });

        buttonReset.setOnClickListener(v -> {
            editTextName.setText("");
            editTextJob.setText("");
            textViewResult.setText("Result");
        });
    }


    private void fetchDataUsingGetRequest() {
        progressBar.setVisibility(View.VISIBLE);
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://reqres.in/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        RetrofitAPI retrofitAPI = retrofit.create(RetrofitAPI.class);
        Call<MyResponse> call = retrofitAPI.getRandomUser();
        call.enqueue(new Callback<MyResponse>() {
            @Override
            public void onResponse(Call<MyResponse> call, Response<MyResponse> response) {
                progressBar.setVisibility(View.GONE);
                MyResponse myResponse = response.body();

                String responseString = myResponse.toString();
                textViewResult.setText(responseString);
            }

            @Override
            public void onFailure(Call<MyResponse> call, Throwable t) {
                textViewResult.setText(t.getMessage());
            }
        });
    }

    private void fetchDataUsingPostRequest() {
        if (editTextName.getText().toString().isEmpty() && editTextJob.getText().toString().isEmpty()) {
            Toast.makeText(MainActivity.this, "Please enter both the values", Toast.LENGTH_SHORT).show();
            return;
        }
        postData(editTextName.getText().toString(), editTextJob.getText().toString());
    }

    private void postData(String name, String job) {
        progressBar.setVisibility(View.VISIBLE);
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://reqres.in/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        RetrofitAPI retrofitAPI = retrofit.create(RetrofitAPI.class);

        MyPostRequest myPostRequest = new MyPostRequest(name, job);

        Call<MyPostResponse> call = retrofitAPI.createUser(myPostRequest);

        call.enqueue(new Callback<MyPostResponse>() {
            @Override
            public void onResponse(Call<MyPostResponse> call, Response<MyPostResponse> response) {
                Toast.makeText(MainActivity.this, "Data added to API", Toast.LENGTH_SHORT).show();
                progressBar.setVisibility(View.GONE);
                MyPostResponse responseFromAPI = response.body();
                textViewResult.setText(responseFromAPI.toString());
            }

            @Override
            public void onFailure(Call<MyPostResponse> call, Throwable t) {
                textViewResult.setText(t.getMessage());
            }
        });
    }
}