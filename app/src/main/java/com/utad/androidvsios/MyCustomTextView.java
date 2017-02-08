package com.utad.androidvsios;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by cdiaz on 8/2/17.
 */

public class MyCustomTextView extends TextView {
    public MyCustomTextView(Context context) {
        super(context);
        Typeface face = Typeface.createFromAsset(context.getAssets(), "font.ttf");
        this.setTypeface(face);
        setTextColor(Color.BLUE);
    }

    public MyCustomTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        Typeface face = Typeface.createFromAsset(context.getAssets(), "font.ttf");
        this.setTypeface(face);
        setTextColor(Color.BLUE);

    }

    public MyCustomTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        Typeface face = Typeface.createFromAsset(context.getAssets(), "font.ttf");
        this.setTypeface(face);
        setTextColor(Color.BLUE);
    }
}


