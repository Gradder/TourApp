package com.gradder.android.tourapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class PalaceSquare extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.palace_square_activity, container, false);
        ImageView imageView = rootView.findViewById(R.id.palace_square_image);
        TextView textViewName = rootView.findViewById(R.id.palace_square_name);
        TextView textViewText = rootView.findViewById(R.id.palace_square_text);

        imageView.setImageResource(InformationStorage.getImage(getContext(), 1));
        textViewName.setText(InformationStorage.getName(getContext(), 1));
        textViewText.setText(InformationStorage.getText(getContext(), 1));
        return rootView;
    }
}
