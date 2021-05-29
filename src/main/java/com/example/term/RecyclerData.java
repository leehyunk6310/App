package com.example.term;

public class RecyclerData {
    private String title;
    private int numOfReview;
    private int resId;
    private float numStars;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumOfReview() {
        return numOfReview;
    }

    public void setNumOfReview(int numOfReview) {
        this.numOfReview = numOfReview;
    }

    public float getNumStars(){
        return numStars;
    }
    public void setNumStars(float numStars){
        this.numStars = numStars;
    }

    public int getResId() {
        return resId;
    }

    public void setResId(int resId) {
        this.resId = resId;
    }

}

