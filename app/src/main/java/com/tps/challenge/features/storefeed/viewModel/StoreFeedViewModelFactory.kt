package com.tps.challenge.features.storefeed.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.tps.challenge.features.storefeed.repository.StoreFeedRepository
import java.lang.IllegalArgumentException

class StoreFeedViewModelFactory(private val repository: StoreFeedRepository): ViewModelProvider.NewInstanceFactory() {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(StoreFeedViewModel::class.java)){
            return StoreFeedViewModel(repository) as T
        }
        throw IllegalArgumentException("Unknown Viewmodel class")
    }
}