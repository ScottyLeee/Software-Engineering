package com.example.campus_app;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Sony on 2017/4/23.
 */

public class MyFragmentPagerAdapter extends FragmentPagerAdapter{
    private Context context;

    public MyFragmentPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new FragmentSale();
            case 1:
                return new FragmentSeeking();
            default:
                break;
        }
        return new FragmentSeeking();
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "闲置品";
            case 1:
                return "伙伴需求";
            default:
                break;
        }
        return "";
    }
}
