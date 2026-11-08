package org.maplibre.android.maps.renderer;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes2.dex */
@Keep
class MapRendererRunnable implements Runnable {
    private final long nativePtr;

    public MapRendererRunnable(long j10) {
        this.nativePtr = j10;
    }

    private native void nativeInitialize();

    public native void finalize();

    @Override // java.lang.Runnable
    public native void run();
}
