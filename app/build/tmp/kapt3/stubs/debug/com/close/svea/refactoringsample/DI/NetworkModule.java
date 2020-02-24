package com.close.svea.refactoringsample.DI;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0018\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\b2\u0006\u0010\n\u001a\u00020\u0004H\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\bH\u0007\u00a8\u0006\u0011"}, d2 = {"Lcom/close/svea/refactoringsample/DI/NetworkModule;", "", "()V", "provideCache", "Lokhttp3/Cache;", "context", "Landroid/content/Context;", "provideHttpClient", "Lokhttp3/OkHttpClient;", "kotlin.jvm.PlatformType", "cache", "providePlaceService", "Lcom/close/svea/refactoringsample/data/network/PlacesApiService;", "retrofit", "Lretrofit2/Retrofit;", "provideRetrofit", "httpClient", "app_debug"})
@dagger.Module(includes = {com.close.svea.refactoringsample.DI.ContextModule.class})
public final class NetworkModule {
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.close.svea.refactoringsample.data.network.PlacesApiService providePlaceService(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final retrofit2.Retrofit provideRetrofit(@org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient httpClient) {
        return null;
    }
    
    @javax.inject.Singleton()
    @dagger.Provides()
    public final okhttp3.OkHttpClient provideHttpClient(@org.jetbrains.annotations.NotNull()
    okhttp3.Cache cache) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final okhttp3.Cache provideCache(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    public NetworkModule() {
        super();
    }
}