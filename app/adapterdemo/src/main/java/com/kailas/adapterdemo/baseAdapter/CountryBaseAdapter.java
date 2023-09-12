package com.kailas.adapterdemo.baseAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.kailas.adapterdemo.R;

import java.util.ArrayList;

public class CountryBaseAdapter extends BaseAdapter {
    ArrayList<CountryDataModel> countryList;
    Context context;

    public CountryBaseAdapter(Context context, ArrayList<CountryDataModel> countryList) {
        this.context = context;
        this.countryList = countryList;
    }

    @Override
    public int getCount() {
        return countryList.size();
    }

    @Override
    public CountryDataModel getItem(int position) {
        return countryList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        view = layoutInflater.inflate(R.layout.row_layout_for_base_adapter, viewGroup);

        TextView textViewItemName = view.findViewById(R.id.textViewCountryName);
        TextView textViewItemDescription = view.findViewById(R.id.textViewCountryCode);

        CountryDataModel countryDataModel = countryList.get(position);

        textViewItemName.setText(countryDataModel.getName());
        textViewItemDescription.setText(String.valueOf(countryDataModel.getCode()));

        return view;
    }
}
