package com.example.oksak.onsas_myself_java;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.ViewGroup;

public class OriginalFragmentPagerAdapter extends FragmentPagerAdapter {

    private CharSequence[] tabTitles = {"タブ1", "タブ2"};

    public OriginalFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new Main1Fragment();
            case 1:
                return new Main2Fragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return tabTitles.length;
    }
}