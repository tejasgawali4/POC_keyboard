package com.in.prisms.poc_keyboard;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by prisms on 3/5/2018.
 */

public class TopSchoolDB {

    public static String DATABASE_NAME = "topschooldb";
    protected SQLiteDatabase mySqliteDB;
    protected DatabaseHelper mDbHelper;


    public TopSchoolDB open(Context context)
    {
        mDbHelper = new DatabaseHelper(context);
        mySqliteDB = mDbHelper.getWritableDatabase();
        Log.d("log UserDatabase", "db opened");
        return this;
    }

    public void close(){
        Log.d("UserDatabase", "db closed");
        mySqliteDB.close();
    }

    public void finalClose(){
        mDbHelper.close();
    }

    private static class DatabaseHelper extends SQLiteOpenHelper
    {

        DatabaseHelper(Context context) {
            super(context, DATABASE_NAME, null, 1);
        }

        @Override
        public void onCreate(SQLiteDatabase db) {
            // TODO Auto-generated method stub
            String CREATE_PROFILE_TABLE="create table profileDetails(studentName text,studentClass text,studentDiv text,studentMobile text, studentAvtar text, studentlongitude text, studentlatitude text, studentflag text , scanID text);";
            db.execSQL(CREATE_PROFILE_TABLE);

            Log.d("oncreate", "table created");
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {



            if(newVersion > oldVersion)
            {

                //onCreate(db);
            }

        }
    }
}
