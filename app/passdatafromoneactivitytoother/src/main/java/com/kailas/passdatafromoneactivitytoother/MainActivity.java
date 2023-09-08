package com.kailas.passdatafromoneactivitytoother;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button button_Send;

    EditText et_message;

    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = MainActivity.this;
        button_Send = findViewById(R.id.button_Send);
        et_message = findViewById(R.id.et_message);

        button_Send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendMessage();
            }
        });
    }

    private void sendMessage() {
        String myMessage = et_message.getText().toString();

        /*
      This is by using intent
         */
//        Intent intent = new Intent(context, SecondActivity.class);
//        intent.putExtra("msg", myMessage);
//        startActivity(intent);

        /*
        This is by using bundle
         */

        Intent intent = new Intent(context, SecondActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString("msg", myMessage);
        intent.putExtras(bundle);
        startActivity(intent);
    }


}