package com.close.svea.refactoringsample.domain.model

import com.squareup.moshi.Json

data class PlaceModel(
    @Json(name = "alias") val alias: String,
    @Json(name = "name") val name: String,
    @Json(name = "longitude") val longitude: Double,
    @Json(name = "latitude") val latitude: Double,
    @Json(name = "description") val description: String,
    @Json(name = "icon") val icon: String
)