package com.matao.buder.adaper;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.matao.buder.R;
import com.matao.buder.entity.Subject;

import java.util.LinkedList;

public class PractiseAdapter extends BaseAdapter{
    private LinkedList<Subject> mData;
    private Context mContext;

    public PractiseAdapter(LinkedList<Subject> mData, Context mContext) {
        this.mData = mData;
        this.mContext = mContext;
    }

    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(mContext).inflate(R.layout.item_list_subject,parent,false);
        ImageView img_icon = (ImageView) convertView.findViewById(R.id.icon_in);
        TextView txt_aName = (TextView) convertView.findViewById(R.id.text_in);
        img_icon.setBackgroundResource(mData.get(position).getIcon());
        txt_aName.setText(mData.get(position).getName());
        return convertView;
    }
}
