package com.hopson.hopsonlife.ui;

import android.os.Bundle;
import android.view.View;

import com.hopson.hopsonlife.base.BaseActivity;
import com.hopson.hopsonlife.ui.me.SettingActivity;

import main.hosponlife.cyberway.net.cn.hosponlife.R;

public class MainActivity extends BaseActivity {

    public void shou(View view) {
        openActivity(SettingActivity.class);
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void initData(Bundle savedInstanceState) {

    }

    @Override
    public void initView() {

    }



}
