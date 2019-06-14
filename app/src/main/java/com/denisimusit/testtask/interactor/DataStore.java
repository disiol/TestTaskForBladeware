package com.denisimusit.testtask.interactor;

import com.denisimusit.testtask.api.Api;
import com.denisimusit.testtask.models.USA;
import com.denisimusit.testtask.util.RxTransformers;
import com.google.gson.Gson;

import javax.inject.Inject;
import javax.inject.Singleton;

import rx.Observable;

@Singleton
public class DataStore  {

    private Api api;
    private Gson gson;

    @Inject
    public DataStore(Api api, Gson gson) {
        this.api = api;
        this.gson = gson;

    }

    public Observable<USA> getAll() {
        return api.getAll().compose(RxTransformers.applyApiRequestSchedulers());
    }


}
