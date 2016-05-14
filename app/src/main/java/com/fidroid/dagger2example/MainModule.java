package com.fidroid.dagger2example;

import com.fidroid.dagger2example.base.MainActivityHelper;

import dagger.Module;
import dagger.Provides;

/**
 * Created by jabin on 5/14/16.
 */
//used only in MainActivity
@Module
public class MainModule {
    @Provides
    @DaggerScope(ActivityComponent.class)
    MainActivityHelper provideMainActivityHelper() {
        return new MainActivityHelper();
    }
}
