package com.close.svea.refactoringsample.data.network

import com.close.svea.refactoringsample.domain.model.PlacesModel
import kotlinx.coroutines.Deferred
import retrofit2.http.GET
import retrofit2.http.Query

interface PlacesApiService {

    @GET("meappid")
    fun getAllPlaces(
        @Query("meAppId") id: Int = 50,
        @Query("records") records: Int = 500
    ): Deferred<PlacesModel>
}

