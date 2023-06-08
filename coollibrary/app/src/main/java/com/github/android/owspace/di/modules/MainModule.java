package com.github.android.owspace.di.modules;

import com.github.android.owspace.presenter.MainContract;

import dagger.Module;
import dagger.Provides;


@Module
public class MainModule {
    private final MainContract.View mView;

    public MainModule(MainContract.View mView) {
        this.mView = mView;
    }
    @Provides
    public MainContract.View provideMainView(){
        return mView;
    }
}
