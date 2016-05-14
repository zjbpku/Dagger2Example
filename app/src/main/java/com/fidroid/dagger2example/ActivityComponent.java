package com.fidroid.dagger2example;

import com.fidroid.dagger2example.base.MainActivityHelper;
import com.fidroid.greendao.TestDao;

import dagger.Component;

/**
 * Created by jabin on 1/16/16.
 */

@Component(
        dependencies = AppComponent.class,
        modules = {
                MainModule.class
        }
)
@DaggerScope(ActivityComponent.class)
public interface ActivityComponent extends BaseComponent {
    void inject(MainActivity activity);

    MainActivityHelper getMainActivityHelper();

    TestDao getTestDao();
}
