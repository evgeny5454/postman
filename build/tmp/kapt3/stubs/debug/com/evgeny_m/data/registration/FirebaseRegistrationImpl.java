package com.evgeny_m.data.registration;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000bH\u0016J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0010H\u0016J\b\u0010\u0011\u001a\u00020\rH\u0016J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u000bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/evgeny_m/data/registration/FirebaseRegistrationImpl;", "Lcom/evgeny_m/domain/repository/FirebaseRegistration;", "Lcom/evgeny_m/data/repository/DataRepository;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "auth", "Lcom/google/firebase/auth/FirebaseAuth;", "callbacks", "Lcom/google/firebase/auth/PhoneAuthProvider$OnVerificationStateChangedCallbacks;", "verificationId", "", "enterSmsCode", "", "code", "getUserId", "Landroidx/lifecycle/LiveData;", "logOut", "registerUserByPhoneNumber", "phoneNumber", "data_debug"})
public final class FirebaseRegistrationImpl implements com.evgeny_m.domain.repository.FirebaseRegistration, com.evgeny_m.data.repository.DataRepository {
    private final android.app.Application application = null;
    private com.google.firebase.auth.FirebaseAuth auth;
    private com.google.firebase.auth.PhoneAuthProvider.OnVerificationStateChangedCallbacks callbacks;
    private java.lang.String verificationId;
    
    public FirebaseRegistrationImpl(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super();
    }
    
    @java.lang.Override()
    public void registerUserByPhoneNumber(@org.jetbrains.annotations.NotNull()
    java.lang.String phoneNumber) {
    }
    
    @java.lang.Override()
    public void enterSmsCode(@org.jetbrains.annotations.NotNull()
    java.lang.String code) {
    }
    
    @java.lang.Override()
    public void logOut() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<java.lang.String> getUserId() {
        return null;
    }
}