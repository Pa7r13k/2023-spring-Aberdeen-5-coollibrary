package com.github.android.owspace.di.modules;

import com.github.android.owspace.presenter.SplashContract;

import dagger.Module;
import dagger.Provides;


@Module
public class SplashModule {
    private SplashContract.View view;

    public SplashModule(SplashContract.View view) {
        this.view = view;
    }
    @Provides
    public SplashContract.View provideView(){
        return view;
    }
}
