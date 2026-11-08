package org.maplibre.android.style.sources;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes2.dex */
public final class RasterDemSource extends Source {
    @Keep
    public RasterDemSource(long j10) {
        super(j10);
    }

    @Keep
    private final native String nativeGetUrl();

    @Keep
    public final native void finalize();

    @Keep
    public final native void initialize(String str, Object obj, int i10);
}
