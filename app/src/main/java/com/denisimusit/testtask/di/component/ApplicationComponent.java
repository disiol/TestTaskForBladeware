package com.denisimusit.testtask.di.component;

import android.content.Context;

import com.denisimusit.testtask.ApplicationApp;
import com.denisimusit.testtask.MainActivity;
import com.denisimusit.testtask.di.modules.ApplicationModule;
import com.denisimusit.testtask.di.modules.MainActivityModule;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;

@Singleton
@Component(modules = {ApplicationModule.class})
public interface ApplicationComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder context(Context context);

        ApplicationComponent build();
    }
    void inject(ApplicationApp app);

}
