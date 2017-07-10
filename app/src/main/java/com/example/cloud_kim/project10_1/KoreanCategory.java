package com.example.cloud_kim.project10_1;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by Cloud_Kim on 2016-11-23.
 */

public class KoreanCategory extends AppCompatActivity {
    static final String[] LIST_MENU = {"송이식당", "정정아식당", "파불고기","스페이스","뚝닭","한솥","지지고","투스타","신전떡볶이","신신원","가대돈까스","미쳐버린 파닭","메밀꽃 필 무렵","크라잉치즈버거","엄마손칼국시","토천칼국수"} ;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.koreancategory);
        ArrayAdapter KoreanAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, LIST_MENU);
        ListView KoreanListView = (ListView) findViewById(R.id.KoreanList);
        KoreanListView.setAdapter(KoreanAdapter);
        KoreanListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override

            public void onItemClick(AdapterView parent, View v, int position, long id) {

                // get TextView's Text.
                String strText = (String) parent.getItemAtPosition(position) ;

                // TODO : use strText
            }
        }) ;

    }
}
