package com.tps.challenge.network.model

import android.os.Parcelable
import com.squareup.moshi.Json
import kotlinx.android.parcel.Parcelize

/**
 * Store remote data model.
 */
@Parcelize
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
) : Parcelable
