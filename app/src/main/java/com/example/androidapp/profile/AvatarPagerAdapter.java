package com.example.androidapp.profile;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import java.util.List;

public class AvatarPagerAdapter extends PagerAdapter {

    private Context mContext;
    private List<View> views;

    public AvatarPagerAdapter(Context mContext, List<View> views) {
        this.mContext = mContext;
        this.views = views;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        View view = views.get(position);
        container.addView(view);
        return view;
    }

    @Override
    public int getItemPosition(@NonNull Object object) {
        for(int index = 0 ; index < getCount() ; index++){
            if((View)object == views.get(index)) {
                return index;
            }
        }
        return POSITION_NONE;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }

    @Override
    public int getCount() {
        return views.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view == o;
    }

}
