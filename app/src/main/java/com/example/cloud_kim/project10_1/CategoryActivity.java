package com.example.cloud_kim.project10_1;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

/**
 * Created by Cloud_Kim on 2016-11-16.
 */

public class CategoryActivity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.category);
ImageView CategoryKorea = (ImageView)findViewById(R.id.CategoryKorea);
        CategoryKorea.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent Korea_intent = new Intent(getApplicationContext(), KoreanCategory.class);
                startActivity(Korea_intent);
            }
        });

    }

}
