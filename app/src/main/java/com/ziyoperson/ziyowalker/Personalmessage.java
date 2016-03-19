package com.ziyoperson.ziyowalker;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by Administrator on 2016/3/19.
 */
public class Personalmessage extends AppCompatActivity{

    ImageButton ibtn_back;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.personalmessage);

        ibtn_back = (ImageButton)findViewById(R.id.mymessage_btn_back);
        ibtn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(Personalmessage.this,Mypage.class);
                startActivity(intent);
            }
        });
    }
}
