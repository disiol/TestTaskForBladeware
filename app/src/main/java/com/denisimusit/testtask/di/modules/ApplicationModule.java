package com.denisimusit.testtask.di.modules;

import com.denisimusit.testtask.di.scopes.ActivityScope;
import com.denisimusit.testtask.ui.activity.main.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

@Module(includes = {AndroidSupportInjectionModule.class, ApiModule.class, AppModule.class})
public interface ApplicationModule {


    @ActivityScope
    @ContributesAndroidInjector(modules = {MainActivityModule.class})
    MainActivity mainActivityInjector();


}
