package com.fidroid.dagger2example;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by jabin on 1/16/16.
 */
@Module
public class AppModule {

    private MyApplication mApplication;

    public AppModule(MyApplication application) {
        mApplication = application;
    }

    @Provides
    @Singleton
    Context providesContext() {
        return mApplication;
    }
}
