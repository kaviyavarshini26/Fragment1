package com.example.fragment1;


import androidx.fragment.app.FragmentManager;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter(FragmentManager fm, int NoofTabs){
        super(fm);
        this.mNumOfTabs = NoofTabs;
    }
    @Override
    public int getCount() {
        return mNumOfTabs;
    }
    @Override
    public Fragment getItem(int position){
        switch (position){
            case 0:
                MoviesFragment movies = new MoviesFragment();
                return movies;
            case 1:
                AlbumsFragment albums = new AlbumsFragment();
                return albums;
            case 2:
                SeriesFragment series = new SeriesFragment();
                return series;
            default:
                return null;
        }
    }
}