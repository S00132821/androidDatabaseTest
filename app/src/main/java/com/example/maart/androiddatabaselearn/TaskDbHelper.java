package com.example.maart.androiddatabaselearn;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import static com.example.maart.androiddatabaselearn.TaskDbSchema.*;

/**
 * Created by maart on 24/08/2016.
 */
public class TaskDbHelper extends SQLiteOpenHelper {


    private static final int VERSION = 1;
    private static final String DATABASE_NAME = "tasksBase.db";

    public TaskDbHelper(Context context) {
        super(context, DATABASE_NAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table" + TaskTable.name + "("
                + "_id integer primary key autoincrement, " +
                TaskTable.Cols.ID + ", " +
                TaskTable.Cols.TITLE + ", " +
                TaskTable.Cols.DATE + ", " +
                TaskTable.Cols.SOLVED + ")");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
