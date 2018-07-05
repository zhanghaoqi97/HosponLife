package com.hopson.hopsonlife.base;

import android.app.Application;

import com.squareup.leakcanary.LeakCanary;
import com.youth.xframe.XFrame;

/**
 * 项目名称: HopsonLife
 * 创建人：Zhq
 * 修改人：gy
 * 修改时间：2018/4/22 23:26
 * 类描述：
 * 修改备注:
 */

public class HopsonStewardApp extends Application {
    public static HopsonStewardApp mInstance;

    @Override
    public void onCreate() {
        super.onCreate();
        //初始化Leak内存泄露检测工具
        LeakCanary.install(this);
        XFrame.init(this);
        mInstance = this;
    }


    public static HopsonStewardApp getInstance() {
        return mInstance;
    }


}
