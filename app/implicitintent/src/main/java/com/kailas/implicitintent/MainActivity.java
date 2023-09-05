package com.kailas.implicitintent;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button buttonCamera, buttonShare;
    EditText editTextPersonName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonCamera = findViewById(R.id.buttonCamera);
        editTextPersonName = findViewById(R.id.editTextPersonName);
        buttonShare = findViewById(R.id.buttonShare);

        /*
          Start Camera Intent
         */
        buttonCamera.setOnClickListener(view -> {
            Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
            startActivity(intent);
        });

        /*
         * Start Share Intent
         */
        buttonShare.setOnClickListener(view -> {
            String myName = editTextPersonName.getText().toString();

            Intent sendIntent = new Intent();
            sendIntent.setAction(Intent.ACTION_SEND);
            sendIntent.putExtra(Intent.EXTRA_TEXT, myName);
            sendIntent.setType("text/plain");
            startActivity(sendIntent);
        });


//        Intent intent=new Intent(Intent.ACTION_VIEW);
//        intent.setData(Uri.parse("https://www.google.com/"));
//        startActivity(intent);
    }
}
