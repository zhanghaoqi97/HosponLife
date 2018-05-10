package com.hopson.hopsonlife.base;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.text.TextUtils;

import com.youth.xframe.base.XActivity;
import com.youth.xframe.utils.statusbar.XStatusBar;

import main.hosponlife.cyberway.net.cn.hosponlife.R;

/**
 * 项目名称: HopsonLife
 * 创建人：Zhq
 * 修改人：gy
 * 修改时间：2018/4/24 23:21
 * 类描述：
 * 修改备注:
 */

public abstract class BaseActivity extends XActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setTheme(R.style.AppTheme_Simple);
        super.onCreate(savedInstanceState);
        String title=getIntent().getStringExtra("title");
        if (TextUtils.isEmpty(title))
            title=getString(R.string.app_name);
        ActionBar bar=getSupportActionBar();
        bar.setTitle(title);
        if (!title.equals(getString(R.string.app_name)))
            bar.setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);
        setStatusBar();
    }

    protected void setStatusBar() {
        XStatusBar.setColor(this, getResources().getColor(R.color.colorPrimary),0);
    }
}
