package com.example.androidapp.profile;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;

import com.example.androidapp.R;

import java.util.ArrayList;

public class ProfileActivity extends AppCompatActivity {

    private ViewPager avatarPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        addCntrols();
        addEvents();
    }

    private void addEvents() {

    }

    private void addCntrols() {
        avatarPager = findViewById(R.id.avatarPager);
        AvatarPagerAdapter adapter = new AvatarPagerAdapter(this, new ArrayList<View>());
        avatarPager.setAdapter(adapter);
    }
}
