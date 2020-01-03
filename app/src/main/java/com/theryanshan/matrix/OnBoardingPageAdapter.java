package com.theryanshan.matrix;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

public class OnBoardingPageAdapter extends androidx.fragment.app.FragmentPagerAdapter {
    private static int NUM_ITEMS = 1;

    public OnBoardingPageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return LoginFragment.newInstance();
            case 1:
                return RegisterFragment.newInstance();
            default:
                return null;
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch(position) {
            case 0:
                return "Login";
            case 1:
                return "Register";
        }
        return null;
    }

    @Override
    public int getCount() {
        return NUM_ITEMS;
    }
}
