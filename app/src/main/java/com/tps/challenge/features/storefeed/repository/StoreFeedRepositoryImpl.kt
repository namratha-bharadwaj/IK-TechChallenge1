package com.tps.challenge.features.storefeed.repository

import android.util.Log
import com.tps.challenge.network.TPSService
import com.tps.challenge.network.model.StoreResponse
import java.lang.Exception

class StoreFeedRepositoryImpl(private val tpsService: TPSService): StoreFeedRepository {

    override suspend fun getStoreFeed(lat: Double, long: Double): List<StoreResponse>? {
        return try {
            val storeResponse = tpsService.getStoreFeed(lat, long)
            storeResponse
        } catch (e: Exception) {
            Log.e("TPSService", e.localizedMessage)
            null
        }
    }
}