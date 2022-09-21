package com.tps.challenge.dagger;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\bJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\t"}, d2 = {"Lcom/tps/challenge/dagger/AppComponent;", "", "inject", "", "app", "Lcom/tps/challenge/TCApplication;", "storeFeedFragment", "Lcom/tps/challenge/features/storefeed/views/StoreFeedFragment;", "Builder", "app_debug"})
@dagger.Component(modules = {com.tps.challenge.dagger.AppModule.class, com.tps.challenge.dagger.NetworkModule.class})
@javax.inject.Singleton()
public abstract interface AppComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.tps.challenge.TCApplication app);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.tps.challenge.features.storefeed.views.StoreFeedFragment storeFeedFragment);
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\u0007"}, d2 = {"Lcom/tps/challenge/dagger/AppComponent$Builder;", "", "appModule", "module", "Lcom/tps/challenge/dagger/AppModule;", "build", "Lcom/tps/challenge/dagger/AppComponent;", "app_debug"})
    @dagger.Component.Builder()
    public static abstract interface Builder {
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.tps.challenge.dagger.AppComponent.Builder appModule(@org.jetbrains.annotations.NotNull()
        com.tps.challenge.dagger.AppModule module);
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.tps.challenge.dagger.AppComponent build();
    }
}