package com.ltmtlu.volvocartask.DI

import com.close.svea.refactoringsample.DI.NetworkModule
import com.close.svea.refactoringsample.data.network.PlacesApiService
import com.close.svea.refactoringsample.data.repository.PlaceRepositoryImpl
import dagger.Module
import dagger.Provides

@Module(includes = [NetworkModule::class])
class PlaceRepoModule {

    @Provides
    fun providePlaceRepo(placesApiService: PlacesApiService): PlaceRepositoryImpl {
        return PlaceRepositoryImpl(placesApiService)
    }
}