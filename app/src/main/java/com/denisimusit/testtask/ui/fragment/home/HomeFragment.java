package com.denisimusit.testtask.ui.fragment.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.arellomobile.mvp.MvpFragment;
import com.arellomobile.mvp.presenter.InjectPresenter;
import com.denisimusit.testtask.R;
import com.denisimusit.testtask.presentation.presenter.home.HomePresenter;
import com.denisimusit.testtask.presentation.view.home.HomeView;

public class HomeFragment extends MvpFragment implements HomeView {
    public static final String TAG = "HomeFragment";
    @InjectPresenter
    HomePresenter mHomePresenter;

    public static HomeFragment newInstance() {
        HomeFragment fragment = new HomeFragment();

        Bundle args = new Bundle();
        fragment.setArguments(args);

        return fragment;
    }

    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup container,
                             final Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(final View view, final Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }
}
