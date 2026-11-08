package com.revenuecat.purchases.ui.revenuecatui.components.ktx;

import B8.V;
import D0.C0184j;
import D0.InterfaceC0185k;
import com.revenuecat.purchases.paywalls.components.properties.FitMode;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class FitModeKt {

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FitMode.values().length];
            try {
                iArr[FitMode.FIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FitMode.FILL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final InterfaceC0185k toContentScale(FitMode fitMode) {
        m.f(fitMode, "<this>");
        int i10 = WhenMappings.$EnumSwitchMapping$0[fitMode.ordinal()];
        if (i10 == 1) {
            return C0184j.f1803c;
        }
        if (i10 == 2) {
            return C0184j.f1802b;
        }
        throw new V();
    }
}
