package org.maplibre.android.style.layers;

import androidx.annotation.Keep;
import com.google.gson.JsonElement;
import za.a;
import za.g;

/* JADX INFO: loaded from: classes2.dex */
public class FillLayer extends Layer {
    @Keep
    public FillLayer(long j10) {
        super(j10);
    }

    @Keep
    private native Object nativeGetFillAntialias();

    @Keep
    private native Object nativeGetFillColor();

    @Keep
    private native TransitionOptions nativeGetFillColorTransition();

    @Keep
    private native Object nativeGetFillOpacity();

    @Keep
    private native TransitionOptions nativeGetFillOpacityTransition();

    @Keep
    private native Object nativeGetFillOutlineColor();

    @Keep
    private native TransitionOptions nativeGetFillOutlineColorTransition();

    @Keep
    private native Object nativeGetFillPattern();

    @Keep
    private native TransitionOptions nativeGetFillPatternTransition();

    @Keep
    private native Object nativeGetFillSortKey();

    @Keep
    private native Object nativeGetFillTranslate();

    @Keep
    private native Object nativeGetFillTranslateAnchor();

    @Keep
    private native TransitionOptions nativeGetFillTranslateTransition();

    @Keep
    private native void nativeSetFillColorTransition(long j10, long j11);

    @Keep
    private native void nativeSetFillOpacityTransition(long j10, long j11);

    @Keep
    private native void nativeSetFillOutlineColorTransition(long j10, long j11);

    @Keep
    private native void nativeSetFillPatternTransition(long j10, long j11);

    @Keep
    private native void nativeSetFillTranslateTransition(long j10, long j11);

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

    @Keep
    public native void initialize(String str, String str2);
}
