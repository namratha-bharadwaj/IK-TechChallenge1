package com.tps.challenge.network.model

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Store remote data model.
 */
@JsonClass(generateAdapter = true)
data class StoreResponse(
    @Json(name = "id")
    val id: String,
    @Json(name = "name")
    val name: String,
    @Json(name = "description")
    val description: String,
    @Json(name = "cover_img_url")
    val coverImgUrl: String,
    @Json(name = "status")
    val status: String,
    @Json(name = "delivery_fee")
    val deliveryFeeCents: String,
)
