package com.close.svea.refactoringsample.DI;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bH\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/close/svea/refactoringsample/DI/ShowPlacesViewModelModule;", "", "activity", "Lcom/close/svea/refactoringsample/ui/ShowPlacesActivity;", "(Lcom/close/svea/refactoringsample/ui/ShowPlacesActivity;)V", "getActivity", "()Lcom/close/svea/refactoringsample/ui/ShowPlacesActivity;", "providePlaceFactory", "Lcom/close/svea/refactoringsample/ui/item/ShowPlacesViewModelFactory;", "context", "Landroid/content/Context;", "placeRepository", "Lcom/close/svea/refactoringsample/data/repository/PlaceRepositoryImpl;", "provideShowPlaceViewModel", "Lcom/close/svea/refactoringsample/ui/ShowPlacesViewModel;", "placesViewModelFactory", "app_debug"})
@dagger.Module(includes = {com.ltmtlu.volvocartask.DI.PlaceRepoModule.class})
public final class ShowPlacesViewModelModule {
    @org.jetbrains.annotations.NotNull()
    private final com.close.svea.refactoringsample.ui.ShowPlacesActivity activity = null;
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.close.svea.refactoringsample.ui.ShowPlacesViewModel provideShowPlaceViewModel(@org.jetbrains.annotations.NotNull()
    com.close.svea.refactoringsample.ui.item.ShowPlacesViewModelFactory placesViewModelFactory) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.close.svea.refactoringsample.ui.item.ShowPlacesViewModelFactory providePlaceFactory(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.close.svea.refactoringsample.data.repository.PlaceRepositoryImpl placeRepository) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.close.svea.refactoringsample.ui.ShowPlacesActivity getActivity() {
        return null;
    }
    
    public ShowPlacesViewModelModule(@org.jetbrains.annotations.NotNull()
    com.close.svea.refactoringsample.ui.ShowPlacesActivity activity) {
        super();
    }
}