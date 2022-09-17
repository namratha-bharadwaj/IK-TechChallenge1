package com.tps.challenge.dagger;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/tps/challenge/dagger/AppModule;", "", "application", "Lcom/tps/challenge/TCApplication;", "(Lcom/tps/challenge/TCApplication;)V", "getApplication", "Landroid/app/Application;", "app_debug"})
@dagger.Module()
public final class AppModule {
    private final com.tps.challenge.TCApplication application = null;
    
    public AppModule(@org.jetbrains.annotations.NotNull()
    com.tps.challenge.TCApplication application) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final android.app.Application getApplication() {
        return null;
    }
}