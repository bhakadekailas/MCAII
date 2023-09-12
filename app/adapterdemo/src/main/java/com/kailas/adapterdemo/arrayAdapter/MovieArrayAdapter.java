package com.kailas.adapterdemo.arrayAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;


import com.kailas.adapterdemo.R;

import java.util.ArrayList;
import java.util.List;

public class MovieArrayAdapter extends ArrayAdapter<MovieDataModel> {
    private final Context myContext;
    private final List<MovieDataModel> moviesList;

    public MovieArrayAdapter(Context context, ArrayList<MovieDataModel> moviesList) {
        super(context, 0, moviesList);
        this.myContext = context;
        this.moviesList = moviesList;
    }

    @Override
    public int getCount() {
        return moviesList.size();
    }


    @Override
    public MovieDataModel getItem(int position) {
        return moviesList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        if (view == null) {
            view = LayoutInflater.from(myContext).inflate(R.layout.row_my_array_adapter, parent, false);
        }

        TextView textViewMovieName = view.findViewById(R.id.textViewMovieName);
        TextView textViewReleaseDate = view.findViewById(R.id.textViewReleaseDate);
        TextView textViewRating = view.findViewById(R.id.textViewRating);

        MovieDataModel movieDataModel = moviesList.get(position);
        textViewMovieName.setText(movieDataModel.getMovieName());
        textViewReleaseDate.setText(movieDataModel.getReleaseDate());
        textViewRating.setText(String.valueOf(movieDataModel.getRating()));

        return view;
    }
}
