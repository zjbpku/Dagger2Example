package com.fidroid.dagger2example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.fidroid.dagger2example.analytics.AnalyticsManager;
import com.fidroid.dagger2example.base.MainActivityHelper;
import com.fidroid.dagger2example.base.OSHelper;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    @Inject
    OSHelper mOsHelper;
    @Inject
    AnalyticsManager mAnalyticsManager;
    @Inject
    MainActivityHelper mainActivityHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActivityComponent activityComponent = DaggerActivityComponent.builder()
                .appComponent(((MyApplication) getApplication()).getAppComponent())
                .mainModule(new MainModule())
                .build();
        activityComponent.inject(this);
//        mOsHelper = activityComponent.getOSHelper();
//        mAnalyticsManager = activityComponent.getOSHelper();
        mAnalyticsManager.send("MainActivity");
        mainActivityHelper.say();
        Log.d(TAG, mOsHelper.getDeviceBrand());
    }
}
