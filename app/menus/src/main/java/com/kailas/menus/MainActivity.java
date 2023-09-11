package com.kailas.menus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button buttonOptionMenu, buttonContextMenu, buttonPopupMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonOptionMenu = findViewById(R.id.buttonOptionMenu);
        buttonContextMenu = findViewById(R.id.buttonContextMenu);
        buttonPopupMenu = findViewById(R.id.buttonPopupMenu);

        buttonOptionMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MyOptionMenuActivity.class);
                startActivity(intent);
            }
        });

        buttonContextMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MyContextMenuActivity.class);
                startActivity(intent);
            }
        });

        buttonPopupMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MyPopupMenuActivity.class);
                startActivity(intent);
            }
        });
    }
}