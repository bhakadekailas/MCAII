package com.kailas.adapterdemo.photoGalleryUsingAdapter;

import android.os.Bundle;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;

import com.kailas.adapterdemo.R;

import java.util.ArrayList;

public class CollegeGridActivity extends AppCompatActivity {
    GridView gridViewForPhotoGallery;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo_gallery);
        gridViewForPhotoGallery = findViewById(R.id.gridViewForPhotoGallery);

        ArrayList<CollegeDataModel> arrayList = loadCollegeList();

        CollegeBaseAdapter collegeBaseAdapter = new CollegeBaseAdapter(CollegeGridActivity.this, arrayList);
        gridViewForPhotoGallery.setAdapter(collegeBaseAdapter);
    }

    private ArrayList<CollegeDataModel> loadCollegeList() {
        ArrayList<CollegeDataModel> arrayList = new ArrayList<>();
        arrayList.add(new CollegeDataModel(R.drawable.imcc, "IMCC"));
        arrayList.add(new CollegeDataModel(R.drawable.fc, "FC"));
        arrayList.add(new CollegeDataModel(R.drawable.modern, "MODERN"));
        arrayList.add(new CollegeDataModel(R.drawable.mit, "MIT"));
        arrayList.add(new CollegeDataModel(R.drawable.imcc, "IMCC"));
        arrayList.add(new CollegeDataModel(R.drawable.imcc, "IMCC"));
        arrayList.add(new CollegeDataModel(R.drawable.fc, "FC"));
        arrayList.add(new CollegeDataModel(R.drawable.modern, "MODERN"));
        arrayList.add(new CollegeDataModel(R.drawable.mit, "MIT"));
        arrayList.add(new CollegeDataModel(R.drawable.imcc, "IMCC"));
        return arrayList;
    }
}