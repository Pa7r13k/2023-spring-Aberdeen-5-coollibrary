package com.github.android.owspace.util.tool;

import rx.Observable;
import rx.subjects.PublishSubject;
import rx.subjects.SerializedSubject;
import rx.subjects.Subject;

/**
 * 用来进行组件之间通讯
 */
public class RxBus {
    private static volatile RxBus instance;

    private final Subject<Object,Object> bus;

    private RxBus(){
        bus = new SerializedSubject<>(PublishSubject.create());
    }

    public static RxBus getInstance() {
        if (instance == null){
            synchronized (RxBus.class){
                if (instance == null){
                    instance = new RxBus();
                }
            }
        }
        return instance;
    }
    public void postEvent(Object event){
        bus.onNext(event);
    }
    public <T>Observable<T> toObservable(Class<T> eventype){
        return bus.ofType(eventype);
    }
}
