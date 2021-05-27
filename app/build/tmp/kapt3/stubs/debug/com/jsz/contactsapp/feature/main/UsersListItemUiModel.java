package com.jsz.contactsapp.feature.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/jsz/contactsapp/feature/main/UsersListItemUiModel;", "Lcom/jsz/contactsapp/common/utils/HasId;", "()V", "LetterHeader", "UserItemUiModel", "Lcom/jsz/contactsapp/feature/main/UsersListItemUiModel$LetterHeader;", "Lcom/jsz/contactsapp/feature/main/UsersListItemUiModel$UserItemUiModel;", "app_debug"})
public abstract class UsersListItemUiModel implements com.jsz.contactsapp.common.utils.HasId {
    
    private UsersListItemUiModel() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0003H\u00d6\u0001R\u0014\u0010\u0005\u001a\u00020\u00038VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lcom/jsz/contactsapp/feature/main/UsersListItemUiModel$LetterHeader;", "Lcom/jsz/contactsapp/feature/main/UsersListItemUiModel;", "letterLabel", "", "(Ljava/lang/String;)V", "id", "getId", "()Ljava/lang/String;", "getLetterLabel", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class LetterHeader extends com.jsz.contactsapp.feature.main.UsersListItemUiModel {
        @org.jetbrains.annotations.NotNull
        private final java.lang.String letterLabel = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.jsz.contactsapp.feature.main.UsersListItemUiModel.LetterHeader copy(@org.jetbrains.annotations.NotNull
        java.lang.String letterLabel) {
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
        
        public LetterHeader(@org.jetbrains.annotations.NotNull
        java.lang.String letterLabel) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getLetterLabel() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String getId() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\u00c6\u0003J#\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\nH\u00d6\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0019"}, d2 = {"Lcom/jsz/contactsapp/feature/main/UsersListItemUiModel$UserItemUiModel;", "Lcom/jsz/contactsapp/feature/main/UsersListItemUiModel;", "user", "Lcom/jsz/contactsapp/data/user/domain/User;", "clickAction", "Lcom/jsz/contactsapp/common/utils/Action;", "(Lcom/jsz/contactsapp/data/user/domain/User;Lcom/jsz/contactsapp/common/utils/Action;)V", "getClickAction", "()Lcom/jsz/contactsapp/common/utils/Action;", "id", "", "getId", "()Ljava/lang/String;", "getUser", "()Lcom/jsz/contactsapp/data/user/domain/User;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class UserItemUiModel extends com.jsz.contactsapp.feature.main.UsersListItemUiModel {
        @org.jetbrains.annotations.NotNull
        private final com.jsz.contactsapp.data.user.domain.User user = null;
        @org.jetbrains.annotations.NotNull
        private final com.jsz.contactsapp.common.utils.Action<com.jsz.contactsapp.data.user.domain.User> clickAction = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.jsz.contactsapp.feature.main.UsersListItemUiModel.UserItemUiModel copy(@org.jetbrains.annotations.NotNull
        com.jsz.contactsapp.data.user.domain.User user, @org.jetbrains.annotations.NotNull
        com.jsz.contactsapp.common.utils.Action<? super com.jsz.contactsapp.data.user.domain.User> clickAction) {
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
        
        public UserItemUiModel(@org.jetbrains.annotations.NotNull
        com.jsz.contactsapp.data.user.domain.User user, @org.jetbrains.annotations.NotNull
        com.jsz.contactsapp.common.utils.Action<? super com.jsz.contactsapp.data.user.domain.User> clickAction) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.jsz.contactsapp.data.user.domain.User component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.jsz.contactsapp.data.user.domain.User getUser() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.jsz.contactsapp.common.utils.Action<com.jsz.contactsapp.data.user.domain.User> component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.jsz.contactsapp.common.utils.Action<com.jsz.contactsapp.data.user.domain.User> getClickAction() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String getId() {
            return null;
        }
    }
}