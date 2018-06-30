package com.gradder.android.tourapp;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class Hermitage extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.hermitage_activity, container, false);
        ImageView imageView = rootView.findViewById(R.id.hermitage_image);
        TextView textViewName = rootView.findViewById(R.id.hermitage_name);
        TextView textViewText = rootView.findViewById(R.id.hermitage_text);

        imageView.setImageResource(InformationStorage.getImage(getContext(), 2));
        textViewName.setText(InformationStorage.getName(getContext(), 2));
        textViewText.setText(InformationStorage.getText(getContext(), 2));
        return rootView;
    }

}
