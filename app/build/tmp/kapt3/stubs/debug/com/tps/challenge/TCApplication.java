package com.tps.challenge;

import java.lang.System;

/**
 * The application class - an entry point into our app where we initialize Dagger.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\b"}, d2 = {"Lcom/tps/challenge/TCApplication;", "Landroid/app/Application;", "()V", "initDaggerAppComponent", "Lcom/tps/challenge/dagger/AppComponent;", "onCreate", "", "Companion", "app_debug"})
public final class TCApplication extends android.app.Application {
    @org.jetbrains.annotations.NotNull()
    public static final com.tps.challenge.TCApplication.Companion Companion = null;
    private static com.tps.challenge.dagger.AppComponent appComponent;
    
    public TCApplication() {
        super();
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    private final com.tps.challenge.dagger.AppComponent initDaggerAppComponent() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/tps/challenge/TCApplication$Companion;", "", "()V", "appComponent", "Lcom/tps/challenge/dagger/AppComponent;", "getAppComponent", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.tps.challenge.dagger.AppComponent getAppComponent() {
            return null;
        }
    }
}