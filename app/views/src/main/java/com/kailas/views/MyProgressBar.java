package com.kailas.views;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

import androidx.appcompat.app.AppCompatActivity;

public class MyProgressBar extends AppCompatActivity {
    ProgressBar progressBarHorizontal, progressBarRound;
    Button buttonStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_progress_bar);
        progressBarHorizontal = findViewById(R.id.progressBarHorizontal);
        progressBarRound = findViewById(R.id.progressBarRound);

        buttonStart = findViewById(R.id.buttonStart);
        buttonStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doWork();
            }
        });
    }

    private void doWork() {
        Log.d("Kailas", "doWork: ");
        //Heavy task in background
        final int totalProgressTime = 100;
        new Thread(new Runnable() {
            public void run() {
                int jumpTime = 0;
                while (jumpTime < totalProgressTime) {
                    try {
                        Thread.sleep(200);
                        jumpTime += 5;
                        progressBarHorizontal.setProgress(jumpTime);
                    } catch (InterruptedException e) {
                        Log.e("Kailas", "run: " + e.getMessage());
                    }
                }
            }
        }).start();
    }
}