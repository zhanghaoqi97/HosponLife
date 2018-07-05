package com.hopson.hopsonlife.ui;

import android.os.Bundle;
import android.view.View;

import com.hopson.hopsonlife.base.BaseActivity;

import main.hosponlife.cyberway.net.cn.hosponlife.R;

public class LoginActivity extends BaseActivity {





    @Override
    public int getLayoutId() {
        return R.layout.activity_login;
    }

    @Override
    public void initData(Bundle savedInstanceState) {

    }

    @Override
    public void initView() {

    }


    public void login(View view) {
        openActivity(MainActivity.class);
    }
}
