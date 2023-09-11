package com.kailas.menus;

import android.os.Bundle;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.PopupMenu;

public class MyPopupMenuActivity extends AppCompatActivity {
    Button buttonShowPopupMenu;
    PopupMenu popup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_popup_menu);
        buttonShowPopupMenu = findViewById(R.id.buttonShowPopupMenu);
        buttonShowPopupMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showPopup(view);
            }
        });

        buttonShowPopupMenu.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                return false;
            }
        });
    }

    private void showPopup(View view) {
        popup = new PopupMenu(this, view);
        MenuInflater inflater = popup.getMenuInflater();
        new PopupMenu(this, view).getMenuInflater();
        inflater.inflate(R.menu.my_option_menu, popup.getMenu());
        popup.show();
        popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                if (item.getItemId() == R.id.send_mail) {
                    Toast.makeText(MyPopupMenuActivity.this, "Clicked on Send Mail Option", Toast.LENGTH_SHORT).show();
                } else if (item.getItemId() == R.id.upload_data) {
                    Toast.makeText(MyPopupMenuActivity.this, "Clicked on Upload Data Option", Toast.LENGTH_SHORT).show();
                } else if (item.getItemId() == R.id.share) {
                    Toast.makeText(MyPopupMenuActivity.this, "Clicked on Share Option", Toast.LENGTH_SHORT).show();
                }
                return true;
            }
        });
    }
}