package com.jsz.contactsapp.feature.details;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\tB\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\b\u00a8\u0006\n"}, d2 = {"Lcom/jsz/contactsapp/feature/details/UserDetailsViewModel;", "Lcom/jsz/contactsapp/common/utils/BaseViewModel;", "Lcom/jsz/contactsapp/feature/details/UserDetailsViewModel$State;", "", "userId", "", "userRepository", "Lcom/jsz/contactsapp/data/user/UserRepository;", "(Ljava/lang/String;Lcom/jsz/contactsapp/data/user/UserRepository;)V", "State", "app_debug"})
public final class UserDetailsViewModel extends com.jsz.contactsapp.common.utils.BaseViewModel<com.jsz.contactsapp.feature.details.UserDetailsViewModel.State, kotlin.Unit> {
    
    public UserDetailsViewModel(@org.jetbrains.annotations.NotNull
    java.lang.String userId, @org.jetbrains.annotations.NotNull
    com.jsz.contactsapp.data.user.UserRepository userRepository) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b\u00a8\u0006\t"}, d2 = {"Lcom/jsz/contactsapp/feature/details/UserDetailsViewModel$State;", "", "()V", "Data", "Error", "Loading", "Lcom/jsz/contactsapp/feature/details/UserDetailsViewModel$State$Loading;", "Lcom/jsz/contactsapp/feature/details/UserDetailsViewModel$State$Error;", "Lcom/jsz/contactsapp/feature/details/UserDetailsViewModel$State$Data;", "app_debug"})
    public static abstract class State {
        
        private State() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/jsz/contactsapp/feature/details/UserDetailsViewModel$State$Loading;", "Lcom/jsz/contactsapp/feature/details/UserDetailsViewModel$State;", "()V", "app_debug"})
        public static final class Loading extends com.jsz.contactsapp.feature.details.UserDetailsViewModel.State {
            @org.jetbrains.annotations.NotNull
            public static final com.jsz.contactsapp.feature.details.UserDetailsViewModel.State.Loading INSTANCE = null;
            
            private Loading() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/jsz/contactsapp/feature/details/UserDetailsViewModel$State$Error;", "Lcom/jsz/contactsapp/feature/details/UserDetailsViewModel$State;", "()V", "app_debug"})
        public static final class Error extends com.jsz.contactsapp.feature.details.UserDetailsViewModel.State {
            @org.jetbrains.annotations.NotNull
            public static final com.jsz.contactsapp.feature.details.UserDetailsViewModel.State.Error INSTANCE = null;
            
            private Error() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0013"}, d2 = {"Lcom/jsz/contactsapp/feature/details/UserDetailsViewModel$State$Data;", "Lcom/jsz/contactsapp/feature/details/UserDetailsViewModel$State;", "fullName", "", "imageUrl", "(Ljava/lang/String;Ljava/lang/String;)V", "getFullName", "()Ljava/lang/String;", "getImageUrl", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
        public static final class Data extends com.jsz.contactsapp.feature.details.UserDetailsViewModel.State {
            @org.jetbrains.annotations.NotNull
            private final java.lang.String fullName = null;
            @org.jetbrains.annotations.NotNull
            private final java.lang.String imageUrl = null;
            
            @org.jetbrains.annotations.NotNull
            public final com.jsz.contactsapp.feature.details.UserDetailsViewModel.State.Data copy(@org.jetbrains.annotations.NotNull
            java.lang.String fullName, @org.jetbrains.annotations.NotNull
            java.lang.String imageUrl) {
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
            
            public Data(@org.jetbrains.annotations.NotNull
            java.lang.String fullName, @org.jetbrains.annotations.NotNull
            java.lang.String imageUrl) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String getFullName() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String component2() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String getImageUrl() {
                return null;
            }
        }
    }
}