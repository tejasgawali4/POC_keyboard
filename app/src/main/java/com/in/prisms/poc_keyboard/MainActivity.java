package com.in.prisms.poc_keyboard;

import android.app.ProgressDialog;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ListView;
import android.widget.SearchView;

import com.amitshekhar.DebugDB;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    UserBean studentBean, studentBean1;
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

        postListView = (ListView) findViewById(R.id.Listiview);

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextChange(String newText) {
                // your text view here
                Log.d("search", "this" + newText);
                if (newText.length() == 10) {
                    search(newText);

                }


                return true;
            }

            @Override
            public boolean onQueryTextSubmit(String query) {
                Log.d("search", "this" + query);
                if (query.length() == 10) {
                    search(query);
                }
                return true;
            }
        });

        //studentDetails = new ArrayList<UserBean>();

        Log.d("UserDatabase", "init");
        try {

            DebugDB.getAddressLog();
            studentBean = new UserBean();
            userDBHelper = new UserDBHelper(getApplicationContext());

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

            userDBHelper.AddStudentProfile(studentBean);

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

            userDBHelper.AddStudentProfile(studentBean);

            studentBean.setFirstname("Nikhil");
            studentBean.setLastName("Ladasdge");
            studentBean.setClassName("10th");
            studentBean.setDivName("X");
            studentBean.setMobileNo("8888876264");
            studentBean.setStudentAvtar("https://s3.amazonaws.com/uploads.hipchat.com/260947/5341823/gUjGZRdvb8xMj2r/photo-1.jpg");
            studentBean.setLongitude("AD");
            studentBean.setLatitude("ASD");
            studentBean.setFlag("AD");
            studentBean.setScanId("0004882605");

            userDBHelper.AddStudentProfile(studentBean);

            studentBean.setFirstname("Rajesh");
            studentBean.setLastName("Laadsdge");
            studentBean.setClassName("10th");
            studentBean.setDivName("X");
            studentBean.setMobileNo("8888876264");
            studentBean.setStudentAvtar("https://s3.amazonaws.com/uploads.hipchat.com/260947/5341823/gUjGZRdvb8xMj2r/photo-1.jpg");
            studentBean.setLongitude("AD");
            studentBean.setLatitude("ASD");
            studentBean.setFlag("AD");
            studentBean.setScanId("0005858954");

            userDBHelper.AddStudentProfile(studentBean);

            studentBean.setFirstname("Ram");
            studentBean.setLastName("Ladadge");
            studentBean.setClassName("10th");
            studentBean.setDivName("X");
            studentBean.setMobileNo("8888876264");
            studentBean.setStudentAvtar("https://s3.amazonaws.com/uploads.hipchat.com/260947/5341823/gUjGZRdvb8xMj2r/photo-1.jpg");
            studentBean.setLongitude("AD");
            studentBean.setLatitude("ASD");
            studentBean.setFlag("AD");
            studentBean.setScanId("0004521168");

            userDBHelper.AddStudentProfile(studentBean);

            studentBean.setFirstname("Sam");
            studentBean.setLastName("Ladasdge");
            studentBean.setClassName("10th");
            studentBean.setDivName("X");
            studentBean.setMobileNo("8888876264");
            studentBean.setStudentAvtar("https://s3.amazonaws.com/uploads.hipchat.com/260947/5341823/gUjGZRdvb8xMj2r/photo-1.jpg");
            studentBean.setLongitude("AD");
            studentBean.setLatitude("ASD");
            studentBean.setFlag("AD");
            studentBean.setScanId("0004519218");

            userDBHelper.AddStudentProfile(studentBean);

            studentBean.setFirstname("Carl");
            studentBean.setLastName("Ladasdge");
            studentBean.setClassName("10th");
            studentBean.setDivName("X");
            studentBean.setMobileNo("8888876264");
            studentBean.setStudentAvtar("https://s3.amazonaws.com/uploads.hipchat.com/260947/5341823/gUjGZRdvb8xMj2r/photo-1.jpg");
            studentBean.setLongitude("AD");
            studentBean.setLatitude("ASD");
            studentBean.setFlag("AD");
            studentBean.setScanId("0004900292");

            userDBHelper.AddStudentProfile(studentBean);

            studentBean.setFirstname("Nikhil");
            studentBean.setLastName("Lasddge");
            studentBean.setClassName("10th");
            studentBean.setDivName("X");
            studentBean.setMobileNo("8888876264");
            studentBean.setStudentAvtar("https://s3.amazonaws.com/uploads.hipchat.com/260947/5341823/gUjGZRdvb8xMj2r/photo-1.jpg");
            studentBean.setLongitude("AD");
            studentBean.setLatitude("ASD");
            studentBean.setFlag("AD");
            studentBean.setScanId("0004895830");

            userDBHelper.AddStudentProfile(studentBean);

            studentBean.setFirstname("asdds");
            studentBean.setLastName("Ladasdge");
            studentBean.setClassName("10th");
            studentBean.setDivName("X");
            studentBean.setMobileNo("8888876264");
            studentBean.setStudentAvtar("https://s3.amazonaws.com/uploads.hipchat.com/260947/5341823/gUjGZRdvb8xMj2r/photo-1.jpg");
            studentBean.setLongitude("AD");
            studentBean.setLatitude("ASD");
            studentBean.setFlag("AD");
            studentBean.setScanId("0004888015");

            userDBHelper.AddStudentProfile(studentBean);



/*            //get all student from database

            ArrayList<UserBean> studentList = new ArrayList<UserBean>();
            studentBean1 = new UserBean();
            studentList = userDBHelper.getAllStudentDetails();
            Log.d("UserDatabase", "studentBean1" + studentList.get(1).getScanId());*/


        } catch (Exception e) {
            System.out.print(e);
        }

    }

    void search(String query) {
        studentBean1 = new UserBean();
        studentBean1 = userDBHelper.fetchRecordByUserId(query);
        Log.d("UserDatabase", "getScanId" + studentBean1.getScanId());

        adapter = new UserDisplayAdapter(CustomViewPost, studentBean1, res);

        postListView.setAdapter(adapter);

    }

}
