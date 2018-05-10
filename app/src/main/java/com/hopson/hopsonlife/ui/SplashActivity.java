package com.hopson.hopsonlife.ui;

import android.os.Bundle;

import com.hopson.hopsonlife.base.BaseActivity;
import com.youth.xframe.utils.statusbar.XStatusBar;

import main.hosponlife.cyberway.net.cn.hosponlife.R;

public class SplashActivity extends BaseActivity {

    @Override
    public int getLayoutId() {
        if (getSupportActionBar() != null){
            getSupportActionBar().hide();
        }
        return R.layout.activity_splash;
    }

    @Override
    public void initData(Bundle savedInstanceState) {

    }

    @Override
    public void initView() {

    }

    @Override
    protected void setStatusBar() {
        super.setStatusBar();
        XStatusBar.setTranslucent(SplashActivity.this);
        XStatusBar.hideFakeStatusBarView(SplashActivity.this);
    }
}
