package com.denisimusit.testtask.ui.fragment.home;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.arellomobile.mvp.MvpFragment;
import com.arellomobile.mvp.presenter.InjectPresenter;
import com.denisimusit.testtask.R;
import com.denisimusit.testtask.models.USA;
import com.denisimusit.testtask.presentation.presenter.home.HomePresenter;
import com.denisimusit.testtask.presentation.view.home.HomeView;
import com.denisimusit.testtask.ui.holdersAndAdapters.home.HomeAdapter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import butterknife.BindView;

public class HomeFragment extends MvpFragment implements HomeView {
    public static final String TAG = "HomeFragment";

    @InjectPresenter
    HomePresenter mHomePresenter;

    @Nullable
    @BindView(R.id.home_RecyclerView)
    RecyclerView rvMain;
    //И его адаптер
    HomeAdapter chatAdapter;
    private List<USA> usaList;

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
        //Создадим адаптер
        chatAdapter = new HomeAdapter(usaList);
        //Применим наш адаптер к RecyclerView
        rvMain.setAdapter(chatAdapter);
        //И установим LayoutManager
        rvMain.setLayoutManager(new LinearLayoutManager(getActivity()));

    }


    @Override
    public void getListOfStates(USA all) {
        usaList = new ArrayList<>();
        usaList.addAll((Collection<? extends USA>) all);
    }

    @Override
    public void showError(Throwable throwable) {
        //TODO сделать обработчик ошибки
    }
}
