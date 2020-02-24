package com.close.svea.refactoringsample.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u0015\u001a\u00020\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0002J\u0006\u0010\u0018\u001a\u00020\u0016R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u00128F\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006\u0019"}, d2 = {"Lcom/close/svea/refactoringsample/ui/ShowPlacesViewModel;", "Lcom/ltmtlu/volvocartask/ui/base/BaseViewModel;", "context", "Landroid/content/Context;", "placeRepo", "Lcom/close/svea/refactoringsample/data/repository/PlaceRepository;", "(Landroid/content/Context;Lcom/close/svea/refactoringsample/data/repository/PlaceRepository;)V", "_placesLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/close/svea/refactoringsample/domain/model/PlaceModel;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "job", "Lkotlinx/coroutines/Job;", "getPlaceRepo", "()Lcom/close/svea/refactoringsample/data/repository/PlaceRepository;", "placesLiveData", "Landroidx/lifecycle/LiveData;", "getPlacesLiveData", "()Landroidx/lifecycle/LiveData;", "checkAndGetPlaces", "", "checkEmptyList", "fetchPlaces", "app_debug"})
public final class ShowPlacesViewModel extends com.ltmtlu.volvocartask.ui.base.BaseViewModel {
    private final kotlinx.coroutines.Job job = null;
    private final kotlinx.coroutines.CoroutineScope coroutineScope = null;
    private androidx.lifecycle.MutableLiveData<java.util.List<com.close.svea.refactoringsample.domain.model.PlaceModel>> _placesLiveData;
    @org.jetbrains.annotations.NotNull()
    private final com.close.svea.refactoringsample.data.repository.PlaceRepository placeRepo = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.close.svea.refactoringsample.domain.model.PlaceModel>> getPlacesLiveData() {
        return null;
    }
    
    public final void checkAndGetPlaces() {
    }
    
    public final void fetchPlaces() {
    }
    
    private final void checkEmptyList() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.close.svea.refactoringsample.data.repository.PlaceRepository getPlaceRepo() {
        return null;
    }
    
    public ShowPlacesViewModel(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.close.svea.refactoringsample.data.repository.PlaceRepository placeRepo) {
        super(null);
    }
}