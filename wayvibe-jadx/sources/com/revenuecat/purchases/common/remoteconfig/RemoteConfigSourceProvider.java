package com.revenuecat.purchases.common.remoteconfig;

/* JADX INFO: loaded from: classes2.dex */
public interface RemoteConfigSourceProvider {

    public static final class DefaultImpls {
        @Deprecated
        public static void clear(RemoteConfigSourceProvider remoteConfigSourceProvider) {
            RemoteConfigSourceProvider.super.clear();
        }

        @Deprecated
        public static RemoteConfigSourceHandle currentAPISource(RemoteConfigSourceProvider remoteConfigSourceProvider) {
            return RemoteConfigSourceProvider.super.currentAPISource();
        }
    }

    default void clear() {
    }

    default RemoteConfigSourceHandle currentAPISource() {
        return getCurrent(RemoteConfigSourceHandle.Purpose.API);
    }

    RemoteConfigSourceHandle getCurrent(RemoteConfigSourceHandle.Purpose purpose);

    void reportUnhealthy(RemoteConfigSourceHandle remoteConfigSourceHandle);

    void restart(RemoteConfigSourceHandle.Purpose purpose);

    boolean restartIfExhausted(RemoteConfigSourceHandle.Purpose purpose);
}
