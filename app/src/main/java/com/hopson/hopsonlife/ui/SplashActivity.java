package com.hopson.hopsonlife.ui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.hopson.hopsonlife.base.BaseActivity;
import com.hopson.hopsonlife.utils.ConstanUtil;
import com.youth.xframe.utils.XPreferencesUtils;
import com.youth.xframe.utils.statusbar.XStatusBar;

import main.hosponlife.cyberway.net.cn.hosponlife.R;

public class SplashActivity extends BaseActivity {
    private Intent intent = null;

    @Override
    public int getLayoutId() {
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
        setTheme(R.style.AppTheme);
        return R.layout.activity_splash;
    }

    @Override
    public void initData(Bundle savedInstanceState) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                boolean splash_flag = (boolean) XPreferencesUtils.get(ConstanUtil.SPLSH_FLAG, false);
                if (splash_flag) {
                    intent = new Intent(SplashActivity.this, GuidePageActivity.class);
                } else {
                    intent = new Intent(SplashActivity.this, MainActivity.class);
                }
                startActivity(intent);
                finish();
            }
        }, 2000);
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
