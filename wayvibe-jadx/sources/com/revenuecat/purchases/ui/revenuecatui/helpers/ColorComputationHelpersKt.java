package com.revenuecat.purchases.ui.revenuecatui.helpers;

import M8.r;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.m;
import p143n0.C2096x;

/* JADX INFO: loaded from: classes2.dex */
public final class ColorComputationHelpersKt {
    public static final double colorDistance(r color1, r color2) {
        m.f(color1, "color1");
        m.f(color2, "color2");
        double dDoubleValue = ((Number) color1.f8423a).doubleValue();
        double dDoubleValue2 = ((Number) color1.f8424b).doubleValue();
        double dDoubleValue3 = ((Number) color1.f8425c).doubleValue();
        double dDoubleValue4 = ((Number) color2.f8423a).doubleValue();
        double dDoubleValue5 = ((Number) color2.f8424b).doubleValue();
        double d10 = dDoubleValue - dDoubleValue4;
        double d11 = 2;
        return Math.sqrt(Math.pow(dDoubleValue3 - ((Number) color2.f8425c).doubleValue(), d11) + Math.pow(dDoubleValue2 - dDoubleValue5, d11) + Math.pow(d10, d11));
    }

    /* JADX INFO: renamed from: contrastRatio--OWjLjI, reason: not valid java name */
    public static final double m830contrastRatioOWjLjI(long j10, long j11) {
        double dM831relativeLuminance8_81llA = m831relativeLuminance8_81llA(j10);
        double dM831relativeLuminance8_81llA2 = m831relativeLuminance8_81llA(j11);
        return (Math.max(dM831relativeLuminance8_81llA, dM831relativeLuminance8_81llA2) + 0.05d) / (Math.min(dM831relativeLuminance8_81llA, dM831relativeLuminance8_81llA2) + 0.05d);
    }

    /* JADX INFO: renamed from: relativeLuminance-8_81llA, reason: not valid java name */
    public static final double m831relativeLuminance8_81llA(long j10) {
        return (relativeLuminance_8_81llA$adjust(C2096x.e(j10)) * 0.0722d) + (relativeLuminance_8_81llA$adjust(C2096x.g(j10)) * 0.7152d) + (relativeLuminance_8_81llA$adjust(C2096x.h(j10)) * 0.2126d);
    }

    private static final double relativeLuminance_8_81llA$adjust(float f10) {
        return f10 <= 0.03928f ? ((double) f10) / 12.92d : Math.pow((((double) f10) + 0.055d) / 1.055d, 2.4d);
    }

    /* JADX INFO: renamed from: selectColorWithBestContrast-4WTKRHQ, reason: not valid java name */
    public static final C2096x m832selectColorWithBestContrast4WTKRHQ(List<C2096x> from, long j10) {
        Object obj;
        m.f(from, "from");
        Iterator<T> it = from.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                double dM830contrastRatioOWjLjI = m830contrastRatioOWjLjI(((C2096x) next).f22804a, j10);
                do {
                    Object next2 = it.next();
                    double dM830contrastRatioOWjLjI2 = m830contrastRatioOWjLjI(((C2096x) next2).f22804a, j10);
                    if (Double.compare(dM830contrastRatioOWjLjI, dM830contrastRatioOWjLjI2) < 0) {
                        next = next2;
                        dM830contrastRatioOWjLjI = dM830contrastRatioOWjLjI2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        return (C2096x) obj;
    }
}
