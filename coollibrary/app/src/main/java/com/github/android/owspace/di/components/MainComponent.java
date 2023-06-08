package com.github.android.owspace.di.components;

import com.github.android.owspace.di.modules.MainModule;
import com.github.android.owspace.di.scopes.UserScope;
import com.github.android.owspace.view.activity.MainActivity;

import dagger.Component;


@UserScope
@Component(modules = MainModule.class,dependencies = NetComponent.class)
public interface MainComponent {
    void inject(MainActivity activity);
}
