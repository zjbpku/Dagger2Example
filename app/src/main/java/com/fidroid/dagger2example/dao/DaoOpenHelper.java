package com.fidroid.dagger2example.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.fidroid.greendao.DaoMaster;

/**
 * Created by jabin on 5/14/16.
 */
public class DaoOpenHelper extends DaoMaster.OpenHelper {

    public DaoOpenHelper(Context context) {
        this(context, "test.db", null);
    }

    public DaoOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory) {
        super(context, name, factory);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
