package com.kailas.views;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button_simple_demo, button_check_box_demo, button_radio_button_demo,
            button_toggle_button_demo, button_image_button_demo, button_edit_text_demo,
            button_spinner_demo, button_list_view_demo, button_toast, button_scroll_view,
            button_progress_bar_demo, button_auto_complete_text_view_demo;
    private final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        setClickListenersToAllViews();
    }

    private void setClickListenersToAllViews() {
        Log.d(TAG, "setClickListenersToAllViews: ");
        //set on click listeners
        button_simple_demo.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, MySimpleButton.class);
            startActivity(intent);
        });

        button_check_box_demo.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, MyCheckBox.class);
            startActivity(intent);
        });


        button_radio_button_demo.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, MyRadioButton.class);
            startActivity(intent);
        });

        button_toggle_button_demo.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, MyToggleButton.class);
            startActivity(intent);
        });

        button_image_button_demo.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, MyImageButton.class);
            startActivity(intent);
        });


        button_edit_text_demo.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, MyEditText.class);
            startActivity(intent);
        });

        button_spinner_demo.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, MySpinner.class);
            startActivity(intent);
        });

        button_list_view_demo.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, MySimpleListView.class);
            startActivity(intent);
        });


        button_toast.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, MyToast.class);
            startActivity(intent);
        });


        button_scroll_view.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, MyScrollView.class);
            startActivity(intent);
        });


        button_progress_bar_demo.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, MyProgressBar.class);
            startActivity(intent);
        });


        button_auto_complete_text_view_demo.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, MyAutoCompleteText.class);
            startActivity(intent);
        });
    }

    private void initViews() {
        Log.d(TAG, "initViews: ");
        //init buttons
        button_simple_demo = findViewById(R.id.button_simple_demo);
        button_check_box_demo = findViewById(R.id.button_check_box_demo);
        button_radio_button_demo = findViewById(R.id.button_radio_button_demo);
        button_toggle_button_demo = findViewById(R.id.button_toggle_button_demo);
        button_image_button_demo = findViewById(R.id.button_image_button_demo);
        button_edit_text_demo = findViewById(R.id.button_edit_text_demo);
        button_spinner_demo = findViewById(R.id.button_spinner_demo);
        button_list_view_demo = findViewById(R.id.button_list_view_demo);
        button_toast = findViewById(R.id.button_toast);
        button_scroll_view = findViewById(R.id.button_scroll_view);
        button_progress_bar_demo = findViewById(R.id.button_progress_bar_demo);
        button_auto_complete_text_view_demo = findViewById(R.id.button_auto_complete_text_view_demo);
    }
}