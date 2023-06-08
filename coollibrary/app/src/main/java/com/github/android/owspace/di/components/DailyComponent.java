package com.github.android.owspace.di.components;

import com.github.android.owspace.di.modules.DailyModule;
import com.github.android.owspace.di.scopes.UserScope;
import com.github.android.owspace.view.activity.DailyActivity;

import dagger.Component;


@UserScope
@Component(modules = DailyModule.class,dependencies = NetComponent.class)
public interface DailyComponent {
    void inject(DailyActivity activity);
}
