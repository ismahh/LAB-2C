package com.example.lab2coct2021;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {

    private Context mContext;

    public Integer[] thumbImages = {
            R.drawable.pic1, R.drawable.pic2, R.drawable.pic3,
            R.drawable.pic4, R.drawable.pic5, R.drawable.pic6,
            R.drawable.pic7, R.drawable.pic8, R.drawable.pic9,
            R.drawable.pic10, R.drawable.pic11
    };

    public ImageAdapter(Context c) {mContext=c;}

    public int getCount() {return thumbImages.length;}
    public Object getItem(int position){ return null; }
    public long getItemId(int position) {
        return 0;
    }

    public View getView(int position, View converView, ViewGroup parent){
        ImageView imageView = new ImageView (mContext) ;
        imageView.setLayoutParams(new ViewGroup.LayoutParams(250,250));
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setPadding(8, 8, 8, 8);
        imageView.setImageResource(thumbImages[position]);

        return imageView;
    }

}
