package com.github.android.owspace.di.modules;

import com.github.android.owspace.presenter.ArticalContract;

import dagger.Module;
import dagger.Provides;


@Module
public class ArtModule {
    private ArticalContract.View mView;

    public ArtModule(ArticalContract.View mView) {
        this.mView = mView;
    }
    @Provides
    public ArticalContract.View provideView(){
        return mView;
    }
}
