package com.close.svea.refactoringsample.data.repository

import com.close.svea.refactoringsample.domain.model.PlacesModel


interface PlaceRepository {

    suspend fun getAllPlaces(): PlacesModel
}