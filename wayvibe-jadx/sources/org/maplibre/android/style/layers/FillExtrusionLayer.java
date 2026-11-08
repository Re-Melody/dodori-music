package org.maplibre.android.style.layers;

import androidx.annotation.Keep;
import com.google.gson.JsonElement;
import za.a;
import za.g;

/* JADX INFO: loaded from: classes2.dex */
public class FillExtrusionLayer extends Layer {
    @Keep
    public FillExtrusionLayer(long j10) {
        super(j10);
    }

    @Keep
    private native Object nativeGetFillExtrusionBase();

    @Keep
    private native TransitionOptions nativeGetFillExtrusionBaseTransition();

    @Keep
    private native Object nativeGetFillExtrusionColor();

    @Keep
    private native TransitionOptions nativeGetFillExtrusionColorTransition();

    @Keep
    private native Object nativeGetFillExtrusionHeight();

    @Keep
    private native TransitionOptions nativeGetFillExtrusionHeightTransition();

    @Keep
    private native Object nativeGetFillExtrusionOpacity();

    @Keep
    private native TransitionOptions nativeGetFillExtrusionOpacityTransition();

    @Keep
    private native Object nativeGetFillExtrusionPattern();

    @Keep
    private native TransitionOptions nativeGetFillExtrusionPatternTransition();

    @Keep
    private native Object nativeGetFillExtrusionTranslate();

    @Keep
    private native Object nativeGetFillExtrusionTranslateAnchor();

    @Keep
    private native TransitionOptions nativeGetFillExtrusionTranslateTransition();

    @Keep
    private native Object nativeGetFillExtrusionVerticalGradient();

    @Keep
    private native void nativeSetFillExtrusionBaseTransition(long j10, long j11);

    @Keep
    private native void nativeSetFillExtrusionColorTransition(long j10, long j11);

    @Keep
    private native void nativeSetFillExtrusionHeightTransition(long j10, long j11);

    @Keep
    private native void nativeSetFillExtrusionOpacityTransition(long j10, long j11);

    @Keep
    private native void nativeSetFillExtrusionPatternTransition(long j10, long j11);

    @Keep
    private native void nativeSetFillExtrusionTranslateTransition(long j10, long j11);

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
