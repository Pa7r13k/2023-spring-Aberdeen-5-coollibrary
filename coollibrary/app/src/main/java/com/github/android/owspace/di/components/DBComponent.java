package com.github.android.owspace.di.components;

import android.database.sqlite.SQLiteOpenHelper;

import com.github.android.owspace.di.modules.DbModule;
import com.squareup.sqlbrite.BriteDatabase;
import com.squareup.sqlbrite.SqlBrite;

import javax.inject.Singleton;

import dagger.Component;


@Component(modules = DbModule.class)
@Singleton
public interface DBComponent {
    SQLiteOpenHelper getSQLiteOpenHelper();
    SqlBrite getSqlBrite();
    BriteDatabase getBriteDatabase();
}
