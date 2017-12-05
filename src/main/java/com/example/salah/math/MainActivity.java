package com.example.salah.math;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager mPager = (ViewPager)findViewById(R.id.pager);

        FunPagerAdapter mAdapter = new FunPagerAdapter();

        mPager.setAdapter(mAdapter);


    }
}
