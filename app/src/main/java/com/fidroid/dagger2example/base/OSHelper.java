package com.fidroid.dagger2example.base;

import android.os.Build;

import javax.inject.Inject;

/**
 * Created by jabin on 1/16/16.
 */

public class OSHelper {
    @Inject
    public OSHelper() {
    }

    public String getDeviceBrand() {
        return Build.BRAND;
    }
}
