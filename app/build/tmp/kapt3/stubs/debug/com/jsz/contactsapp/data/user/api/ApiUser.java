package com.jsz.contactsapp.data.user.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\tH\u00c6\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\tH\u00c6\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u0007H\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u001e"}, d2 = {"Lcom/jsz/contactsapp/data/user/api/ApiUser;", "", "id", "Lcom/jsz/contactsapp/data/user/api/ApiId;", "name", "Lcom/jsz/contactsapp/data/user/api/ApiUserName;", "email", "", "picture", "Lcom/jsz/contactsapp/data/user/api/ApiUserPicture;", "(Lcom/jsz/contactsapp/data/user/api/ApiId;Lcom/jsz/contactsapp/data/user/api/ApiUserName;Ljava/lang/String;Lcom/jsz/contactsapp/data/user/api/ApiUserPicture;)V", "getEmail", "()Ljava/lang/String;", "getId", "()Lcom/jsz/contactsapp/data/user/api/ApiId;", "getName", "()Lcom/jsz/contactsapp/data/user/api/ApiUserName;", "getPicture", "()Lcom/jsz/contactsapp/data/user/api/ApiUserPicture;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class ApiUser {
    @org.jetbrains.annotations.NotNull
    private final com.jsz.contactsapp.data.user.api.ApiId id = null;
    @org.jetbrains.annotations.NotNull
    private final com.jsz.contactsapp.data.user.api.ApiUserName name = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String email = null;
    @org.jetbrains.annotations.NotNull
    private final com.jsz.contactsapp.data.user.api.ApiUserPicture picture = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.jsz.contactsapp.data.user.api.ApiUser copy(@org.jetbrains.annotations.NotNull
    @com.squareup.moshi.Json(name = "id")
    com.jsz.contactsapp.data.user.api.ApiId id, @org.jetbrains.annotations.NotNull
    @com.squareup.moshi.Json(name = "name")
    com.jsz.contactsapp.data.user.api.ApiUserName name, @org.jetbrains.annotations.NotNull
    @com.squareup.moshi.Json(name = "email")
    java.lang.String email, @org.jetbrains.annotations.NotNull
    @com.squareup.moshi.Json(name = "picture")
    com.jsz.contactsapp.data.user.api.ApiUserPicture picture) {
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
    
    public ApiUser(@org.jetbrains.annotations.NotNull
    @com.squareup.moshi.Json(name = "id")
    com.jsz.contactsapp.data.user.api.ApiId id, @org.jetbrains.annotations.NotNull
    @com.squareup.moshi.Json(name = "name")
    com.jsz.contactsapp.data.user.api.ApiUserName name, @org.jetbrains.annotations.NotNull
    @com.squareup.moshi.Json(name = "email")
    java.lang.String email, @org.jetbrains.annotations.NotNull
    @com.squareup.moshi.Json(name = "picture")
    com.jsz.contactsapp.data.user.api.ApiUserPicture picture) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.jsz.contactsapp.data.user.api.ApiId component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.jsz.contactsapp.data.user.api.ApiId getId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.jsz.contactsapp.data.user.api.ApiUserName component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.jsz.contactsapp.data.user.api.ApiUserName getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getEmail() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.jsz.contactsapp.data.user.api.ApiUserPicture component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.jsz.contactsapp.data.user.api.ApiUserPicture getPicture() {
        return null;
    }
}