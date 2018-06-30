package com.gradder.android.tourapp;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class NevskyProspect extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.nevsky_prospect_activity, container, false);
        ImageView imageView = rootView.findViewById(R.id.nevsky_prospect_image);
        TextView textViewName = rootView.findViewById(R.id.nevsky_prospect_name);
        TextView textViewText = rootView.findViewById(R.id.nevsky_prospect_text);

        imageView.setImageResource(InformationStorage.getImage(getContext(), 3));
        textViewName.setText(InformationStorage.getName(getContext(), 3));
        textViewText.setText(InformationStorage.getText(getContext(), 3));
        return rootView;
    }
}
