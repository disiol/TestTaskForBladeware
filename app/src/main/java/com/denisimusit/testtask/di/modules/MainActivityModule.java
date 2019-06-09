package com.denisimusit.testtask.di.modules;

import com.denisimusit.testtask.MainActivity;
import com.denisimusit.testtask.di.scopes.ActivityScope;

import dagger.Module;

@Module
public interface MainActivityModule {
    MainActivity mainActivity();


}
