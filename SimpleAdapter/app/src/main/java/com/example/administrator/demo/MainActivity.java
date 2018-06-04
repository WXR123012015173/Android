package com.example.administrator.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ListView;
import android.widget.SimpleAdapter;

public class MainActivity extends AppCompatActivity {
    // 定义一个数组，用来保存图片的名称
    private String[] names = { "Lion", "Tiger", "Monkey" ,"Dog","Cat","Elephant"};
    // 定义一个数组，用来保存图片的编号
    private int[] imageId = { R.drawable.lion, R.drawable.tiger,
            R.drawable.monkey, R.drawable.dog,R.drawable.cat,R.drawable.elephant };
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 设置该Activity的显示界面为R.layout.activity_main
        setContentView(R.layout.activity_main);
        //创建一个集合，用来保存列表项，如兔爷的图片，和兔爷名字
        List<Map<String, Object>> listItems = new ArrayList<Map<String, Object>>();
        for (int i = 0; i < names.length; i++) {
            //创建map集合，用来保存具体的列表
            Map<String, Object> listItem = new HashMap<String, Object>();
            listItem.put("header", imageId[i ]);
            listItem.put("personName", names[i]);
            //将列表添加到列表项中
            listItems.add(listItem);
        }
        SimpleAdapter adapter = new SimpleAdapter(this, listItems,
                R.layout.activity_main,
                new String[] { "personName", "header" }, new int[] {
                R.id.names, R.id.header });
        ListView list = (ListView) findViewById(R.id.list3);
        list.setAdapter(adapter);
    }
}
