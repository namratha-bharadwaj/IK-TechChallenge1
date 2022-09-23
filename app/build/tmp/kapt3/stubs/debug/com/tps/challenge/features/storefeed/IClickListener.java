package com.tps.challenge.features.storefeed;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/tps/challenge/features/storefeed/IClickListener;", "", "onStoreItemClick", "", "storeFiItem", "Lcom/tps/challenge/network/model/StoreResponse;", "app_debug"})
public abstract interface IClickListener {
    
    public abstract void onStoreItemClick(@org.jetbrains.annotations.NotNull()
    com.tps.challenge.network.model.StoreResponse storeFiItem);
}