package com.github.android.owspace.di.modules;

import com.github.android.owspace.presenter.DetailContract;

import dagger.Module;
import dagger.Provides;


@Module
public class DetailModule {
    private DetailContract.View mView;

    public DetailModule(DetailContract.View mView) {
        this.mView = mView;
    }
    @Provides
    public DetailContract.View provideView(){
        return mView;
    }
}
