package com.example.android.miwok;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {

    final int PAGE_COUNT = 4;
    private String tabTitles[];
    private Context mContext;

    public CategoryAdapter(@NonNull FragmentManager fm, Context context) {
        super(fm);
        mContext = context;
    }

    //For a different getItem method, check out: https://guides.codepath.com/android/
    // google-play-style-tabs-using-tablayout#sliding-tabs-layout

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new NumbersFragment();
        } else if (position == 1) {
            return new ColorsFragment();
        } else if (position == 2) {
            return new FamilyFragment();
        } else {
            return new PhrasesFragment();
        }
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        String numbers = mContext.getString(R.string.category_numbers);
        String colors = mContext.getString(R.string.category_colors);
        String family = mContext.getString(R.string.category_family);
        String phrases = mContext.getString(R.string.category_phrases);
        tabTitles = new String[]{numbers, colors, family, phrases};
        return tabTitles[position];


    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }
}
