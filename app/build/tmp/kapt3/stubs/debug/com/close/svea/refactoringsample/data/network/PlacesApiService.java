package com.close.svea.refactoringsample.data.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\u0006H\'\u00a8\u0006\b"}, d2 = {"Lcom/close/svea/refactoringsample/data/network/PlacesApiService;", "", "getAllPlaces", "Lkotlinx/coroutines/Deferred;", "Lcom/close/svea/refactoringsample/domain/model/PlacesModel;", "id", "", "records", "app_debug"})
public abstract interface PlacesApiService {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "meappid")
    public abstract kotlinx.coroutines.Deferred<com.close.svea.refactoringsample.domain.model.PlacesModel> getAllPlaces(@retrofit2.http.Query(value = "meAppId")
    int id, @retrofit2.http.Query(value = "records")
    int records);
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
    }
}