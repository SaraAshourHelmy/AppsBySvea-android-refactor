package com.close.svea.refactoringsample.data.repository

import com.close.svea.refactoringsample.data.network.PlacesApiService
import com.close.svea.refactoringsample.domain.model.PlacesModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class PlaceRepositoryImpl(val placesApiService: PlacesApiService) : PlaceRepository {
    override suspend fun getAllPlaces(): PlacesModel {
        return withContext(Dispatchers.IO)
        {
            placesApiService.getAllPlaces().await()
        }
    }
}