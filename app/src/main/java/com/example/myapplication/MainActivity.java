package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ViewPager2 viewPager2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager2 = findViewById(R.id.viewpager);

        ArrayList<ViewPagerItem> viewPagerItemList = new ArrayList<>();
        viewPagerItemList.add(new ViewPagerItem(R.drawable.obraz1,getString(R.string.kwiaty)));
        viewPagerItemList.add(new ViewPagerItem(R.drawable.obraz2,getString(R.string.oko)));
        viewPagerItemList.add(new ViewPagerItem(R.drawable.obraz4,getString(R.string.rzeka)));

        ViewAdapter viewAdapter = new ViewAdapter(viewPagerItemList);
        viewPager2.setAdapter(viewAdapter);
    }
}