package com.gradder.android.tourapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class LocationAdapter extends ArrayAdapter<LocationStorage> {
    LocationAdapter(@NonNull Context context, @NonNull List<LocationStorage> objects) {
        super(context, 0, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.template_activity, parent, false);
        }

        LocationStorage locationStorage = getItem(position);
        ImageView imageView = listItemView.findViewById(R.id.template_image);

        imageView.setImageResource(locationStorage.getImage(getContext()));
        imageView.setVisibility(View.VISIBLE);

        TextView locationTitleTextView = listItemView.findViewById(R.id.template_name);
        locationTitleTextView.setText(locationStorage.getName(getContext()));

        TextView locationTextTextView = listItemView.findViewById(R.id.template_text);
        locationTextTextView.setText(locationStorage.getText(getContext()));

        return listItemView;
    }
}
