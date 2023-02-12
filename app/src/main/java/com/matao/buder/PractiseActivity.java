package com.matao.buder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.matao.buder.adaper.PractiseAdapter;
import com.matao.buder.entity.Subject;
import com.matao.buder.PractiseDetailActivity;

import java.util.LinkedList;
import java.util.List;

public class PractiseActivity extends AppCompatActivity{
    private List<Subject> mData = null;
    private Context mContext;
    private PractiseAdapter mAdapter = null;
    private ListView list_animal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practise);
        mContext = PractiseActivity.this;
        list_animal = (ListView) findViewById(R.id.practiseListId);
        mData = new LinkedList<Subject>();
        mData.add(new Subject("Python", R.drawable.ic_launcher_background,""));
        mData.add(new Subject("Java", R.drawable.ic_launcher_background,""));
        mData.add(new Subject("财务考试", R.drawable.ic_launcher_background,""));
        mAdapter = new PractiseAdapter((LinkedList<Subject>) mData, mContext);
        list_animal.setAdapter(mAdapter);
        list_animal.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Intent intent;
                intent = new Intent(mContext,PractiseDetailActivity.class);
                intent.putExtra("position",position);
                startActivity(intent);
            }
        });
    }
}