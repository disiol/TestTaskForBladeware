package com.denisimusit.testtask.ui.fragment.detailsState;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.arellomobile.mvp.MvpFragment;
import com.arellomobile.mvp.presenter.InjectPresenter;
import com.denisimusit.testtask.R;
import com.denisimusit.testtask.presentation.presenter.detailsState.DetailsStatePresenter;
import com.denisimusit.testtask.presentation.view.detailsState.DetailsStateView;

public class DetailsStateFragment extends MvpFragment implements DetailsStateView {
    public static final String TAG = "DetailsStateFragment";
    @InjectPresenter
    DetailsStatePresenter mDetailsStatePresenter;

    public static DetailsStateFragment newInstance() {
        DetailsStateFragment fragment = new DetailsStateFragment();

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
