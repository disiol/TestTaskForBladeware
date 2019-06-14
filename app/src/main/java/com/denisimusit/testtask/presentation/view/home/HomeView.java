package com.denisimusit.testtask.presentation.view.home;

import com.arellomobile.mvp.MvpView;
import com.denisimusit.testtask.models.USA;

import java.util.List;

public interface HomeView extends MvpView {
  void getListOfStates(List<USA> all);
  void showError(Throwable throwable);

}
