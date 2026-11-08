package org.maplibre.android.style.layers;

import androidx.annotation.Keep;
import com.google.gson.JsonElement;
import za.a;
import za.g;

/* JADX INFO: loaded from: classes2.dex */
public class HeatmapLayer extends Layer {
    @Keep
    public HeatmapLayer(long j10) {
        super(j10);
    }

    @Keep
    private native Object nativeGetHeatmapColor();

    @Keep
    private native Object nativeGetHeatmapIntensity();

    @Keep
    private native TransitionOptions nativeGetHeatmapIntensityTransition();

    @Keep
    private native Object nativeGetHeatmapOpacity();

    @Keep
    private native TransitionOptions nativeGetHeatmapOpacityTransition();

    @Keep
    private native Object nativeGetHeatmapRadius();

    @Keep
    private native TransitionOptions nativeGetHeatmapRadiusTransition();

    @Keep
    private native Object nativeGetHeatmapWeight();

    @Keep
    private native void nativeSetHeatmapIntensityTransition(long j10, long j11);

    @Keep
    private native void nativeSetHeatmapOpacityTransition(long j10, long j11);

    @Keep
    private native void nativeSetHeatmapRadiusTransition(long j10, long j11);

    @Override // org.maplibre.android.style.layers.Layer
    @Keep
    public native void finalize();

    public final g g() {
        Layer.a();
        JsonElement jsonElementNativeGetFilter = nativeGetFilter();
        if (jsonElementNativeGetFilter != null) {
            return a.b(jsonElementNativeGetFilter);
        }
        return null;
    }

    public final void h(g gVar) {
        Layer.a();
        nativeSetFilter(gVar.g());
    }

    @Keep
    public native void initialize(String str, String str2);
}
