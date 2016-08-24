package com.example.maart.androiddatabaselearn;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by maart on 24/08/2016.
 */
public class TasksCollection {
    private List<Task> mTasks;
    private Context mContext;
    private SQLiteDatabase mDatabase;

    public TasksCollection(Context context){
        mContext = context.getApplicationContext();
        mDatabase = new TaskDbHelper(mContext).getWritableDatabase();
        mTasks = new ArrayList<>();
    }
}
