package com.github.android.owspace.di.components;

import com.github.android.owspace.di.modules.ArtModule;
import com.github.android.owspace.di.scopes.UserScope;
import com.github.android.owspace.view.activity.ArtActivity;

import dagger.Component;


@UserScope
@Component(modules = ArtModule.class,dependencies = NetComponent.class)
public interface ArtComponent {
    void inject(ArtActivity artActivity);
}
