package com.fidroid.dagger2example;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by jabin on 1/16/16.
 */
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface DaggerScope {
    Class<?> value();
}
