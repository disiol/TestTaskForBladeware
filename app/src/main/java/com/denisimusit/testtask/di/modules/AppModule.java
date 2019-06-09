package com.denisimusit.testtask.di.modules;

import com.denisimusit.testtask.api.Api;
import com.denisimusit.testtask.interactor.DataStore;
import com.google.gson.Gson;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    @Provides
    @Singleton
    DataStore provideDataStore(Api api, Gson gson) {
        return new DataStore(api, gson);
    }
}
