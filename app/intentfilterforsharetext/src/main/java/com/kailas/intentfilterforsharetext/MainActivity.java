package com.kailas.intentfilterforsharetext;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv_share_text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        takeIntentValues();
    }

    private void takeIntentValues() {
        if (getIntent().getAction().equals(Intent.ACTION_SEND) && getIntent().getType().equals("text/plain")) {
            String sharedText = getIntent().getStringExtra(Intent.EXTRA_TEXT);
            if (sharedText != null) {
                tv_share_text = findViewById(R.id.tv_share_text);
                tv_share_text.setText(sharedText);
            }
        }
    }
}