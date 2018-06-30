package com.gradder.android.tourapp;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class SaintPetersburg extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.spb_activity, container, false);
        ImageView imageView = rootView.findViewById(R.id.spb_image);
        TextView textViewName = rootView.findViewById(R.id.spb_name);
        TextView textViewText = rootView.findViewById(R.id.spb_text);

        imageView.setImageResource(InformationStorage.getImage(getContext(), 0));
        textViewName.setText(InformationStorage.getName(getContext(), 0));
        textViewText.setText(InformationStorage.getText(getContext(), 0));
        return rootView;
    }
}
