package com.denisimusit.testtask.presentation.view.home;

import com.arellomobile.mvp.MvpView;
import com.denisimusit.testtask.models.USA;

public interface HomeView extends MvpView {
  void getListOfStates(USA all);
  void showError(Throwable throwable);

}
