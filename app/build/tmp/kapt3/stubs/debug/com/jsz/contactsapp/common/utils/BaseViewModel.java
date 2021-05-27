package com.jsz.contactsapp.common.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0004B\r\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0014\u001a\u00020\u0015H\u0014J\u0015\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00028\u0001H\u0005\u00a2\u0006\u0002\u0010\u0006J!\u0010\u0018\u001a\u00020\u00152\u0017\u0010\u0019\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u001a\u00a2\u0006\u0002\b\u001bH\u0005J\u001f\u0010\u001c\u001a\u0002H\u0001\"\b\b\u0002\u0010\u0001*\u00020\u0002*\b\u0012\u0004\u0012\u0002H\u00010\u000f\u00a2\u0006\u0002\u0010\u001dR\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000bX\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011\u00a8\u0006\u001e"}, d2 = {"Lcom/jsz/contactsapp/common/utils/BaseViewModel;", "S", "", "N", "Landroidx/lifecycle/ViewModel;", "initialState", "(Ljava/lang/Object;)V", "_navigationEvens", "Landroidx/lifecycle/MutableLiveData;", "_state", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "getDisposables", "()Lio/reactivex/disposables/CompositeDisposable;", "navigationEvents", "Landroidx/lifecycle/LiveData;", "getNavigationEvents", "()Landroidx/lifecycle/LiveData;", "state", "getState", "onCleared", "", "sendNavigationEvent", "navigationEvent", "setState", "reducer", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "requireValue", "(Landroidx/lifecycle/LiveData;)Ljava/lang/Object;", "app_debug"})
public abstract class BaseViewModel<S extends java.lang.Object, N extends java.lang.Object> extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final io.reactivex.disposables.CompositeDisposable disposables = null;
    private final androidx.lifecycle.MutableLiveData<S> _state = null;
    private final androidx.lifecycle.MutableLiveData<N> _navigationEvens = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<S> state = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<N> navigationEvents = null;
    
    public BaseViewModel(@org.jetbrains.annotations.NotNull
    S initialState) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    protected final io.reactivex.disposables.CompositeDisposable getDisposables() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<S> getState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<N> getNavigationEvents() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final <S extends java.lang.Object>S requireValue(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.LiveData<S> $this$requireValue) {
        return null;
    }
    
    @androidx.annotation.MainThread
    protected final void setState(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super S, ? extends S> reducer) {
    }
    
    @androidx.annotation.MainThread
    protected final void sendNavigationEvent(@org.jetbrains.annotations.NotNull
    N navigationEvent) {
    }
    
    @java.lang.Override
    protected void onCleared() {
    }
}