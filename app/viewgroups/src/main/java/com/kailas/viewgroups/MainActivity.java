package com.kailas.viewgroups;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void callLinearLayout(View view) {
        Toast.makeText(this, "Linear Layout Displayed", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MyLinearLayout.class);
        startActivity(intent);
    }

    public void callTableLayout(View view) {
        Toast.makeText(this, "Table Layout Displayed", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MyTableLayout.class);
        startActivity(intent);
    }

    public void callGridLayout(View view) {
        Toast.makeText(this, "Grid Layout Displayed", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MyGridLayout.class);
        startActivity(intent);
    }

    public void callFrameLayout(View view) {
        Toast.makeText(this, "Frame Layout Displayed", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MyFrameLayout.class);
        startActivity(intent);
    }

    public void callConstraintLayout(View view) {
        Toast.makeText(this, "Constraint Layout Displayed", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MyConstraintLayout.class);
        startActivity(intent);
    }

    public void callRelativeLayout(View view) {
        Toast.makeText(this, "Relative Layout Displayed", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MyRelativeLayout.class);
        startActivity(intent);
    }

    public void callScrollView(View view) {
        Toast.makeText(this, "Scroll View Displayed", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MyScrollViewActivity.class);
        startActivity(intent);
    }
}