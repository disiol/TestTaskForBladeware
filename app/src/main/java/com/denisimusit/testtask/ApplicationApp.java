package com.denisimusit.testtask;

import android.app.Activity;
import android.app.Application;

import com.denisimusit.testtask.di.component.DaggerApplicationComponent;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;

public class ApplicationApp extends Application implements HasActivityInjector {
    @Inject
    DispatchingAndroidInjector<Activity> dispatchingAndroidInjector;




    @Override
    public void onCreate() {
        super.onCreate();

        DaggerApplicationComponent.builder()
                .context(this)
                .build()
                .inject(this);
    }

    @Override
    public AndroidInjector<Activity> activityInjector() {
        return dispatchingAndroidInjector;
    }

}
