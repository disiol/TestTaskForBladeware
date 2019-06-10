package com.denisimusit.testtask.ui.activity.main;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.arellomobile.mvp.MvpActivity;
import com.arellomobile.mvp.presenter.InjectPresenter;
import com.denisimusit.testtask.R;
import com.denisimusit.testtask.presentation.presenter.main.MainPresenter;
import com.denisimusit.testtask.presentation.view.main.MainView;

public class MainActivity extends MvpActivity implements MainView {
    public static final String TAG = "MainActivity";
    @InjectPresenter
    MainPresenter mMainPresenter;

    public static Intent getIntent(final Context context) {
        Intent intent = new Intent(context, MainActivity.class);

        return intent;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
