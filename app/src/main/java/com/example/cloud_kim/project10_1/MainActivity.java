package com.example.cloud_kim.project10_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView btnKorean = (ImageView) findViewById(R.id.btnKorean);
        ImageView btnAmerican = (ImageView) findViewById(R.id.btnAmerican);
        ImageView btnAsian = (ImageView) findViewById(R.id.btnAsian);
        ImageView btnChicken = (ImageView) findViewById(R.id.btnChicken);
        ImageView btnBunsik = (ImageView) findViewById(R.id.btnBunsik);
        ImageView btnMeat = (ImageView) findViewById(R.id.btnMeat);
        ImageView btnDesert = (ImageView) findViewById(R.id.btnDesert);
        ImageView btnDelivery = (ImageView) findViewById(R.id.btnDelivery);
        ImageView btnHome = (ImageView) findViewById(R.id.btn_home);
        /*Button btnSearch = (Button) findViewById(R.id.btnSearch);*/
        btnKorean.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent intent = new Intent(getApplicationContext(), KoreanCupActivity.class);
                startActivity(intent);
            }
        });

        btnAmerican.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent intentAmerican = new Intent(getApplicationContext(), AmericanCupActivity.class);
                startActivity(intentAmerican);
            }
        });

        btnAsian.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent intentAsian = new Intent(getApplicationContext(), AsianCupActivity.class);
                startActivity(intentAsian);
            }
        });

        btnChicken.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent intentChicken = new Intent(getApplicationContext(), ChickenCupActivity.class);
                startActivity(intentChicken);
            }
        });
        btnBunsik.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                Intent intentBunsik = new Intent(getApplicationContext(), BunsikCupActivity.class);
                startActivity(intentBunsik);
            }
        });
        btnMeat.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                Intent intentMeat= new Intent(getApplicationContext(), MeatCupActivity.class);
                startActivity(intentMeat);
            }
        });
        btnDesert.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                Intent intentDesert= new Intent(getApplicationContext(), DesertCupActivity.class);
                startActivity(intentDesert);
            }
        });
        btnDelivery.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                Intent intentDelivery= new Intent(getApplicationContext(), DelieveryCupActivity.class);
                startActivity(intentDelivery);
            }
        });
        btnHome.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                Intent intentHome= new Intent(getApplicationContext(), BtnActivity.class);
                startActivity(intentHome);
                finish();
            }
        });
        /*
        btnSearch.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v)
            {
                Intent intentSearch = new Intent(getApplicationContext(), SearchActivity.class);
                startActivity(intentSearch);
            }
        });
        btnReturn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                Intent intentReturn = new Intent(getApplicationContext(), BtnActivity.class);
                startActivity(intentReturn);
            }
        });*/
        /*홈버튼
        btnHome.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentHome = new Intent(getApplication(), BtnActivity.class);
                startActivity(intentHome);
            }
        });
        */
    }
}
