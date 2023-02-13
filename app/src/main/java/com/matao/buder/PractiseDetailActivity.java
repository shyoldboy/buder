package com.matao.buder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.matao.buder.entity.Practice;

import org.w3c.dom.Text;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class PractiseDetailActivity extends AppCompatActivity {
    private Map<String,String> radiomap = null;
    private List<Practice> practices = null;
    private int nowlocal = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise);
        practices = new LinkedList<Practice>();
        radiomap = new HashMap<String,String>();
        radiomap.put("A","1");
        radiomap.put("B","2");
        radiomap.put("C","3");
        radiomap.put("D","4");
        Practice p1 = new Practice(1,true,"中国大约多少人口？",radiomap);
        Practice p2 = new Practice(2,true,"美国大约多少人口？",radiomap);
        Practice p3 = new Practice(3,true,"日本大约多少人口？",radiomap);
        Practice p4 = new Practice(4,true,"韩国大约多少人口？",radiomap);
        practices.add(p1);
        practices.add(p2);
        practices.add(p3);
        practices.add(p4);
        this.change_title(practices.get(0));
        //点击对应item做出对应的操作 current_no
        Intent intent = getIntent();
        String position = intent.getStringExtra("position") + "";
        Button nextId = (Button) findViewById(R.id.nextId);
        nextId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (nowlocal <= (practices.size() - 2)){
                    nowlocal +=1;
                }
                Practice p = practices.get(nowlocal);
                PractiseDetailActivity.this.change_title(p);
            }
        });

        Button upId = (Button) findViewById(R.id.upId);
        upId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (nowlocal >= 1){
                    nowlocal -=1;
                }
                Practice p = practices.get(nowlocal);
                PractiseDetailActivity.this.change_title(p);
            }
        });
    }
    public void change_title(Practice p1){
        TextView current_no = (TextView) findViewById(R.id.current_no);
        current_no.setText(p1.getPrac_no() + "");
        TextView current_sum = (TextView) findViewById(R.id.current_sum);
        current_sum.setText(practices.size() + "");
        TextView isradioId = (TextView) findViewById(R.id.isradioId);
        if(p1.isIsradio()){
            isradioId.setText("(单选题)");
        }
        else{
            isradioId.setText("(多选题)");
        }
        RadioButton radiobtnA = (RadioButton) findViewById(R.id.radiobtnA);
        radiobtnA.setText(p1.getRadiomap().get("A").toString());

        RadioButton radiobtnB = (RadioButton) findViewById(R.id.radiobtnB);
        radiobtnB.setText(p1.getRadiomap().get("A").toString());

        RadioButton radiobtnC = (RadioButton) findViewById(R.id.radiobtnC);
        radiobtnC.setText(p1.getRadiomap().get("A").toString());

        RadioButton radiobtnD = (RadioButton) findViewById(R.id.radiobtnD);
        radiobtnD.setText(p1.getRadiomap().get("A").toString());

    }

}