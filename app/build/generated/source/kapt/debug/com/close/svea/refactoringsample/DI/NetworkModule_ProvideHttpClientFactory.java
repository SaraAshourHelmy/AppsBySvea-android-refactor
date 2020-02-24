// Generated by Dagger (https://google.github.io/dagger).
package com.close.svea.refactoringsample.DI;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import okhttp3.Cache;
import okhttp3.OkHttpClient;

public final class NetworkModule_ProvideHttpClientFactory implements Factory<OkHttpClient> {
  private final NetworkModule module;

  private final Provider<Cache> cacheProvider;

  public NetworkModule_ProvideHttpClientFactory(
      NetworkModule module, Provider<Cache> cacheProvider) {
    this.module = module;
    this.cacheProvider = cacheProvider;
  }

  @Override
  public OkHttpClient get() {
    return provideInstance(module, cacheProvider);
  }

  public static OkHttpClient provideInstance(NetworkModule module, Provider<Cache> cacheProvider) {
    return proxyProvideHttpClient(module, cacheProvider.get());
  }

  public static NetworkModule_ProvideHttpClientFactory create(
      NetworkModule module, Provider<Cache> cacheProvider) {
    return new NetworkModule_ProvideHttpClientFactory(module, cacheProvider);
  }

  public static OkHttpClient proxyProvideHttpClient(NetworkModule instance, Cache cache) {
    return Preconditions.checkNotNull(
        instance.provideHttpClient(cache),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
