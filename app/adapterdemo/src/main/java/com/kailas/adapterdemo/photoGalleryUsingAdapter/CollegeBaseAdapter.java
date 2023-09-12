package com.kailas.adapterdemo.photoGalleryUsingAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


import com.kailas.adapterdemo.R;

import java.util.ArrayList;

public class CollegeBaseAdapter extends BaseAdapter {
    ArrayList<CollegeDataModel> collegeList;
    Context context;

    public CollegeBaseAdapter(Context context, ArrayList<CollegeDataModel> collegeList) {
        this.context = context;
        this.collegeList = collegeList;
    }

    @Override
    public int getCount() {
        return collegeList.size();
    }

    @Override
    public CollegeDataModel getItem(int position) {
        return collegeList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.row_photo_gallery, viewGroup, false);
        }
        CollegeDataModel collegeDataModel = collegeList.get(position);

        ImageView imageViewForCollege = view.findViewById(R.id.imageViewForCollege);
        imageViewForCollege.setImageResource(collegeDataModel.getImagePath());

        TextView textViewForCollegeName = view.findViewById(R.id.textViewForCollegeName);
        textViewForCollegeName.setText(collegeDataModel.getCollegeName());

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, collegeDataModel.getCollegeName(), Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }
}
