package com.evgeny_m.data.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u001a\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u001a\u0010\u0010\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u001a\u0010\u0011\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u0010\u0010\u0012\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0004H\u0016R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0013"}, d2 = {"Lcom/evgeny_m/data/utils/AppChildEventListener;", "Lcom/google/firebase/database/ChildEventListener;", "onSuccess", "Lkotlin/Function1;", "Lcom/google/firebase/database/DataSnapshot;", "", "(Lkotlin/jvm/functions/Function1;)V", "getOnSuccess", "()Lkotlin/jvm/functions/Function1;", "onCancelled", "error", "Lcom/google/firebase/database/DatabaseError;", "onChildAdded", "snapshot", "previousChildName", "", "onChildChanged", "onChildMoved", "onChildRemoved", "data_debug"})
public final class AppChildEventListener implements com.google.firebase.database.ChildEventListener {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<com.google.firebase.database.DataSnapshot, kotlin.Unit> onSuccess = null;
    
    public AppChildEventListener(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.google.firebase.database.DataSnapshot, kotlin.Unit> onSuccess) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<com.google.firebase.database.DataSnapshot, kotlin.Unit> getOnSuccess() {
        return null;
    }
    
    @java.lang.Override()
    public void onChildAdded(@org.jetbrains.annotations.NotNull()
    com.google.firebase.database.DataSnapshot snapshot, @org.jetbrains.annotations.Nullable()
    java.lang.String previousChildName) {
    }
    
    @java.lang.Override()
    public void onChildChanged(@org.jetbrains.annotations.NotNull()
    com.google.firebase.database.DataSnapshot snapshot, @org.jetbrains.annotations.Nullable()
    java.lang.String previousChildName) {
    }
    
    @java.lang.Override()
    public void onChildRemoved(@org.jetbrains.annotations.NotNull()
    com.google.firebase.database.DataSnapshot snapshot) {
    }
    
    @java.lang.Override()
    public void onChildMoved(@org.jetbrains.annotations.NotNull()
    com.google.firebase.database.DataSnapshot snapshot, @org.jetbrains.annotations.Nullable()
    java.lang.String previousChildName) {
    }
    
    @java.lang.Override()
    public void onCancelled(@org.jetbrains.annotations.NotNull()
    com.google.firebase.database.DatabaseError error) {
    }
}