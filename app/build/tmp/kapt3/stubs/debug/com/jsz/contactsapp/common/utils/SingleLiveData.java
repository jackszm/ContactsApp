package com.jsz.contactsapp.common.utils;

import java.lang.System;

/**
 * A lifecycle-aware observable that sends only new updates after subscription.
 *
 * This avoids a common problem with events: on configuration change (like rotation) an update
 * can be emitted if the observer is active. This LiveData only calls the observable if there's an
 * explicit call to setValue() or call().
 *
 * Note:
 * Only one observer is going to be notified of changes.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J \u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u000e\u0010\n\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u000bH\u0017J\u0019\u0010\f\u001a\u00020\u00072\n\b\u0001\u0010\r\u001a\u0004\u0018\u00018\u0000H\u0017\u00a2\u0006\u0002\u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/jsz/contactsapp/common/utils/SingleLiveData;", "T", "Landroidx/lifecycle/MutableLiveData;", "()V", "consumed", "Ljava/util/concurrent/atomic/AtomicBoolean;", "observe", "", "owner", "Landroidx/lifecycle/LifecycleOwner;", "observer", "Landroidx/lifecycle/Observer;", "setValue", "t", "(Ljava/lang/Object;)V", "app_debug"})
public final class SingleLiveData<T extends java.lang.Object> extends androidx.lifecycle.MutableLiveData<T> {
    private final java.util.concurrent.atomic.AtomicBoolean consumed = null;
    
    public SingleLiveData() {
        super(null);
    }
    
    @androidx.annotation.MainThread
    @java.lang.Override
    public void observe(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.LifecycleOwner owner, @org.jetbrains.annotations.NotNull
    androidx.lifecycle.Observer<? super T> observer) {
    }
    
    @androidx.annotation.MainThread
    @java.lang.Override
    public void setValue(@org.jetbrains.annotations.Nullable
    @androidx.annotation.Nullable
    T t) {
    }
}