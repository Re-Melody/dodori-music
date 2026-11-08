package com.revenuecat.purchases.ui.revenuecatui.components.image;

import com.revenuecat.purchases.paywalls.components.properties.FitMode;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
final class PreviewParameters {
    private final FitMode fitMode;
    private final int imageHeight;
    private final int imageWidth;
    private final Size viewSize;

    public /* synthetic */ PreviewParameters(int i10, int i11, Size size, FitMode fitMode, f fVar) {
        this(i10, i11, size, fitMode);
    }

    public final FitMode getFitMode() {
        return this.fitMode;
    }

    /* JADX INFO: renamed from: getImageHeight-pVg5ArA, reason: not valid java name */
    public final int m367getImageHeightpVg5ArA() {
        return this.imageHeight;
    }

    /* JADX INFO: renamed from: getImageWidth-pVg5ArA, reason: not valid java name */
    public final int m368getImageWidthpVg5ArA() {
        return this.imageWidth;
    }

    public final Size getViewSize() {
        return this.viewSize;
    }

    private PreviewParameters(int i10, int i11, Size viewSize, FitMode fitMode) {
        m.f(viewSize, "viewSize");
        m.f(fitMode, "fitMode");
        this.imageWidth = i10;
        this.imageHeight = i11;
        this.viewSize = viewSize;
        this.fitMode = fitMode;
    }
}
