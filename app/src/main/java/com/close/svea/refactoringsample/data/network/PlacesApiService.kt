package com.close.svea.refactoringsample.data.network

import com.close.svea.refactoringsample.domain.model.PlacesModel
import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import kotlinx.coroutines.Deferred
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

val retrofit = Retrofit.Builder()
    .baseUrl("https://secure.closepayment.com/close-admin/1.0/place/")
    .addConverterFactory(MoshiConverterFactory.create())
    .addCallAdapterFactory(CoroutineCallAdapterFactory())
    .build()

interface PlacesApiService {

    @GET("meappid")
    fun getAllPlaces(
        @Query("meAppId") id: Int = 50,
        @Query("records") records: Int = 500
    ): Deferred<PlacesModel>
}

object PlaceApi {
    val placesApiService: PlacesApiService by lazy {
        retrofit.create(PlacesApiService::class.java)
    }
}