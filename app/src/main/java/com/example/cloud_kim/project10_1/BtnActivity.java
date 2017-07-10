package com.example.cloud_kim.project10_1;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Cloud_Kim on 2016-11-15.
 */

public class BtnActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.btnmain);
        Button buttonFood_Cup = (Button) findViewById(R.id.btnCupStart);
        Button buttonSearch = (Button) findViewById(R.id.btnSearch);
        Button buttonCategory = (Button) findViewById(R.id.btnCategory);
        buttonFood_Cup.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                Intent intentbtnCup = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intentbtnCup);
            }
        });
        buttonSearch.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                Intent intentbtnSearch = new Intent(getApplicationContext(), SearchActivity.class);
                startActivity(intentbtnSearch);
            }
        });
        buttonCategory.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent intentCategory = new Intent(getApplicationContext(), CategoryActivity.class);
                startActivity(intentCategory);
            }
        });

    }
}
