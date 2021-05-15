package com.example.term;

import android.graphics.drawable.Drawable;
import android.media.Rating;
import android.widget.RatingBar;

public class ListViewItem {
    private Drawable icon;
    private RatingBar star;
    private String text;
    private float numStar;

    public void setIcon(Drawable icon)
    {
        this.icon = icon;
    }

    public void setNumStar(float star)
    {
        this.numStar = star;
    }
    public void setText(String text)
    {
        this.text = text;
    }
    public Drawable getIcon() {
        return this.icon ;
    }
    public float getNumStar() {
        return this.numStar ;
    }
    public RatingBar getStar()
    {
        return this.star;
    }
    public String getText() {
        return this.text ;
    }
}
