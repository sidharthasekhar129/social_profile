package com.example.profiledesign1;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class ImageAdapter1 extends PagerAdapter {
    private Context mcontext;
    private int[] imagesid=new  int[]  {R.drawable.f2,R.drawable.f1,R.drawable.f3,R.drawable.f4};
    ImageAdapter1(Context context)
    {
        mcontext=context;
    }
    @Override
    public int getCount() {
        return imagesid.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view==object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        ImageView imageView=new ImageView(mcontext);
 //  imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);//
        imageView.setImageResource(imagesid[position]);
        container.addView(imageView,0);
        return imageView;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((ImageView) object);
    }
}
