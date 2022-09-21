package com.tps.challenge.features.storefeed.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.tps.challenge.Constants
import com.tps.challenge.features.storefeed.repository.StoreFeedRepository
import com.tps.challenge.network.model.StoreResponse
import kotlinx.coroutines.launch

class StoreFeedViewModel(val repository: StoreFeedRepository): ViewModel() {

    private var _storeFeedList = MutableLiveData<List<StoreResponse>>()
    val storeFeedList: LiveData<List<StoreResponse>>
            get() = _storeFeedList


    fun fetchStoreFeed(lat: Double, long: Double) {
        viewModelScope.launch {
            val storeFeed = repository.getStoreFeed(lat, long)
            storeFeed?.let { storeFeedList ->
                _storeFeedList.postValue(storeFeedList)
            }
        }
    }



}