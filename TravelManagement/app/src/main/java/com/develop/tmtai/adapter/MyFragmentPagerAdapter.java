package com.develop.tmtai.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.develop.tmtai.travelmanagement.FragmentHistoryTravel;
import com.develop.tmtai.travelmanagement.FragmentInfoTravel;
import com.develop.tmtai.travelmanagement.FragmentSchedule;

/**
 * Created by tmtai on 8/10/2017.
 */

public class MyFragmentPagerAdapter extends FragmentPagerAdapter {

    public MyFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: // Fragment # 0 - This will show FirstFragment
                return new FragmentSchedule();
            case 1: // Fragment # 0 - This will show FirstFragment different title
                return new FragmentInfoTravel();
            case 2: // Fragment # 1 - This will show SecondFragment
                return new FragmentHistoryTravel();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}