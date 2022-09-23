package com.tps.challenge.features.storefeed

import com.tps.challenge.network.model.StoreResponse

interface IClickListener {
    fun onStoreItemClick(storeFiItem: StoreResponse)
}