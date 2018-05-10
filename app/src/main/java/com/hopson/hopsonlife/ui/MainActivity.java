package com.hopson.hopsonlife.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import main.hosponlife.cyberway.net.cn.hosponlife.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.AppTheme);
        setContentView(R.layout.activity_main);
    }
}
