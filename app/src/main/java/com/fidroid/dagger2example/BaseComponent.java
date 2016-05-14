package com.fidroid.dagger2example;

import com.fidroid.dagger2example.analytics.AnalyticsManager;
import com.fidroid.dagger2example.base.OSHelper;

/**
 * Created by jabin on 5/14/16.
 */
public interface BaseComponent {
    OSHelper getOSHelper();

    AnalyticsManager getAnalyticsManager();
}


