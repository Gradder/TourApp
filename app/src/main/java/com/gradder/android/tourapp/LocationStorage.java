package com.gradder.android.tourapp;

import android.content.Context;

class LocationStorage {

    private int nameId;
    private int aboutPlaceId;
    private String imageName;

    LocationStorage(int nameId, int aboutPlaceId, String imageName) {
        this.nameId = nameId;
        this.aboutPlaceId = aboutPlaceId;
        this.imageName = imageName;
    }

    int getImage(Context context) {
        return context.getResources().getIdentifier(imageName, "drawable", context.getPackageName());
    }

    CharSequence getName(Context context) {
        return context.getResources().getText(nameId);
    }

    CharSequence getText(Context context) {
        return context.getResources().getText(aboutPlaceId);
    }
}
