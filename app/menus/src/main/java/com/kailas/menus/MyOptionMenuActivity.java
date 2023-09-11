package com.kailas.menus;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MyOptionMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_option_menu);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.my_option_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (R.id.send_mail == item.getItemId()) {
            Toast.makeText(MyOptionMenuActivity.this, "Clicked on Send Mail Option", Toast.LENGTH_SHORT).show();
            return true;
        } else if (R.id.upload_data == item.getItemId()) {
            Toast.makeText(MyOptionMenuActivity.this, "Clicked on Upload Data Option", Toast.LENGTH_SHORT).show();
            return true;
        } else if (R.id.share == item.getItemId()) {
            Toast.makeText(MyOptionMenuActivity.this, "Clicked on Share Option", Toast.LENGTH_SHORT).show();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}