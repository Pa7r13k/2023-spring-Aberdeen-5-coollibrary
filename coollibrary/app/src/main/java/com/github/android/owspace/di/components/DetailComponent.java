package com.github.android.owspace.di.components;

import com.github.android.owspace.di.modules.DetailModule;
import com.github.android.owspace.di.scopes.UserScope;
import com.github.android.owspace.view.activity.AudioDetailActivity;
import com.github.android.owspace.view.activity.DetailActivity;
import com.github.android.owspace.view.activity.VideoDetailActivity;

import dagger.Component;


@UserScope
@Component(modules = DetailModule.class,dependencies = NetComponent.class)
public interface DetailComponent {
    void inject(DetailActivity activity);
    void inject(VideoDetailActivity activity);
    void inject(AudioDetailActivity activity);
}
