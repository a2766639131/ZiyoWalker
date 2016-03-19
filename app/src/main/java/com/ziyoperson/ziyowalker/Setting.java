package com.ziyoperson.ziyowalker;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

import java.io.InputStream;

/**
 * Created by Administrator on 2016/3/19.
 */
public class Setting extends AppCompatActivity {
    ImageButton ibtn_edit_profile;
    ImageButton ibtn_back;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        setContentView(R.layout.setting);
        ibtn_back = (ImageButton)findViewById(R.id.setting_btn_back);
        ibtn_edit_profile = (ImageButton)findViewById(R.id.btn_edit_profile);

        ibtn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(Setting.this,Mypage.class);
                startActivity(intent);
            }
        });

        ibtn_edit_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(Setting.this,Personalmessage.class);
                startActivity(intent);
            }
        });
    }

}
