package com.denisimusit.testtask;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;

import com.arellomobile.mvp.MvpAppCompatActivity;
import com.denisimusit.testtask.interactor.DataStore;

import javax.inject.Inject;

import dagger.android.AndroidInjection;
import dagger.android.DispatchingAndroidInjector;

import static com.denisimusit.testtask.constants.Constants.LOG_TEG;

public class MainActivity extends MvpAppCompatActivity {

    @Inject
    DataStore dataStore;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AndroidInjection.inject(this);


        setContentView(R.layout.activity_main);
        dataStore.getAll().subscribe(state -> Log.d(LOG_TEG, state.toString()),Throwable::printStackTrace);


    }


}
