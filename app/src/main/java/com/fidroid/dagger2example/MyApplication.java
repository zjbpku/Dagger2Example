package com.fidroid.dagger2example;

import android.app.Application;

import com.fidroid.dagger2example.analytics.AnalyticsManager;
import com.fidroid.dagger2example.analytics.DomainModule;
import com.fidroid.dagger2example.dao.DBModule;

import javax.inject.Inject;

/**
 * Created by jabin on 1/16/16.
 */
public class MyApplication extends Application {


    AppComponent appComponent = null;
    @Inject
    AnalyticsManager analyticsManager;

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this)) // must be set
                .domainModule(new DomainModule())// if you forget to set, dagger will help you to create.
                .dBModule(new DBModule()) //as above
                .build();
        appComponent.inject(this);
        analyticsManager.register();
        analyticsManager.send("start ");
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }
}
