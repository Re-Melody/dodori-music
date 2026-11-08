package org.maplibre.android.style.sources;

import androidx.annotation.Keep;
import p046da.a;
import p206t6.b;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Source {
    private static final String TAG = "Mbgl-Source";
    protected boolean detached;

    @Keep
    private long nativePtr;

    static {
        a.a();
    }

    @Keep
    public Source(long j10) {
        checkThread();
        this.nativePtr = j10;
    }

    public void checkThread() {
        b.l(TAG);
    }

    public String getAttribution() {
        checkThread();
        return nativeGetAttribution();
    }

    public String getId() {
        checkThread();
        return nativeGetId();
    }

    public Integer getMaxOverscaleFactorForParentTiles() {
        return nativeGetMaxOverscaleFactorForParentTiles();
    }

    public Long getMinimumTileUpdateInterval() {
        return nativeGetMinimumTileUpdateInterval();
    }

    public long getNativePtr() {
        return this.nativePtr;
    }

    public Integer getPrefetchZoomDelta() {
        return nativeGetPrefetchZoomDelta();
    }

    public Boolean isVolatile() {
        return nativeIsVolatile();
    }

    @Keep
    public native String nativeGetAttribution();

    @Keep
    public native String nativeGetId();

    @Keep
    public native Integer nativeGetMaxOverscaleFactorForParentTiles();

    @Keep
    public native Long nativeGetMinimumTileUpdateInterval();

    @Keep
    public native Integer nativeGetPrefetchZoomDelta();

    @Keep
    public native Boolean nativeIsVolatile();

    @Keep
    public native void nativeSetMaxOverscaleFactorForParentTiles(Integer num);

    @Keep
    public native void nativeSetMinimumTileUpdateInterval(Long l10);

    @Keep
    public native void nativeSetPrefetchZoomDelta(Integer num);

    @Keep
    public native void nativeSetVolatile(Boolean bool);

    public void setDetached() {
        this.detached = true;
    }

    public void setMaxOverscaleFactorForParentTiles(Integer num) {
        nativeSetMaxOverscaleFactorForParentTiles(num);
    }

    public void setMinimumTileUpdateInterval(Long l10) {
        nativeSetMinimumTileUpdateInterval(l10);
    }

    public void setPrefetchZoomDelta(Integer num) {
        nativeSetPrefetchZoomDelta(num);
    }

    public void setVolatile(Boolean bool) {
        nativeSetVolatile(bool);
    }

    public Source() {
        checkThread();
    }
}
