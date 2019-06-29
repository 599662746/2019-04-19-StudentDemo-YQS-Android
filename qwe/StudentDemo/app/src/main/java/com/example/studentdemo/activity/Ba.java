package com.example.studentdemo.activity;

import android.content.Intent;
import android.view.View;
import android.widget.Button;

import com.Rao.Rao_ba_erweima;
import com.example.studentdemo.R;

public class Ba extends BaseActivity{
    @Override
    protected String getLayoutTitle() {
        return "旅行助手";
    }

    @Override
    protected void onAfter() {

    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {


        Button Btn_goumai = (Button) findViewById(R.id.goumai_01);

        Btn_goumai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Ba.this,Rao_ba_erweima.class));
            }
        });

    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_ba;
    }

    @Override
    public void onClick(View view) {

    }


}
