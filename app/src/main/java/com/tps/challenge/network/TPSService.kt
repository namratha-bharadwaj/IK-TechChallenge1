package com.tps.challenge.network

import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import com.tps.challenge.Constants
import com.tps.challenge.Constants.BASE_URL
import com.tps.challenge.network.model.StoreDetailsResponse
import com.tps.challenge.network.model.StoreResponse
import kotlinx.coroutines.Deferred
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

/**
 * Communicates with the TPS Challenge backend to obtain data.
 */

private val moshi = Moshi.Builder()
    .add(KotlinJsonAdapterFactory())
    .build()

private val retrofit = Retrofit.Builder()
    .addConverterFactory(MoshiConverterFactory.create(moshi))
    .addCallAdapterFactory(CoroutineCallAdapterFactory())
    .baseUrl(BASE_URL)
    .build()


interface TPSService {
    /**
     * Returns the Store feed per location provided.
     */
    @GET("v1/feed")
    suspend fun getStoreFeed(
        @Query("lat") latitude: Double,
        @Query("lng") longitude: Double
    ): List<StoreResponse>

    /**
     * Returns a detailed specification for the Store.
     */
    @GET("v1/stores/{id}")
    fun getStoreDetails(
        @Path("id") storeId: String
    ): Call<StoreDetailsResponse>
}

object TPSApi {
    val retrofitService: TPSService by lazy {
        retrofit.create(TPSService::class.java)
    }
}
