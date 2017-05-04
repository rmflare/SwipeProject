package edu.dtcc.cis282student.swipeproject;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ImagePagerFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_pager, container, false);
        ViewPager pager = (ViewPager) view.findViewById(R.id.fragment_pager);
        pager.setAdapter(new ImagePagerAdapter(getChildFragmentManager()));
        pager.setOffscreenPageLimit(2);

        return view;
    }
}