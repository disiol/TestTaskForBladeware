package com.denisimusit.testtask.api;

import com.denisimusit.testtask.models.USA;

import retrofit2.http.GET;
import rx.Observable;

public interface Api {

    @GET("state/get/USA/all")
    Observable<USA> getAll();


}
