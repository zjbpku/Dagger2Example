package com.fidroid.dagger2example;

import com.fidroid.dagger2example.analytics.DomainModule;
import com.fidroid.dagger2example.dao.DBModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by jabin on 1/16/16.
 */
@Component(
        modules = {
                AppModule.class,
                DomainModule.class,
                DBModule.class
        }
)
@Singleton
public interface AppComponent extends BaseComponent {
    MyApplication inject(MyApplication app);
}
