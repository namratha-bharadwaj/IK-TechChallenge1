package com.tps.challenge;

import java.lang.System;

/**
 * A Factory class that reduces the boilerplate to initialize the ViewModel within the Activity or a Fragment.
 * Check for usage examples in this codebase and feel free to copy-paste if it will be necessary.
 *
 * Usage example:
 *
 *   @Inject
 *   lateinit var viewModelFactory: ViewModelFactory<StoreFeedViewModel>
 *
 *   private val viewModel: StoreFeedViewModel by lazy {
 *       viewModelFactory.get<StoreFeedViewModel>(
 *           requireActivity()
 *       )
 *   }
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0015\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u00a2\u0006\u0002\u0010\u0006J\'\u0010\u0007\u001a\u0002H\u0001\"\n\b\u0001\u0010\u0001*\u0004\u0018\u00010\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00010\tH\u0016\u00a2\u0006\u0002\u0010\nJ\"\u0010\u000b\u001a\u00028\u0000\"\n\b\u0001\u0010\f\u0018\u0001*\u00028\u00002\u0006\u0010\r\u001a\u00020\u000eH\u0086\b\u00a2\u0006\u0002\u0010\u000fR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/tps/challenge/ViewModelFactory;", "T", "Landroidx/lifecycle/ViewModel;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "viewModel", "Ldagger/Lazy;", "(Ldagger/Lazy;)V", "create", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "get", "R", "viewModelStoreOwner", "Landroidx/lifecycle/ViewModelStoreOwner;", "(Landroidx/lifecycle/ViewModelStoreOwner;)Landroidx/lifecycle/ViewModel;", "app_debug"})
public final class ViewModelFactory<T extends androidx.lifecycle.ViewModel> implements androidx.lifecycle.ViewModelProvider.Factory {
    private final dagger.Lazy<T> viewModel = null;
    
    @javax.inject.Inject()
    public ViewModelFactory(@org.jetbrains.annotations.NotNull()
    dagger.Lazy<T> viewModel) {
        super();
    }
    
    @kotlin.Suppress(names = {"UNCHECKED_CAST"})
    @java.lang.Override()
    public <T extends androidx.lifecycle.ViewModel>T create(@org.jetbrains.annotations.NotNull()
    java.lang.Class<T> modelClass) {
        return null;
    }
}