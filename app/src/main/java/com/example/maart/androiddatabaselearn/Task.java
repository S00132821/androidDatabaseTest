package com.example.maart.androiddatabaselearn;

import java.util.Date;

/**
 * Created by maart on 24/08/2016.
 */
public class Task {
    private int mId;
    private String mTitle;
    private Date mDate;
    private Boolean mSolved;

    public int getmId() {
        return mId;
    }

    public Date getmDate() {
        return mDate;
    }

    public void setmDate(Date mDate) {
        this.mDate = mDate;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public Boolean getmSolved() {
        return mSolved;
    }

    public void setmSolved(Boolean mSolved) {
        this.mSolved = mSolved;
    }

    public Task(int id, String title, Date date, Boolean solved) {
        mId = id;
        mTitle = title;
        mDate = date;
        mSolved = solved;


    }
}
