package com.gradder.android.tourapp;

import android.content.Context;

class InformationStorage {

    static int getImage(Context context, int page) {

        switch (page) {
            case 0:
                return context.getResources().getIdentifier("spb", "drawable", context.getPackageName());
            case 1:
                return context.getResources().getIdentifier("palace_square", "drawable", context.getPackageName());
            case 2:
                return context.getResources().getIdentifier("hermitage", "drawable", context.getPackageName());
            case 3:
                return context.getResources().getIdentifier("nevsky_prospect", "drawable", context.getPackageName());
            default:
                return 0;
        }
    }

    static CharSequence getName(Context context, int page) {
        switch (page) {
            case 0:
                return context.getResources().getText(R.string.spb_name_text);
            case 1:
                return context.getResources().getText(R.string.palace_square_name_text);
            case 2:
                return context.getResources().getText(R.string.hermitage_name_text);
            case 3:
                return context.getResources().getText(R.string.nevsky_prospect_name_text);
            default:
                return "";
        }
    }

    static CharSequence getText(Context context, int page) {
        switch (page) {
            case 0:
                return context.getResources().getText(R.string.about_spb);
            case 1:
                return context.getResources().getText(R.string.about_palace_square);
            case 2:
                return context.getResources().getText(R.string.about_hermitage);
            case 3:
                return context.getResources().getText(R.string.about_nevsky_prospect);
            default:
                return "";
        }
    }
}
