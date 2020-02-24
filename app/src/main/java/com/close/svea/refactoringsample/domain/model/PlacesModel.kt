package com.close.svea.refactoringsample.domain.model

import com.squareup.moshi.Json

data class PlacesModel(
    @Json(name = "place") val place: List<PlaceModel>,
    @Json(name = "total") val total: Int
)