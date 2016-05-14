package com.fidroid.dagger2example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.fidroid.dagger2example.analytics.AnalyticsManager;
import com.fidroid.dagger2example.base.MainActivityHelper;
import com.fidroid.dagger2example.base.OSHelper;
import com.fidroid.greendao.Test;
import com.fidroid.greendao.TestDao;

import java.util.List;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    @Inject
    OSHelper mOsHelper;
    @Inject
    AnalyticsManager mAnalyticsManager;
    @Inject
    MainActivityHelper mainActivityHelper;

    @Inject
    TestDao mTestDao;

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
        Log.e(TAG, mOsHelper.getDeviceBrand());

        long result = mTestDao.insert(new Test(null, "test", "dagger2demo"));
        if (result > 0) {
            Log.e(TAG, "insert data");
        }

        List<Test> list = mTestDao.queryBuilder().build().list();

        if (list != null && list.size() > 0) {
            Log.e(TAG, list.get(0).getName() + " " + list.get(0).getProject());
        }
    }
}
