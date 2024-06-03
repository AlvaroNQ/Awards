package com.example.awards;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.viewpager.widget.PagerAdapter;

import java.util.List;

import pl.droidsonroids.gif.GifImageView;

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
    public void destroyItem(ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position){
        View view = layoutInflater.inflate(R.layout.card_item, container, false);
        ImageView imageView;
        TextView textView;
        GifImageView gifImageView;
        switch (position){
            case 0:
                imageView = (ImageView) view.findViewById(R.id.icon);
                imageView.setImageResource(R.drawable.bday);

                textView = (TextView) view.findViewById(R.id.text_view_title);
                textView.setText("Happy Bday");

                gifImageView = (GifImageView) view.findViewById(R.id.gif);
                gifImageView.setImageResource(R.drawable.dance);

                textView = (TextView) view.findViewById(R.id.description);
                textView.setText("Hope you had a great bday with all people.");
                textView.setTextSize(25);
                break;

            case 1:
                imageView = (ImageView) view.findViewById(R.id.icon);
                imageView.setImageResource(R.drawable.graduation);

                textView = (TextView) view.findViewById(R.id.text_view_title);
                textView.setText("Congratulations!");
                textView.setTextSize(50);

                gifImageView = (GifImageView) view.findViewById(R.id.gif);
                gifImageView.setImageResource(R.drawable.celebrate);

                textView = (TextView) view.findViewById(R.id.description);
                textView.setText("Congratualtions for passing all the courses til here! :D. Enjoy the incoming courses hehehehe >:D");
                textView.setTextSize(25);
                break;

            case 2:
                imageView = (ImageView) view.findViewById(R.id.icon);
                imageView.setImageResource(R.drawable.guess);

                textView = (TextView) view.findViewById(R.id.text_view_title);
                textView.setText("Secret!");
                textView.setTextSize(50);
                textView.setTextColor(Color.parseColor("#ffffff"));


                gifImageView = (GifImageView) view.findViewById(R.id.gif);
                gifImageView.setImageResource(R.drawable.lock);

                textView = (TextView) view.findViewById(R.id.description);
                textView.setText("To be unlocked in the future");
                textView.setTextSize(25);

                CardView cardView = (CardView) view.findViewById(R.id.cardView);
                cardView.setBackgroundColor(Color.parseColor("#808080"));

                break;
            default:
                imageView = (ImageView) view.findViewById(R.id.icon);
                imageView.setImageResource(R.drawable.bday);

                textView = (TextView) view.findViewById(R.id.text_view_title);
                textView.setText("TITLE");

                gifImageView = (GifImageView) view.findViewById(R.id.gif);
                gifImageView.setImageResource(R.drawable.dance);

                textView = (TextView) view.findViewById(R.id.description);
                textView.setText("Happy bday");
                break;
        }




        container.addView(view);
        return view;
    }


}
