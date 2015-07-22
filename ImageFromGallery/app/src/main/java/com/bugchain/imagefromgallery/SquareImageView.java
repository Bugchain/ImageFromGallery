package com.bugchain.imagefromgallery;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

/**
 * Created by POSEIDON on 21/7/2558.
 */
public class SquareImageView extends ImageView {
    public SquareImageView(Context context) {
        super(context);
    }

    public SquareImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public SquareImageView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        int width = getMeasuredWidth();
        setMeasuredDimension(width,width);
    }
}
