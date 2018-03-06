package com.in.prisms.poc_keyboard;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

/**
 * Created by prisms on 3/5/2018.
 */

public class UserDBAdapter extends TopSchoolDB {


    private static final String DATABASE_TABLE = "profileDetails";

    public static final String KEY_STUDENT_NAME = "studentName";
    public static final String KEY_STUDENT_CLASS = "studentClass";
    public static final String KEY_STUDENT_DIV = "studentDiv";
    public static final String KEY_STUDENT_MOBILE = "studentMobile";
    public static final String KEY_STUDENT_AVTAR = "studentAvtar";
    public static final String KEY_LONGITUDE = "studentlongitude";
    public static final String KEY_LATITUDE = "studentlatitude";
    public static final String KEY_FLOG = "studentflag";
    public static final String KEY_SCAN_ID = "scanId";

    public UserDBAdapter(Context mContext)
    {
        super();
    }

    public boolean AddUser(UserBean studentBean) {

        ContentValues args = new ContentValues();
        args.put(KEY_STUDENT_NAME, studentBean.getFirstname() +" "+studentBean.getLastName() );
        args.put(KEY_STUDENT_CLASS, studentBean.getClassName());
        args.put(KEY_STUDENT_DIV, studentBean.getDivName());
        args.put(KEY_STUDENT_MOBILE, studentBean.getMobileNo());
        args.put(KEY_STUDENT_AVTAR, studentBean.getStudentAvtar());
        args.put(KEY_LONGITUDE, studentBean.getLongitude());
        args.put(KEY_LATITUDE, studentBean.getLatitude());
        args.put(KEY_FLOG, studentBean.getFlag());
        args.put(KEY_SCAN_ID, studentBean.getScanId());

        int numberofRowsaffected = mySqliteDB.update(DATABASE_TABLE, args, KEY_SCAN_ID + "=?",new String[]{studentBean.getScanId()});

        if(  numberofRowsaffected == 0) // no row was found so we need to create one
        {
            mySqliteDB.insert(DATABASE_TABLE, null, args);
            return true;
        }
        else if(  numberofRowsaffected  != 1)  // more than/less than 1 row was found so we are in trouble :P   ( this already takes care of 0 by the else if)
        {
            return false;
        }

        return true;  // all is well  .. only 1 row was updated
    }

    public Cursor getBeanFromNotesId(String id)
    {
        Log.d("id","id :-" +id);
        return mySqliteDB.query(DATABASE_TABLE, new String[]{KEY_STUDENT_NAME,KEY_STUDENT_CLASS,KEY_STUDENT_DIV,KEY_STUDENT_MOBILE,KEY_STUDENT_AVTAR,KEY_LONGITUDE,KEY_LATITUDE,KEY_FLOG,KEY_SCAN_ID}, KEY_SCAN_ID + "=?", new String[]{id}, null, null, null);
    }

    public Cursor getAllStudents()
    {
        return mySqliteDB.query(DATABASE_TABLE, new String[]{KEY_STUDENT_NAME,KEY_STUDENT_CLASS,KEY_STUDENT_DIV,KEY_STUDENT_MOBILE,KEY_STUDENT_AVTAR,KEY_LONGITUDE,KEY_LATITUDE,KEY_FLOG,KEY_SCAN_ID}, null, null, null, null, null);
    }

}
