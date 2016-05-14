package com.fidroid.dagger2example.dao;

import android.content.Context;

import com.fidroid.greendao.DaoMaster;
import com.fidroid.greendao.DaoSession;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by jabin on 5/14/16.
 */
@Module
public class DBModule {
    @Provides
    @Singleton
    DaoMaster.OpenHelper providerOpenHelper(Context context) {
        return new DaoOpenHelper(context);
    }

    @Provides
    @Singleton
    DaoMaster providerDaoMaster(DaoMaster.OpenHelper openHelper) {
        return new DaoMaster(openHelper.getWritableDatabase());
    }

    @Provides
    @Singleton
    DaoSession providerDaoSession(DaoMaster daoMaster) {
        return daoMaster.newSession();
    }

    // if TestDao used only in MainActivity, remove the following code to MainModule
//    @Provides
//    @Singleton
//    TestDao provideTestDao(DaoSession session) {
//        return session.getTestDao();
//    }
}
