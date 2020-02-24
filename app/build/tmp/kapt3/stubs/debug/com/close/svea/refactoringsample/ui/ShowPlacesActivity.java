package com.close.svea.refactoringsample.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0002J\u0012\u0010\u0011\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u0012\u0010\u0014\u001a\u00020\u000f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0014J\b\u0010\u0017\u001a\u00020\u000fH\u0002J\b\u0010\u0018\u001a\u00020\u000fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r\u00a8\u0006\u0019"}, d2 = {"Lcom/close/svea/refactoringsample/ui/ShowPlacesActivity;", "Lcom/close/svea/refactoringsample/ui/base/BaseActivity;", "Landroid/view/View$OnClickListener;", "()V", "binding", "Lcom/close/svea/refactoringsample/databinding/ShowPlacesActivityBinding;", "placeComponent", "Lcom/ltmtlu/volvocartask/DI/PlacesComponent;", "viewModel", "Lcom/close/svea/refactoringsample/ui/ShowPlacesViewModel;", "getViewModel", "()Lcom/close/svea/refactoringsample/ui/ShowPlacesViewModel;", "setViewModel", "(Lcom/close/svea/refactoringsample/ui/ShowPlacesViewModel;)V", "init", "", "observeData", "onClick", "v", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "showNetworkErrorView", "showTryAgainView", "app_debug"})
public final class ShowPlacesActivity extends com.close.svea.refactoringsample.ui.base.BaseActivity implements android.view.View.OnClickListener {
    private com.close.svea.refactoringsample.databinding.ShowPlacesActivityBinding binding;
    private com.ltmtlu.volvocartask.DI.PlacesComponent placeComponent;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.close.svea.refactoringsample.ui.ShowPlacesViewModel viewModel;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.close.svea.refactoringsample.ui.ShowPlacesViewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.NotNull()
    com.close.svea.refactoringsample.ui.ShowPlacesViewModel p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void init() {
    }
    
    private final void observeData() {
    }
    
    private final void showTryAgainView() {
    }
    
    private final void showNetworkErrorView() {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.view.View v) {
    }
    
    public ShowPlacesActivity() {
        super();
    }
}