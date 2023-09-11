package com.kailas.menus;

import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class MyContextMenuActivity extends AppCompatActivity {
    TextView textView;
    ConstraintLayout constraintLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_context_menu);
        textView = findViewById(R.id.textView);
        constraintLayout = findViewById(R.id.constraintLayout);
        // here you have to register a view for context menu
        // you can register any view like listview, image view,
        // textview, button etc
        registerForContextMenu(textView);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.my_context_menu, menu);
//        menu.setHeaderTitle("Select Color");
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.red) {
            constraintLayout.setBackgroundColor(Color.RED);
        } else if (item.getItemId() == R.id.blue) {
            constraintLayout.setBackgroundColor(Color.BLUE);
        } else if (item.getItemId() == R.id.yellow) {
            constraintLayout.setBackgroundColor(Color.YELLOW);
        }
        return true;
    }
}