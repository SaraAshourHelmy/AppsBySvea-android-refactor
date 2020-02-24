package com.ltmtlu.volvocartask.ui.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u001c\u001a\u00020\u001dH\u0004J\u0006\u0010\u001e\u001a\u00020\u001dR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR \u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0006X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0013X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u00178F\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\r0\u00178F\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\u0019\u00a8\u0006\u001f"}, d2 = {"Lcom/ltmtlu/volvocartask/ui/base/BaseViewModel;", "Landroidx/lifecycle/ViewModel;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "_hasError", "Landroidx/lifecycle/MutableLiveData;", "Lcom/ltmtlu/volvocartask/ui/base/ErrorType;", "get_hasError", "()Landroidx/lifecycle/MutableLiveData;", "set_hasError", "(Landroidx/lifecycle/MutableLiveData;)V", "_hasVisibleProgressLiveData", "", "get_hasVisibleProgressLiveData", "set_hasVisibleProgressLiveData", "getContext", "()Landroid/content/Context;", "coroutineExceptionHandler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "getCoroutineExceptionHandler", "()Lkotlinx/coroutines/CoroutineExceptionHandler;", "hasError", "Landroidx/lifecycle/LiveData;", "getHasError", "()Landroidx/lifecycle/LiveData;", "hasVisibleProgressLiveData", "getHasVisibleProgressLiveData", "checkNetwork", "", "resetError", "app_debug"})
public class BaseViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> _hasVisibleProgressLiveData;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.ltmtlu.volvocartask.ui.base.ErrorType> _hasError;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.CoroutineExceptionHandler coroutineExceptionHandler = null;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    
    @org.jetbrains.annotations.NotNull()
    protected final androidx.lifecycle.MutableLiveData<java.lang.Boolean> get_hasVisibleProgressLiveData() {
        return null;
    }
    
    protected final void set_hasVisibleProgressLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getHasVisibleProgressLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final androidx.lifecycle.MutableLiveData<com.ltmtlu.volvocartask.ui.base.ErrorType> get_hasError() {
        return null;
    }
    
    protected final void set_hasError(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.ltmtlu.volvocartask.ui.base.ErrorType> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.ltmtlu.volvocartask.ui.base.ErrorType> getHasError() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final kotlinx.coroutines.CoroutineExceptionHandler getCoroutineExceptionHandler() {
        return null;
    }
    
    protected final void checkNetwork() {
    }
    
    public final void resetError() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public BaseViewModel(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
}