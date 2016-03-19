package com.ziyoperson.ziyowalker;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;

/**
 * Created by Administrator on 2016/3/19.
 */
public class Mypage extends AppCompatActivity {

    ImageButton ibtn_back;
    ImageButton ibtn_setting;
    CheckBox cb_share;
    Button btn_personalMesEdit;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mypage);

        ibtn_back = (ImageButton) findViewById(R.id.mypage_btn_back);
        ibtn_setting = (ImageButton) findViewById(R.id.mypage_btn_setting);
        btn_personalMesEdit = (Button) findViewById(R.id.btn_personalmesedit);

        ibtn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(Mypage.this,MainActivity.class);
                startActivity(intent);
            }
        });

        ibtn_setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(Mypage.this,Setting.class);
                startActivity(intent);
            }
        });

        btn_personalMesEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(Mypage.this,Personalmessage.class);
                startActivity(intent);
            }
        });
        cb_share = (CheckBox)findViewById(R.id.cb_share_position);
        cb_share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Boolean bCheck=cb_share.isChecked();

            }
        });

    }
}
