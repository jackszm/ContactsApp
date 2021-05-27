package com.jsz.contactsapp.feature.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\f\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0018\u0019B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006JD\u0010\u0007\u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\n \u000b*\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\t \u000b*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\n \u000b*\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\t\u0018\u00010\b0\bH\u0002J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J,\u0010\u0010\u001a&\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\u00110\u0011 \u000b*\u0012\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\u00110\u0011\u0018\u00010\b0\bH\u0002J\u001e\u0010\u0012\u001a\u00020\u00022\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0014\u001a\u00020\u0011H\u0002J*\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\t*\u0014\u0012\u0004\u0012\u00020\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\t0\u0016H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/jsz/contactsapp/feature/main/MainViewModel;", "Lcom/jsz/contactsapp/common/utils/BaseViewModel;", "Lcom/jsz/contactsapp/feature/main/MainViewModel$State;", "Lcom/jsz/contactsapp/feature/main/MainViewModel$NavigationEvent;", "userRepository", "Lcom/jsz/contactsapp/data/user/UserRepository;", "(Lcom/jsz/contactsapp/data/user/UserRepository;)V", "getUsersWithHeaders", "Lio/reactivex/Observable;", "", "Lcom/jsz/contactsapp/feature/main/UsersListItemUiModel;", "kotlin.jvm.PlatformType", "onUserClicked", "", "user", "Lcom/jsz/contactsapp/data/user/domain/User;", "refreshUsers", "", "toUiModel", "items", "refreshing", "toUiModelLists", "", "", "NavigationEvent", "State", "app_debug"})
public final class MainViewModel extends com.jsz.contactsapp.common.utils.BaseViewModel<com.jsz.contactsapp.feature.main.MainViewModel.State, com.jsz.contactsapp.feature.main.MainViewModel.NavigationEvent> {
    private final com.jsz.contactsapp.data.user.UserRepository userRepository = null;
    
    public MainViewModel(@org.jetbrains.annotations.NotNull
    com.jsz.contactsapp.data.user.UserRepository userRepository) {
        super(null);
    }
    
    private final io.reactivex.Observable<java.util.List<com.jsz.contactsapp.feature.main.UsersListItemUiModel>> getUsersWithHeaders() {
        return null;
    }
    
    private final java.util.List<java.util.List<com.jsz.contactsapp.feature.main.UsersListItemUiModel>> toUiModelLists(java.util.Map<java.lang.Character, ? extends java.util.List<com.jsz.contactsapp.data.user.domain.User>> $this$toUiModelLists) {
        return null;
    }
    
    private final io.reactivex.Observable<java.lang.Boolean> refreshUsers() {
        return null;
    }
    
    private final com.jsz.contactsapp.feature.main.MainViewModel.State toUiModel(java.util.List<? extends com.jsz.contactsapp.feature.main.UsersListItemUiModel> items, boolean refreshing) {
        return null;
    }
    
    private final void onUserClicked(com.jsz.contactsapp.data.user.domain.User user) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b\u00a8\u0006\t"}, d2 = {"Lcom/jsz/contactsapp/feature/main/MainViewModel$State;", "", "()V", "Data", "Error", "Loading", "Lcom/jsz/contactsapp/feature/main/MainViewModel$State$Loading;", "Lcom/jsz/contactsapp/feature/main/MainViewModel$State$Data;", "Lcom/jsz/contactsapp/feature/main/MainViewModel$State$Error;", "app_debug"})
    public static abstract class State {
        
        private State() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/jsz/contactsapp/feature/main/MainViewModel$State$Loading;", "Lcom/jsz/contactsapp/feature/main/MainViewModel$State;", "()V", "app_debug"})
        public static final class Loading extends com.jsz.contactsapp.feature.main.MainViewModel.State {
            @org.jetbrains.annotations.NotNull
            public static final com.jsz.contactsapp.feature.main.MainViewModel.State.Loading INSTANCE = null;
            
            private Loading() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0016"}, d2 = {"Lcom/jsz/contactsapp/feature/main/MainViewModel$State$Data;", "Lcom/jsz/contactsapp/feature/main/MainViewModel$State;", "refreshing", "", "items", "", "Lcom/jsz/contactsapp/feature/main/UsersListItemUiModel;", "(ZLjava/util/List;)V", "getItems", "()Ljava/util/List;", "getRefreshing", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "app_debug"})
        public static final class Data extends com.jsz.contactsapp.feature.main.MainViewModel.State {
            private final boolean refreshing = false;
            @org.jetbrains.annotations.NotNull
            private final java.util.List<com.jsz.contactsapp.feature.main.UsersListItemUiModel> items = null;
            
            @org.jetbrains.annotations.NotNull
            public final com.jsz.contactsapp.feature.main.MainViewModel.State.Data copy(boolean refreshing, @org.jetbrains.annotations.NotNull
            java.util.List<? extends com.jsz.contactsapp.feature.main.UsersListItemUiModel> items) {
                return null;
            }
            
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object p0) {
                return false;
            }
            
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public java.lang.String toString() {
                return null;
            }
            
            public Data(boolean refreshing, @org.jetbrains.annotations.NotNull
            java.util.List<? extends com.jsz.contactsapp.feature.main.UsersListItemUiModel> items) {
                super();
            }
            
            public final boolean component1() {
                return false;
            }
            
            public final boolean getRefreshing() {
                return false;
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.util.List<com.jsz.contactsapp.feature.main.UsersListItemUiModel> component2() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.util.List<com.jsz.contactsapp.feature.main.UsersListItemUiModel> getItems() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/jsz/contactsapp/feature/main/MainViewModel$State$Error;", "Lcom/jsz/contactsapp/feature/main/MainViewModel$State;", "()V", "app_debug"})
        public static final class Error extends com.jsz.contactsapp.feature.main.MainViewModel.State {
            @org.jetbrains.annotations.NotNull
            public static final com.jsz.contactsapp.feature.main.MainViewModel.State.Error INSTANCE = null;
            
            private Error() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0001\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/jsz/contactsapp/feature/main/MainViewModel$NavigationEvent;", "", "()V", "OnUserClicked", "Lcom/jsz/contactsapp/feature/main/MainViewModel$NavigationEvent$OnUserClicked;", "app_debug"})
    public static abstract class NavigationEvent {
        
        private NavigationEvent() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/jsz/contactsapp/feature/main/MainViewModel$NavigationEvent$OnUserClicked;", "Lcom/jsz/contactsapp/feature/main/MainViewModel$NavigationEvent;", "userId", "", "(Ljava/lang/String;)V", "getUserId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
        public static final class OnUserClicked extends com.jsz.contactsapp.feature.main.MainViewModel.NavigationEvent {
            @org.jetbrains.annotations.NotNull
            private final java.lang.String userId = null;
            
            @org.jetbrains.annotations.NotNull
            public final com.jsz.contactsapp.feature.main.MainViewModel.NavigationEvent.OnUserClicked copy(@org.jetbrains.annotations.NotNull
            java.lang.String userId) {
                return null;
            }
            
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object p0) {
                return false;
            }
            
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public java.lang.String toString() {
                return null;
            }
            
            public OnUserClicked(@org.jetbrains.annotations.NotNull
            java.lang.String userId) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String getUserId() {
                return null;
            }
        }
    }
}