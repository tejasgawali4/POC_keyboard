package com.in.prisms.poc_keyboard;

import android.app.ProgressDialog;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.app.SearchManager;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.SearchView.OnQueryTextListener;

import com.amitshekhar.DebugDB;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    UserBean studentBean,studentBean1;
    ArrayList<UserBean> studentDetails;
    UserDBHelper userDBHelper;
    TopSchoolDB mySql = new TopSchoolDB();
    SearchView searchView;

    private ProgressDialog pDialog;
    ListView postListView;
    public MainActivity CustomViewPost = null;
    UserDisplayAdapter adapter;
    Resources res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        searchView = (SearchView) findViewById(R.id.search);

        res = getResources();

        CustomViewPost = this;

        postListView= (ListView) findViewById(R.id.Listiview);

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextChange(String newText) {
                // your text view here
                Log.d("search", "this" + newText);
                if (newText.length() == 10)
                {
                    search(newText);

                }


                return true;
            }

            @Override
            public boolean onQueryTextSubmit(String query) {
                Log.d("search", "this" + query);
                if (query.length() == 10)
                {
                    search(query);
                }
                return true;
            }
        });


        studentBean = new UserBean();
        //studentDetails = new ArrayList<UserBean>();

        Log.d("UserDatabase", "init");
        try
        {

            //DebugDB.getAddressLog();
            userDBHelper = new UserDBHelper(getApplicationContext());
            addDate1();
            userDBHelper.AddStudentProfile(studentBean);
            addDate2();
            userDBHelper.AddStudentProfile(studentBean);
            addDate3();
            userDBHelper.AddStudentProfile(studentBean);
            addDate4();
            userDBHelper.AddStudentProfile(studentBean);
            addDate5();
            userDBHelper.AddStudentProfile(studentBean);
            addDate6();
            userDBHelper.AddStudentProfile(studentBean);
            addDate7();
            userDBHelper.AddStudentProfile(studentBean);
            addDate8();
            userDBHelper.AddStudentProfile(studentBean);
            addDate9();
            userDBHelper.AddStudentProfile(studentBean);


/*            //get all student from database

            ArrayList<UserBean> studentList = new ArrayList<UserBean>();
            studentBean1 = new UserBean();
            studentList = userDBHelper.getAllStudentDetails();
            Log.d("UserDatabase", "studentBean1" + studentList.get(1).getScanId());*/


        }
        catch(Exception e)
        {
            System.out.print(e);
        }

    }

    void search(String query)
    {
        studentBean1 = new UserBean();
        studentBean1 = userDBHelper.fetchRecordByUserId(query);
        Log.d("UserDatabase", "studentBean1" + studentBean1.getFirstname());

        adapter = new UserDisplayAdapter(CustomViewPost, studentBean1 , res);

        postListView.setAdapter(adapter);

    }



    void addDate1()
    {
        Log.d("UserDatabase", "db ");

        studentBean.setFirstname("Tejas");
        studentBean.setLastName("Gawali");
        studentBean.setClassName("10th");
        studentBean.setDivName("X");
        studentBean.setMobileNo("8888876264");
        studentBean.setStudentAvtar("https://s3.amazonaws.com/uploads.hipchat.com/260947/5341823/gUjGZRdvb8xMj2r/photo-1.jpg");
        studentBean.setLongitude("SASD");
        studentBean.setLatitude("ASD");
        studentBean.setFlag("ASD");
        studentBean.setScanId("0004962450");
    }

    void addDate2()
    {
        studentDetails.add(studentBean);

        studentBean.setFirstname("Nadeem");
        studentBean.setLastName("Sayad");
        studentBean.setClassName("10th");
        studentBean.setDivName("X");
        studentBean.setMobileNo("8888876264");
        studentBean.setStudentAvtar("https://s3.amazonaws.com/uploads.hipchat.com/260947/5341823/gUjGZRdvb8xMj2r/photo-1.jpg");
        studentBean.setLongitude("ASD");
        studentBean.setLatitude("ASD");
        studentBean.setFlag("ASD");
        studentBean.setScanId("0002580404");

        studentDetails.add(studentBean);

    }

    void addDate3()
    {
        studentBean.setFirstname("Nikhil");
        studentBean.setLastName("Ladge");
        studentBean.setClassName("10th");
        studentBean.setDivName("X");
        studentBean.setMobileNo("8888876264");
        studentBean.setStudentAvtar("https://s3.amazonaws.com/uploads.hipchat.com/260947/5341823/gUjGZRdvb8xMj2r/photo-1.jpg");
        studentBean.setLongitude("AD");
        studentBean.setLatitude("ASD");
        studentBean.setFlag("AD");
        studentBean.setScanId("0004882605");

        studentDetails.add(studentBean);

        Log.d("UserDatabase", "db " + studentDetails);
    }

    void addDate4()
    {
        studentBean.setFirstname("Nikhil");
        studentBean.setLastName("Ladge");
        studentBean.setClassName("10th");
        studentBean.setDivName("X");
        studentBean.setMobileNo("8888876264");
        studentBean.setStudentAvtar("https://s3.amazonaws.com/uploads.hipchat.com/260947/5341823/gUjGZRdvb8xMj2r/photo-1.jpg");
        studentBean.setLongitude("AD");
        studentBean.setLatitude("ASD");
        studentBean.setFlag("AD");
        studentBean.setScanId("0005858954");

        studentDetails.add(studentBean);

        Log.d("UserDatabase", "db " + studentDetails);
    }

    void addDate5()
    {
        studentBean.setFirstname("Nikhil");
        studentBean.setLastName("Ladge");
        studentBean.setClassName("10th");
        studentBean.setDivName("X");
        studentBean.setMobileNo("8888876264");
        studentBean.setStudentAvtar("https://s3.amazonaws.com/uploads.hipchat.com/260947/5341823/gUjGZRdvb8xMj2r/photo-1.jpg");
        studentBean.setLongitude("AD");
        studentBean.setLatitude("ASD");
        studentBean.setFlag("AD");
        studentBean.setScanId("0004521168");

        studentDetails.add(studentBean);

        Log.d("UserDatabase", "db " + studentDetails);
    }

    void addDate6()
    {
        studentBean.setFirstname("Nikhil");
        studentBean.setLastName("Ladge");
        studentBean.setClassName("10th");
        studentBean.setDivName("X");
        studentBean.setMobileNo("8888876264");
        studentBean.setStudentAvtar("https://s3.amazonaws.com/uploads.hipchat.com/260947/5341823/gUjGZRdvb8xMj2r/photo-1.jpg");
        studentBean.setLongitude("AD");
        studentBean.setLatitude("ASD");
        studentBean.setFlag("AD");
        studentBean.setScanId("0004519218");

        studentDetails.add(studentBean);

        Log.d("UserDatabase", "db " + studentDetails);
    }

    void addDate7()
    {
        studentBean.setFirstname("Nikhil");
        studentBean.setLastName("Ladge");
        studentBean.setClassName("10th");
        studentBean.setDivName("X");
        studentBean.setMobileNo("8888876264");
        studentBean.setStudentAvtar("https://s3.amazonaws.com/uploads.hipchat.com/260947/5341823/gUjGZRdvb8xMj2r/photo-1.jpg");
        studentBean.setLongitude("AD");
        studentBean.setLatitude("ASD");
        studentBean.setFlag("AD");
        studentBean.setScanId("0004900292");

        studentDetails.add(studentBean);

        Log.d("UserDatabase", "db " + studentDetails);
    }

    void addDate8()
    {
        studentBean.setFirstname("Nikhil");
        studentBean.setLastName("Ladge");
        studentBean.setClassName("10th");
        studentBean.setDivName("X");
        studentBean.setMobileNo("8888876264");
        studentBean.setStudentAvtar("https://s3.amazonaws.com/uploads.hipchat.com/260947/5341823/gUjGZRdvb8xMj2r/photo-1.jpg");
        studentBean.setLongitude("AD");
        studentBean.setLatitude("ASD");
        studentBean.setFlag("AD");
        studentBean.setScanId("0004895830");

        studentDetails.add(studentBean);

        Log.d("UserDatabase", "db " + studentDetails);
    }

    void addDate9()
    {
        studentBean.setFirstname("Nikhil");
        studentBean.setLastName("Ladge");
        studentBean.setClassName("10th");
        studentBean.setDivName("X");
        studentBean.setMobileNo("8888876264");
        studentBean.setStudentAvtar("https://s3.amazonaws.com/uploads.hipchat.com/260947/5341823/gUjGZRdvb8xMj2r/photo-1.jpg");
        studentBean.setLongitude("AD");
        studentBean.setLatitude("ASD");
        studentBean.setFlag("AD");
        studentBean.setScanId("0004888015");

        studentDetails.add(studentBean);

        Log.d("UserDatabase", "db " + studentDetails);
    }


}
