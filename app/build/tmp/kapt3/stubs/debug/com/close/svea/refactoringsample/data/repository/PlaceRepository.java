package com.close.svea.refactoringsample.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0005"}, d2 = {"Lcom/close/svea/refactoringsample/data/repository/PlaceRepository;", "", "getAllPlaces", "Lcom/close/svea/refactoringsample/domain/model/PlacesModel;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface PlaceRepository {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getAllPlaces(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.close.svea.refactoringsample.domain.model.PlacesModel> p0);
}