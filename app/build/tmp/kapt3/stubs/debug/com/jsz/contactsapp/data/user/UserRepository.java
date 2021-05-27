package com.jsz.contactsapp.data.user;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u0007\u001a\u00020\bJ\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nJ\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000e2\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/jsz/contactsapp/data/user/UserRepository;", "", "usersApi", "Lcom/jsz/contactsapp/data/user/api/UsersApiService;", "usersDao", "Lcom/jsz/contactsapp/data/user/db/UserDao;", "(Lcom/jsz/contactsapp/data/user/api/UsersApiService;Lcom/jsz/contactsapp/data/user/db/UserDao;)V", "fetchUsers", "Lio/reactivex/Completable;", "getUsers", "Lio/reactivex/Observable;", "", "Lcom/jsz/contactsapp/data/user/domain/User;", "requireUserById", "Lio/reactivex/Single;", "userId", "", "app_debug"})
public final class UserRepository {
    private final com.jsz.contactsapp.data.user.api.UsersApiService usersApi = null;
    private final com.jsz.contactsapp.data.user.db.UserDao usersDao = null;
    
    public UserRepository(@org.jetbrains.annotations.NotNull
    com.jsz.contactsapp.data.user.api.UsersApiService usersApi, @org.jetbrains.annotations.NotNull
    com.jsz.contactsapp.data.user.db.UserDao usersDao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.Observable<java.util.List<com.jsz.contactsapp.data.user.domain.User>> getUsers() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.Single<com.jsz.contactsapp.data.user.domain.User> requireUserById(@org.jetbrains.annotations.NotNull
    java.lang.String userId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.Completable fetchUsers() {
        return null;
    }
}