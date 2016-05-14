package com.fidroid.dagger2example.analytics;

import android.content.Context;
import android.util.Log;

/**
 * Created by jabin on 1/16/16.
 */
public class AnalyticsManager {
    private static final String TAG = "AnalyticsManager";

    public AnalyticsManager(Context context) {
    }

    public void register() {
        Log.d(TAG, "register()");
    }

    public void send(String data) {
        Log.d(TAG, data);
    }
}
