package com.tps.challenge.features.storefeed.repository

import com.tps.challenge.network.model.StoreResponse

interface StoreFeedRepository {

    suspend fun getStoreFeed(lat: Double, long: Double): List<StoreResponse>?

}