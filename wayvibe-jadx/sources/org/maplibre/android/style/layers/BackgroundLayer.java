package org.maplibre.android.style.layers;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes2.dex */
public class BackgroundLayer extends Layer {
    @Keep
    public BackgroundLayer(long j10) {
        super(j10);
    }

    @Keep
    private native Object nativeGetBackgroundColor();

    @Keep
    private native TransitionOptions nativeGetBackgroundColorTransition();

    @Keep
    private native Object nativeGetBackgroundOpacity();

    @Keep
    private native TransitionOptions nativeGetBackgroundOpacityTransition();

    @Keep
    private native Object nativeGetBackgroundPattern();

    @Keep
    private native TransitionOptions nativeGetBackgroundPatternTransition();

    @Keep
    private native void nativeSetBackgroundColorTransition(long j10, long j11);

    @Keep
    private native void nativeSetBackgroundOpacityTransition(long j10, long j11);

    @Keep
    private native void nativeSetBackgroundPatternTransition(long j10, long j11);

    @Override // org.maplibre.android.style.layers.Layer
    @Keep
    public native void finalize();

    @Keep
    public native void initialize(String str);
}
