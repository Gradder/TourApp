package com.gradder.android.tourapp;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class NevskyProspect extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.content_list, container, false);

        List<LocationStorage> list = new ArrayList<>();
        list.add(new LocationStorage(R.string.nevsky_prospect_name_text, R.string.about_nevsky_prospect, "nevsky_prospect"));

        LocationAdapter adapter = new LocationAdapter(getActivity(), list);
        ListView listView = rootView.findViewById(R.id.content_list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
