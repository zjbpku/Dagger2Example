package com.fidroid.dagger2example.analytics;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by jabin on 1/16/16.
 */
@Module
public class DomainModule {
    @Provides
    @Singleton
    public AnalyticsManager provideAnalyticsManager(Context context) {
        return new AnalyticsManager(context);
    }
}
