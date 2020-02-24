package com.close.svea.refactoringsample.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\n"}, d2 = {"Lcom/close/svea/refactoringsample/data/repository/PlaceRepositoryImpl;", "Lcom/close/svea/refactoringsample/data/repository/PlaceRepository;", "placesApiService", "Lcom/close/svea/refactoringsample/data/network/PlacesApiService;", "(Lcom/close/svea/refactoringsample/data/network/PlacesApiService;)V", "getPlacesApiService", "()Lcom/close/svea/refactoringsample/data/network/PlacesApiService;", "getAllPlaces", "Lcom/close/svea/refactoringsample/domain/model/PlacesModel;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class PlaceRepositoryImpl implements com.close.svea.refactoringsample.data.repository.PlaceRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.close.svea.refactoringsample.data.network.PlacesApiService placesApiService = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getAllPlaces(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.close.svea.refactoringsample.domain.model.PlacesModel> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.close.svea.refactoringsample.data.network.PlacesApiService getPlacesApiService() {
        return null;
    }
    
    public PlaceRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.close.svea.refactoringsample.data.network.PlacesApiService placesApiService) {
        super();
    }
}