package com.feedindia.locationrx.utils;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.feedindia.locationrx.R;
import com.mapbox.geojson.Feature;

import java.util.List;

public class CustomAdapter extends ArrayAdapter<Feature> {

    private Context context;
    private List<Feature> features;


    public CustomAdapter(@NonNull Context context, int resource, @NonNull List<Feature> objects) {
        super(context, resource, objects);
        this.context = context;
        features = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = convertView;
        if (view == null)
            view = LayoutInflater.from(context).inflate(R.layout.bubble_card, parent, false);

        TextView name = view.findViewById(R.id.hungerSpotName);
        TextView distance = view.findViewById(R.id.distance);
        name.setText(features.get(position).getStringProperty("name"));
        distance.setText(String.format("%.2f",features.get(position).getNumberProperty("distance").doubleValue()/1000)+" Km");
        return view;
    }
}