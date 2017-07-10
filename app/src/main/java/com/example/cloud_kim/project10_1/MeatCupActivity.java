package com.example.cloud_kim.project10_1;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Cloud_Kim on 2016-12-06.
 */

public class MeatCupActivity extends AppCompatActivity {
    TextView vsTitle, vsText;
    ImageView UpImg, DownImg, cup_win, result;
    Integer imgId[] = new Integer[8];
    int cnt = 0;
    int cur =0;
    public int j =0;
    public int i=0;
    ImageView[] img = new ImageView[7];
    Drawable d1, d2, d3, d4, d5, d6;
    public Integer Rnd[] = new Integer[8];

    public void Select_Img(ImageView img) {
        if (cnt == 0) {
            d1 = img.getDrawable(); //드러워블에 저장을 시켜준다.
        } else if (cnt == 1) {
            d2 = img.getDrawable();
        } else if (cnt == 2) {
            d3 = img.getDrawable();
        } else if (cnt == 3) {
            d4 = img.getDrawable();
        } else if (cnt == 4) {
            d5 = img.getDrawable();
        } else if (cnt == 5) {
            d6 = img.getDrawable();
        }
        cnt++;
        if (cnt ==1) {
            UpImg.setImageResource(imgId[Rnd[2]]);
            DownImg.setImageResource(imgId[Rnd[3]]);
        }
        else if (cnt ==2) {
            UpImg.setImageResource(imgId[Rnd[4]]);
            DownImg.setImageResource(imgId[Rnd[5]]);
        }
        else if (cnt ==3) {
            UpImg.setImageResource(imgId[Rnd[6]]);
            DownImg.setImageResource(imgId[Rnd[7]]);
        }
        else if (cnt == 4) {
            UpImg.setImageDrawable(d1);
            DownImg.setImageDrawable(d2);

        } else if (cnt ==5) {
            UpImg.setImageDrawable(d3);
            DownImg.setImageDrawable(d4);
        } else if (cnt ==6){
            UpImg.setImageDrawable(d5);
            DownImg.setImageDrawable(d6);
        }  else {
            UpImg.setVisibility(android.view.View.GONE);
            DownImg.setVisibility(android.view.View.GONE);
            vsText.setVisibility(android.view.View.GONE);
            cup_win.setVisibility(android.view.View.VISIBLE);
            cup_win.setImageDrawable(img.getDrawable());
            result.setVisibility(android.view.View.VISIBLE);
        }
    }
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.meatcup);vsText = (TextView) findViewById(R.id.vsText);
        UpImg = (ImageView) findViewById(R.id.UpImage);
        DownImg = (ImageView) findViewById(R.id.DownImage);
        cup_win = (ImageView) findViewById(R.id.cup_win);
        result = (ImageView) findViewById(R.id.result);
        imgId[0] = (R.drawable.meat_1);
        imgId[1] = (R.drawable.meat_2);
        imgId[2] = (R.drawable.meat_3);
        imgId[3] = (R.drawable.meat_4);
        imgId[4] = (R.drawable.meat_5);
        imgId[5] = (R.drawable.meat_6);
        imgId[6] = (R.drawable.meat_7);
        imgId[7] = (R.drawable.meat_8);

        for (i = 0; i < 8; i++) {
            Rnd[i] = (int)(Math.random()*8);
            for(cur =0;cur<100; cur++){
                Rnd[i] = (int) (Math.random() * 8);
                //cur = Rnd[i] + cur;
                for(j =0 ; j<i; j++){
                    if(Rnd[i]==Rnd[j])
                        break;
                }
                if(j==i)
                    break;
            }
        }
        UpImg.setImageResource(imgId[Rnd[0]]);
        DownImg.setImageResource(imgId[Rnd[1]]);

        UpImg.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Select_Img(UpImg);
            }
        });
        DownImg.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Select_Img(DownImg);
            }
        });
    }
}