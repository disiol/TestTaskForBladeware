package com.denisimusit.testtask.ui.fragment.detailsState;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.denisimusit.testtask.presentation.view.detailsState.DetailsStateView;
import com.denisimusit.testtask.presentation.presenter.detailsState.DetailsStatePresenter;

import com.arellomobile.mvp.MvpFragment;
import com.arellomobile.mvp.presenter.InjectPresenter;

public class detailsStateFragment extends MvpFragment implements DetailsStateView {
    public static final String TAG = "detailsStateFragment";
    @InjectPresenter
    DetailsStatePresenter mDetailsStatePresenter;

    public static detailsStateFragment newInstance() {
        detailsStateFragment fragment = new detailsStateFragment();

        Bundle args = new Bundle();
        fragment.setArguments(args);

        return fragment;
    }

    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup container,
                             final Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_details_state, container, false);
    }

    @Override
    public void onViewCreated(final View view, final Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }
}
