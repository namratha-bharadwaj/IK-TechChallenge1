package com.tps.challenge.features.storefeed.views;

import java.lang.System;

/**
 * Displays the list of Stores with its title, description and the cover image to the user.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 #2\u00020\u00012\u00020\u0002:\u0001#B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\u0012\u0010\u0013\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J&\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u0010\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u001a\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u00172\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010!\u001a\u00020\u0012H\u0002J\b\u0010\"\u001a\u00020\u0012H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0002X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"Lcom/tps/challenge/features/storefeed/views/StoreFeedFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/tps/challenge/features/storefeed/IClickListener;", "()V", "binding", "Lcom/tps/challenge/databinding/FragmentStoreFeedBinding;", "clickListener", "storeFeedAdapter", "Lcom/tps/challenge/features/storefeed/StoreFeedAdapter;", "storeViewModel", "Lcom/tps/challenge/features/storefeed/viewModel/StoreFeedViewModel;", "getStoreViewModel", "()Lcom/tps/challenge/features/storefeed/viewModel/StoreFeedViewModel;", "storeViewModel$delegate", "Lkotlin/Lazy;", "storesRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "navigateToDetailsFragment", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onStoreItemClick", "storeFiItem", "Lcom/tps/challenge/network/model/StoreResponse;", "onViewCreated", "view", "setupClickListener", "setupRecyclerView", "Companion", "app_debug"})
public final class StoreFeedFragment extends androidx.fragment.app.Fragment implements com.tps.challenge.features.storefeed.IClickListener {
    @org.jetbrains.annotations.NotNull()
    public static final com.tps.challenge.features.storefeed.views.StoreFeedFragment.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAG = "StoreFeedFragment";
    private com.tps.challenge.features.storefeed.StoreFeedAdapter storeFeedAdapter;
    private androidx.recyclerview.widget.RecyclerView storesRecyclerView;
    private com.tps.challenge.databinding.FragmentStoreFeedBinding binding;
    private com.tps.challenge.features.storefeed.IClickListener clickListener;
    private final kotlin.Lazy storeViewModel$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    public StoreFeedFragment() {
        super();
    }
    
    private final com.tps.challenge.features.storefeed.viewModel.StoreFeedViewModel getStoreViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void setupClickListener() {
    }
    
    private final void setupRecyclerView() {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onStoreItemClick(@org.jetbrains.annotations.NotNull()
    com.tps.challenge.network.model.StoreResponse storeFiItem) {
    }
    
    private final void navigateToDetailsFragment() {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/tps/challenge/features/storefeed/views/StoreFeedFragment$Companion;", "", "()V", "TAG", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}