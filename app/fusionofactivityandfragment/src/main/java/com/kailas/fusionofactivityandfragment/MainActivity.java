package com.kailas.fusionofactivityandfragment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_main);
        super.onCreate(savedInstanceState);
        Log.e(TAG, "KAILASA onCreate: ");
        Toast.makeText(this, TAG+"onCreate", Toast.LENGTH_SHORT).show();
        getSupportFragmentManager().beginTransaction()
                .add(R.id.frame_container, new MyFragment()).commit();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG, "KAILASA onStart: ");
        Toast.makeText(this, TAG+"onStart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG, "KAILASA onResume: ");
        Toast.makeText(this, TAG+"onResume", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG, "KAILASA onPause: ");
        Toast.makeText(this, TAG+"onPause", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG, "KAILASA onStop: ");
        Toast.makeText(this, TAG+"onStop", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(TAG, "KAILASA onRestart: ");
        Toast.makeText(this, TAG+"onRestart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "KAILASA onDestroy: ");
        Toast.makeText(this, TAG+"onDestroy", Toast.LENGTH_SHORT).show();
    }
}