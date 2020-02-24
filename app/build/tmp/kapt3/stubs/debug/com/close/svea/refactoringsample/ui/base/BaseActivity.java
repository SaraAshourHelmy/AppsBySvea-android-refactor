package com.close.svea.refactoringsample.ui.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016\u00a8\u0006\r"}, d2 = {"Lcom/close/svea/refactoringsample/ui/base/BaseActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "init", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "showError", "view", "Landroid/view/View;", "viewModel", "Lcom/ltmtlu/volvocartask/ui/base/BaseViewModel;", "app_debug"})
public abstract class BaseActivity extends androidx.appcompat.app.AppCompatActivity {
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public abstract void init();
    
    public void showError(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.NotNull()
    com.ltmtlu.volvocartask.ui.base.BaseViewModel viewModel) {
    }
    
    public BaseActivity() {
        super();
    }
}