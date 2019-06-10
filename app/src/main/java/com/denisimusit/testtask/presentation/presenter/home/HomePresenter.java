package com.denisimusit.testtask.presentation.presenter.home;


import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;
import com.denisimusit.testtask.interactor.DataStore;
import com.denisimusit.testtask.models.USA;
import com.denisimusit.testtask.presentation.view.home.HomeView;

import javax.inject.Inject;

import rx.Observable;

@InjectViewState
public class HomePresenter extends MvpPresenter<HomeView> {
    @Inject
    DataStore dataStore;

    public HomePresenter() {

      dataStore.getAll().subscribe(all -> {
          getViewState().getListOfStates(all);
      });  //TODO сделать обработчик ошибки


    }



}
