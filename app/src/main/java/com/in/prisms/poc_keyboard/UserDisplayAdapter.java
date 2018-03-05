package com.in.prisms.poc_keyboard;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import static android.R.attr.data;

/**
 * Created by prisms on 3/5/2018.
 */

public class UserDisplayAdapter extends BaseAdapter{


    UserDBHelper notificationhelper;
    UserBean userBean;
    private static LayoutInflater inflater = null;
    public Resources res;
    private Activity activity;

    public UserDisplayAdapter(MainActivity customViewPost, UserBean studentBean1, Resources res1) {
        activity = customViewPost;
        userBean = studentBean1;
        res = res1;

        inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return 1;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        if(convertView == null)
        {
            convertView = inflater.inflate(R.layout.userlist,null);
            holder = new ViewHolder();

            holder.name = (TextView) convertView.findViewById(R.id.UserName);
            holder.div = (TextView) convertView.findViewById(R.id.Class);
        }
        else
        {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.name.setText(userBean.getFirstname());
        holder.div.setText(userBean.getScanId());
        Log.d("scanId" , "" + userBean.getScanId());
        Log.d("Name" , "" + userBean.getFirstname());

        convertView.setTag(holder);

        return convertView;
    }

    @Override
    public CharSequence[] getAutofillOptions() {
        return new CharSequence[0];
    }

    public static class ViewHolder
    {

        public TextView name ,div;

    }
}
