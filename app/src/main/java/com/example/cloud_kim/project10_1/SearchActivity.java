package com.example.cloud_kim.project10_1;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import static com.example.cloud_kim.project10_1.R.id.ListView;

/**
 * Created by Cloud_Kim on 2016-11-14.
 */

public class SearchActivity extends AppCompatActivity{
    static final String[] LIST_MENU = {"짱아내", "돈발해", "엉터리 생고기"};
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search);
        ArrayAdapter Search_Adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, LIST_MENU);
        ListView listview = (ListView) findViewById(R.id.ListView);
        listview.setAdapter(Search_Adapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView parent, View v, int position, long id) {
                String strText = (String) parent.getItemAtPosition(position);
            }
        });
    }


}
