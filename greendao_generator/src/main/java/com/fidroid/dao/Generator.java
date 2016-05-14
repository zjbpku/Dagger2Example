package com.fidroid.dao;

import java.io.File;

import de.greenrobot.daogenerator.DaoGenerator;
import de.greenrobot.daogenerator.Entity;
import de.greenrobot.daogenerator.Schema;

//right click and choose "run 'Generator.main()"
public class Generator {


    private static final String defaultJavaPkg = "com.fidroid.greendao";
    private static final String destPath = "app/src/main/database/";
    private static final int VERSION = 1;

    public static void main(String[] args) throws Exception {

        Schema schema = new Schema(VERSION, defaultJavaPkg);
        Entity testEntity = schema.addEntity("Test");
        testEntity.addIdProperty();
        testEntity.addStringProperty("name");
        testEntity.addStringProperty("project");

        File file = new File(destPath);
        if (!file.exists()) {
            file.mkdirs();
        }

        new DaoGenerator().generateAll(schema, file.getAbsolutePath());
    }
}
