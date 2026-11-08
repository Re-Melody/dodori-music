package com.revenuecat.purchases.ui.revenuecatui.components.ktx;

import B8.V;
import T0.I;
import com.revenuecat.purchases.paywalls.components.properties.FontWeight;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class FontKt {

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FontWeight.values().length];
            try {
                iArr[FontWeight.EXTRA_LIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FontWeight.THIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FontWeight.LIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FontWeight.REGULAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[FontWeight.MEDIUM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[FontWeight.SEMI_BOLD.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[FontWeight.BOLD.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[FontWeight.EXTRA_BOLD.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[FontWeight.BLACK.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final I toFontWeight(FontWeight fontWeight) {
        m.f(fontWeight, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[fontWeight.ordinal()]) {
            case 1:
                I i10 = I.f11451b;
                return I.f11455f;
            case 2:
                I i11 = I.f11451b;
                return I.f11454e;
            case 3:
                I i12 = I.f11451b;
                return I.f11456g;
            case 4:
                I i13 = I.f11451b;
                return I.f11457h;
            case 5:
                I i14 = I.f11451b;
                return I.f11458i;
            case 6:
                I i15 = I.f11451b;
                return I.f11459j;
            case 7:
                I i16 = I.f11451b;
                return I.k;
            case 8:
                I i17 = I.f11451b;
                return I.f11460l;
            case 9:
                I i18 = I.f11451b;
                return I.f11461m;
            default:
                throw new V();
        }
    }
}
