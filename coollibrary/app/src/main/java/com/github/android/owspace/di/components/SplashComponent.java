package com.github.android.owspace.di.components;

import com.github.android.owspace.di.modules.SplashModule;
import com.github.android.owspace.di.scopes.UserScope;
import com.github.android.owspace.view.activity.SplashActivity;

import dagger.Component;


@UserScope
@Component(modules = SplashModule.class,dependencies = NetComponent.class)
public interface SplashComponent {
    void inject(SplashActivity splashActivity);
}
