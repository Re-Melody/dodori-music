package org.maplibre.android.snapshotter;

import android.graphics.Bitmap;
import android.graphics.PointF;
import androidx.annotation.Keep;
import org.maplibre.android.geometry.LatLng;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public final class MapSnapshot {
    private final String[] attributions;
    private final Bitmap bitmap;
    private final boolean isShowAttribution;
    private final boolean isShowLogo;
    private final long nativePtr;

    private MapSnapshot(long j10, Bitmap bitmap, String[] strArr, boolean z10, boolean z11) {
        this.nativePtr = j10;
        this.bitmap = bitmap;
        this.attributions = strArr;
        this.isShowLogo = z10;
        this.isShowAttribution = z11;
    }

    @Keep
    private final native void initialize();

    @Keep
    public final native void finalize();

    public final String[] getAttributions() {
        return this.attributions;
    }

    public final Bitmap getBitmap() {
        return this.bitmap;
    }

    public final long getNativePtr() {
        return this.nativePtr;
    }

    public final boolean isShowAttribution() {
        return this.isShowAttribution;
    }

    public final boolean isShowLogo() {
        return this.isShowLogo;
    }

    @Keep
    public final native LatLng latLngForPixel(PointF pointF);

    @Keep
    public final native PointF pixelForLatLng(LatLng latLng);
}
