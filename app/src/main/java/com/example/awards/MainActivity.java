package com.example.awards;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.gigamole.infinitecycleviewpager.HorizontalInfiniteCycleViewPager;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    List<Integer> lstImages = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();

        HorizontalInfiniteCycleViewPager pager = (HorizontalInfiniteCycleViewPager) findViewById(R.id.horizontal_cycle);
        MyAdapter adapter = new MyAdapter(lstImages, getBaseContext());
        pager.setAdapter(adapter);

    }

    public void initData(){
        lstImages.add(R.drawable.ic_launcher_foreground);

    }


}
