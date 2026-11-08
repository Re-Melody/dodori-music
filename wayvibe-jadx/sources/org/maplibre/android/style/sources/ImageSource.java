package org.maplibre.android.style.sources;

import android.graphics.Bitmap;
import androidx.annotation.Keep;
import kotlin.jvm.internal.m;
import org.maplibre.android.geometry.LatLngQuad;

/* JADX INFO: loaded from: classes2.dex */
public final class ImageSource extends Source {
    @Keep
    public ImageSource(long j10) {
        super(j10);
    }

    public final void a(LatLngQuad latLngQuad) {
        checkThread();
        nativeSetCoordinates(latLngQuad);
    }

    @Keep
    public final native void finalize();

    @Keep
    public final native void initialize(String str, LatLngQuad latLngQuad);

    @Keep
    public final native String nativeGetUrl();

    @Keep
    public final native void nativeSetCoordinates(LatLngQuad latLngQuad);

    @Keep
    public final native void nativeSetImage(Bitmap bitmap);

    @Keep
    public final native void nativeSetUrl(String str);

    public ImageSource(String str, LatLngQuad latLngQuad, Bitmap bitmap) {
        m.f(bitmap, "bitmap");
        initialize(str, latLngQuad);
        checkThread();
        nativeSetImage(bitmap);
    }
}
