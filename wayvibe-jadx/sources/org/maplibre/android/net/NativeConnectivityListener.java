package org.maplibre.android.net;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes2.dex */
class NativeConnectivityListener implements a {

    @Keep
    private boolean invalidated;

    @Keep
    private long nativePtr;

    static {
        p046da.a.a();
    }

    @Keep
    public NativeConnectivityListener(long j10) {
        this.nativePtr = j10;
    }

    @Keep
    public native void finalize();

    @Keep
    public native void initialize();

    @Keep
    public native void nativeOnConnectivityStateChanged(boolean z10);
}
