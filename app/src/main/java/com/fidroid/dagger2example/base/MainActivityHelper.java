package com.fidroid.dagger2example.base;

import android.util.Log;

/**
 * Created by jabin on 5/14/16.
 */
//used only in MainActivity
public class MainActivityHelper {
    private static final String TAG = "MainActivityHelper";

    public void say() {
        Log.d(TAG, "say: Hello MainActivity");
    }
}
