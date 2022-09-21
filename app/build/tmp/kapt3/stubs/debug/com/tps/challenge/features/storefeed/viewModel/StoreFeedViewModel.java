package com.tps.challenge.features.storefeed.viewModel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\f8F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0014"}, d2 = {"Lcom/tps/challenge/features/storefeed/viewModel/StoreFeedViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/tps/challenge/features/storefeed/repository/StoreFeedRepository;", "(Lcom/tps/challenge/features/storefeed/repository/StoreFeedRepository;)V", "_storeFeedList", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/tps/challenge/network/model/StoreResponse;", "getRepository", "()Lcom/tps/challenge/features/storefeed/repository/StoreFeedRepository;", "storeFeedList", "Landroidx/lifecycle/LiveData;", "getStoreFeedList", "()Landroidx/lifecycle/LiveData;", "fetchStoreFeed", "", "lat", "", "long", "app_debug"})
public final class StoreFeedViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.tps.challenge.features.storefeed.repository.StoreFeedRepository repository = null;
    private androidx.lifecycle.MutableLiveData<java.util.List<com.tps.challenge.network.model.StoreResponse>> _storeFeedList;
    
    public StoreFeedViewModel(@org.jetbrains.annotations.NotNull()
    com.tps.challenge.features.storefeed.repository.StoreFeedRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.tps.challenge.features.storefeed.repository.StoreFeedRepository getRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.tps.challenge.network.model.StoreResponse>> getStoreFeedList() {
        return null;
    }
    
    public final void fetchStoreFeed(double lat, double p1_1663806) {
    }
}