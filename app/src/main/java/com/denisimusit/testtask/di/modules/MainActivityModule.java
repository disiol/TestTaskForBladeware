package com.denisimusit.testtask.di.modules;

import com.denisimusit.testtask.di.scopes.FragmentScope;
import com.denisimusit.testtask.ui.activity.main.MainActivity;
import com.denisimusit.testtask.ui.fragment.detailsState.DetailsStateFragment;
import com.denisimusit.testtask.ui.fragment.home.HomeFragment;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public interface MainActivityModule {
    @FragmentScope
    @ContributesAndroidInjector
    HomeFragment homeFragment();
    @FragmentScope
    @ContributesAndroidInjector
    DetailsStateFragment detailsStateFragment();

}
