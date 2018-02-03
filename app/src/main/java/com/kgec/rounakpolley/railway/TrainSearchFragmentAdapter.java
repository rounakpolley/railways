package com.kgec.rounakpolley.railway;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.widget.Toast;

import com.kgec.rounakpolley.railway.TrainSearchRouteFragment;
import com.kgec.rounakpolley.railway.TrainSearchSeatAvailabilityFragment;
import com.kgec.rounakpolley.railway.TrainSearchTrainByNoFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ROUNAK POLLEY on 10-01-2018.
 */
public class TrainSearchFragmentAdapter extends FragmentStatePagerAdapter{

    int mNoOfTabs;
    public TrainSearchFragmentAdapter(FragmentManager fm, int noOfTabs) {
        super(fm);
        this.mNoOfTabs = noOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch(position){
            case 0 :
                TrainSearchTrainByNoFragment trainSearchTrainByNoFragment = new TrainSearchTrainByNoFragment();
                return trainSearchTrainByNoFragment;
            case 1 :
                TrainSearchSeatAvailabilityFragment trainSearchSeatAvailabilityFragment = new TrainSearchSeatAvailabilityFragment();
                return  trainSearchSeatAvailabilityFragment;
            case 2 :
                TrainSearchRouteFragment trainSearchRouteFragment = new TrainSearchRouteFragment();
                return trainSearchRouteFragment;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNoOfTabs;
    }
}