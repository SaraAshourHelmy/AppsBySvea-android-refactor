// Generated by Dagger (https://google.github.io/dagger).
package com.close.svea.refactoringsample.DI;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

public final class ContextModule_ProvideContextFactory implements Factory<Context> {
  private final ContextModule module;

  public ContextModule_ProvideContextFactory(ContextModule module) {
    this.module = module;
  }

  @Override
  public Context get() {
    return provideInstance(module);
  }

  public static Context provideInstance(ContextModule module) {
    return proxyProvideContext(module);
  }

  public static ContextModule_ProvideContextFactory create(ContextModule module) {
    return new ContextModule_ProvideContextFactory(module);
  }

  public static Context proxyProvideContext(ContextModule instance) {
    return Preconditions.checkNotNull(
        instance.provideContext(), "Cannot return null from a non-@Nullable @Provides method");
  }
}