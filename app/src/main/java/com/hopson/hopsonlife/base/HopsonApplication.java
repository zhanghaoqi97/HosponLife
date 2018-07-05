package com.hopson.hopsonlife.base;

import android.app.Application;

import com.youth.xframe.XFrame;

/**
 * 项目名称: HopsonLife
 * 创建人：Zhq
 * 修改人：gy
 * 修改时间：2018/4/22 23:26
 * 类描述：
 * 修改备注:
 */

public class HopsonApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        XFrame.init(this);
    }
}
