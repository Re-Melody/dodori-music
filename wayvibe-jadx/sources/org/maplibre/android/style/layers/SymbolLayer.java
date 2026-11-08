package org.maplibre.android.style.layers;

import Aa.c;
import androidx.annotation.Keep;
import com.google.gson.JsonElement;
import za.a;
import za.g;

/* JADX INFO: loaded from: classes2.dex */
public class SymbolLayer extends Layer {
    @Keep
    public SymbolLayer(long j10) {
        super(j10);
    }

    @Keep
    private native Object nativeGetIconAllowOverlap();

    @Keep
    private native Object nativeGetIconAnchor();

    @Keep
    private native Object nativeGetIconColor();

    @Keep
    private native TransitionOptions nativeGetIconColorTransition();

    @Keep
    private native Object nativeGetIconHaloBlur();

    @Keep
    private native TransitionOptions nativeGetIconHaloBlurTransition();

    @Keep
    private native Object nativeGetIconHaloColor();

    @Keep
    private native TransitionOptions nativeGetIconHaloColorTransition();

    @Keep
    private native Object nativeGetIconHaloWidth();

    @Keep
    private native TransitionOptions nativeGetIconHaloWidthTransition();

    @Keep
    private native Object nativeGetIconIgnorePlacement();

    @Keep
    private native Object nativeGetIconImage();

    @Keep
    private native Object nativeGetIconKeepUpright();

    @Keep
    private native Object nativeGetIconOffset();

    @Keep
    private native Object nativeGetIconOpacity();

    @Keep
    private native TransitionOptions nativeGetIconOpacityTransition();

    @Keep
    private native Object nativeGetIconOptional();

    @Keep
    private native Object nativeGetIconPadding();

    @Keep
    private native Object nativeGetIconPitchAlignment();

    @Keep
    private native Object nativeGetIconRotate();

    @Keep
    private native Object nativeGetIconRotationAlignment();

    @Keep
    private native Object nativeGetIconSize();

    @Keep
    private native Object nativeGetIconTextFit();

    @Keep
    private native Object nativeGetIconTextFitPadding();

    @Keep
    private native Object nativeGetIconTranslate();

    @Keep
    private native Object nativeGetIconTranslateAnchor();

    @Keep
    private native TransitionOptions nativeGetIconTranslateTransition();

    @Keep
    private native Object nativeGetSymbolAvoidEdges();

    @Keep
    private native Object nativeGetSymbolPlacement();

    @Keep
    private native Object nativeGetSymbolScreenSpace();

    @Keep
    private native Object nativeGetSymbolSortKey();

    @Keep
    private native Object nativeGetSymbolSpacing();

    @Keep
    private native Object nativeGetSymbolZOrder();

    @Keep
    private native Object nativeGetTextAllowOverlap();

    @Keep
    private native Object nativeGetTextAnchor();

    @Keep
    private native Object nativeGetTextColor();

    @Keep
    private native TransitionOptions nativeGetTextColorTransition();

    @Keep
    private native Object nativeGetTextField();

    @Keep
    private native Object nativeGetTextFont();

    @Keep
    private native Object nativeGetTextHaloBlur();

    @Keep
    private native TransitionOptions nativeGetTextHaloBlurTransition();

    @Keep
    private native Object nativeGetTextHaloColor();

    @Keep
    private native TransitionOptions nativeGetTextHaloColorTransition();

    @Keep
    private native Object nativeGetTextHaloWidth();

    @Keep
    private native TransitionOptions nativeGetTextHaloWidthTransition();

    @Keep
    private native Object nativeGetTextIgnorePlacement();

    @Keep
    private native Object nativeGetTextJustify();

    @Keep
    private native Object nativeGetTextKeepUpright();

    @Keep
    private native Object nativeGetTextLetterSpacing();

    @Keep
    private native Object nativeGetTextLineHeight();

    @Keep
    private native Object nativeGetTextMaxAngle();

    @Keep
    private native Object nativeGetTextMaxWidth();

    @Keep
    private native Object nativeGetTextOffset();

    @Keep
    private native Object nativeGetTextOpacity();

    @Keep
    private native TransitionOptions nativeGetTextOpacityTransition();

    @Keep
    private native Object nativeGetTextOptional();

    @Keep
    private native Object nativeGetTextPadding();

    @Keep
    private native Object nativeGetTextPitchAlignment();

    @Keep
    private native Object nativeGetTextRadialOffset();

    @Keep
    private native Object nativeGetTextRotate();

    @Keep
    private native Object nativeGetTextRotationAlignment();

    @Keep
    private native Object nativeGetTextSize();

    @Keep
    private native Object nativeGetTextTransform();

    @Keep
    private native Object nativeGetTextTranslate();

    @Keep
    private native Object nativeGetTextTranslateAnchor();

    @Keep
    private native TransitionOptions nativeGetTextTranslateTransition();

    @Keep
    private native Object nativeGetTextVariableAnchor();

    @Keep
    private native Object nativeGetTextVariableAnchorOffset();

    @Keep
    private native Object nativeGetTextWritingMode();

    @Keep
    private native void nativeSetIconColorTransition(long j10, long j11);

    @Keep
    private native void nativeSetIconHaloBlurTransition(long j10, long j11);

    @Keep
    private native void nativeSetIconHaloColorTransition(long j10, long j11);

    @Keep
    private native void nativeSetIconHaloWidthTransition(long j10, long j11);

    @Keep
    private native void nativeSetIconOpacityTransition(long j10, long j11);

    @Keep
    private native void nativeSetIconTranslateTransition(long j10, long j11);

    @Keep
    private native void nativeSetTextColorTransition(long j10, long j11);

    @Keep
    private native void nativeSetTextHaloBlurTransition(long j10, long j11);

    @Keep
    private native void nativeSetTextHaloColorTransition(long j10, long j11);

    @Keep
    private native void nativeSetTextHaloWidthTransition(long j10, long j11);

    @Keep
    private native void nativeSetTextOpacityTransition(long j10, long j11);

    @Keep
    private native void nativeSetTextTranslateTransition(long j10, long j11);

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

    public final c h() {
        Layer.a();
        return new c("text-field", nativeGetTextField());
    }

    @Keep
    public native void initialize(String str, String str2);

    public SymbolLayer(String str, String str2) {
        initialize(str, str2);
    }
}
