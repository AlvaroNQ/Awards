package com.example.awards;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.viewpager.widget.PagerAdapter;

import java.util.List;

public class MyAdapter extends PagerAdapter {

    List<Integer> lstImages;
    Context context;
    LayoutInflater layoutInflater;

    public MyAdapter(List<Integer> images, Context ctx){
        this.lstImages = images;
        this.context = ctx;
        layoutInflater = LayoutInflater.from(ctx);
    }

    @Override
    public int getCount() {
        return this.lstImages.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view.equals(object);
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position){
        View view = layoutInflater.inflate(R.layout.card_item, container, false);

//        CardView cardView = (CardView) view.findViewById(R.id.cardView);

        ImageView imageView = (ImageView) view.findViewById(R.id.imageView);
        imageView.setImageResource(lstImages.get(position));


        container.addView(view);
        return view;
    }


}
