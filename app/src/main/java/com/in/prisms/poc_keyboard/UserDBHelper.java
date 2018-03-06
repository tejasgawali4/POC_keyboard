package com.in.prisms.poc_keyboard;

import android.content.Context;
import android.database.Cursor;
import android.util.Log;

import java.util.ArrayList;

/**
 * Created by prisms on 3/5/2018.
 */

public class UserDBHelper {

    private UserDBAdapter userDBAdapter;
    Context mContext;

    public UserDBHelper(Context mContext)
    {
        this.mContext = mContext;
        userDBAdapter = new UserDBAdapter(mContext);
    }

    public ArrayList<UserBean> getAllStudentDetails()
    {
        ArrayList<UserBean> studentList = new ArrayList<UserBean>();
        userDBAdapter.open(mContext);
        Cursor cursor = userDBAdapter.getAllStudents();
        if(cursor!=null)
        {
            cursor.moveToFirst();
            while(!cursor.isAfterLast())
            {
                studentList.add(getBeanFromCursor(cursor));
                cursor.moveToNext();
            }
            cursor.close();
            userDBAdapter.close();
        }
        return studentList;
    }

    public boolean AddStudentProfile(UserBean studentBean)
    {
        Log.d("UserDatabase", "db profile");
        boolean result = false;
        userDBAdapter.open(mContext);
        result = userDBAdapter.AddUser(studentBean);
        Log.d("UserDatabase", "db result" + result);
        userDBAdapter.close();
        return result;
    }


    public UserBean fetchRecordByUserId(String userId)
    {
        UserBean studentBean = new UserBean();
        userDBAdapter.open(mContext);
        Cursor cursor = userDBAdapter.getBeanFromNotesId(userId);
        if(cursor!=null)
        {
            cursor.moveToFirst();
            if(!cursor.isAfterLast())
            {
                studentBean = getBeanFromCursor(cursor);
            }
        }
        cursor.close();
        userDBAdapter.close();
        return studentBean;
    }


    public UserBean getBeanFromCursor(Cursor cursor)
    {
        UserBean studentBean = new UserBean();
        studentBean.setFirstname(cursor.getString(cursor.getColumnIndex(userDBAdapter.KEY_STUDENT_NAME)));
        studentBean.setClassName(cursor.getString(cursor.getColumnIndex(userDBAdapter.KEY_STUDENT_CLASS)));
        studentBean.setDivName(cursor.getString(cursor.getColumnIndex(userDBAdapter.KEY_STUDENT_DIV)));
        studentBean.setMobileNo(cursor.getString(cursor.getColumnIndex(userDBAdapter.KEY_STUDENT_MOBILE)));
        studentBean.setStudentAvtar(cursor.getString(cursor.getColumnIndex(userDBAdapter.KEY_STUDENT_AVTAR)));
        studentBean.setLongitude(cursor.getString(cursor.getColumnIndex(userDBAdapter.KEY_LONGITUDE)));
        studentBean.setLatitude(cursor.getString(cursor.getColumnIndex(userDBAdapter.KEY_LATITUDE)));
        studentBean.setFlag(cursor.getString(cursor.getColumnIndex(userDBAdapter.KEY_FLOG)));
        studentBean.setScanId(cursor.getString(cursor.getColumnIndex(userDBAdapter.KEY_SCAN_ID)));
        return studentBean;
    }


}
