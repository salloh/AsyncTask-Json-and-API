package com.example.salah.math;

import java.util.Random;

import android.content.Context;
import android.graphics.Color;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class FunPagerAdapter extends PagerAdapter {

    private int[] colors = {Color.parseColor("#00B050"),
            Color.parseColor("#FFC000"),
            Color.parseColor("#DB1351"),
            Color.parseColor("#B61C83"),
            Color.parseColor("#0070C0")};

    private Random rnd;

    public FunPagerAdapter(){
        super();
        rnd = new Random();
    }

    @Override
    public int getCount() {
        return Integer.MAX_VALUE;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == ((View) object);
    }

    @Override
    public Object instantiateItem(View collection, int pos) {
        LayoutInflater inflater = (LayoutInflater) collection.getContext()
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View page = inflater.inflate(R.layout.page_fun, null);

        RelativeLayout back = (RelativeLayout)page.findViewById(R.id.background);


        int randomColor = rnd.nextInt(5);

        TextView tv = (TextView)page.findViewById(R.id.lblTxt);
        tv.setBackgroundResource(R.drawable.generic_back);
        back.setBackgroundColor(colors[randomColor]);

        FetchFactTask fft = new FetchFactTask(tv);
        fft.execute("http://numbersapi.com/" + pos);

        ((ViewPager) collection).addView(page, 0);
        return page;
    }

    @Override
    public void destroyItem(View collection, int position, Object view) {
        ((ViewPager) collection).removeView((View) view);
    }



}
