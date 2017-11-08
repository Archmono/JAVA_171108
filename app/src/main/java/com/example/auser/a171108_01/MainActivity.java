package com.example.auser.a171108_01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    ArrayList<Map<String, Object>> mylist;
    SimpleAdapter simpleAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = (ListView) findViewById(R.id.listView);
        mylist = new ArrayList<>();
        HashMap<String, Object> m1 = new HashMap<>();
        m1.put("city", "台北");
        m1.put("code", "02");
        m1.put("img", R.drawable.mobs1002);
        HashMap<String, Object> m2 = new HashMap<>();
        m2.put("city", "台中");
        m2.put("code", "04");
        m2.put("img", R.drawable.mobs1019);
        HashMap<String, Object> m3 = new HashMap<>();
        m3.put("city", "台南");
        m3.put("code", "06");
        m3.put("img", R.drawable.mobs1241);
        mylist.add(m1);
        mylist.add(m2);
        mylist.add(m3);

        simpleAdapter = new SimpleAdapter(this, mylist, R.layout.myitem,
                new String[] {"city", "code", "img"}, new int[] {R.id.textView, R.id.textView2, R.id.imageView});
        lv.setAdapter(simpleAdapter);

//        Glide.with(this.img3.getContext()).load(R.drawable.mobs1002).error(android.R.drawable.alert_dark_frame).placeholder(android.R.drawable.alert_dark_frame).into(img3);
    }
}
