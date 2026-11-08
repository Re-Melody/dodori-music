package com.revenuecat.purchases.ui.revenuecatui.components.ktx;

import B8.V;
import com.revenuecat.purchases.paywalls.components.properties.HorizontalAlignment;
import com.revenuecat.purchases.paywalls.components.properties.TwoDimensionalAlignment;
import com.revenuecat.purchases.paywalls.components.properties.VerticalAlignment;
import kotlin.jvm.internal.m;
import p067g0.b;
import p067g0.c;
import p067g0.d;
import p067g0.e;
import p067g0.g;
import p067g0.h;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class AlignmentKt {

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[HorizontalAlignment.values().length];
            try {
                iArr[HorizontalAlignment.LEADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HorizontalAlignment.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HorizontalAlignment.TRAILING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[VerticalAlignment.values().length];
            try {
                iArr2[VerticalAlignment.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[VerticalAlignment.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[VerticalAlignment.BOTTOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[TwoDimensionalAlignment.values().length];
            try {
                iArr3[TwoDimensionalAlignment.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[TwoDimensionalAlignment.LEADING.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[TwoDimensionalAlignment.TRAILING.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[TwoDimensionalAlignment.TOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[TwoDimensionalAlignment.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[TwoDimensionalAlignment.TOP_LEADING.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[TwoDimensionalAlignment.TOP_TRAILING.ordinal()] = 7;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[TwoDimensionalAlignment.BOTTOM_LEADING.ordinal()] = 8;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[TwoDimensionalAlignment.BOTTOM_TRAILING.ordinal()] = 9;
            } catch (NoSuchFieldError unused15) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public static final c toAlignment(HorizontalAlignment horizontalAlignment) {
        m.f(horizontalAlignment, "<this>");
        int i10 = WhenMappings.$EnumSwitchMapping$0[horizontalAlignment.ordinal()];
        if (i10 == 1) {
            return b.f19949m;
        }
        if (i10 == 2) {
            return b.f19950n;
        }
        if (i10 == 3) {
            return b.f19951o;
        }
        throw new V();
    }

    public static final c toHorizontalAlignmentOrNull(TwoDimensionalAlignment twoDimensionalAlignment) {
        m.f(twoDimensionalAlignment, "<this>");
        int i10 = WhenMappings.$EnumSwitchMapping$2[twoDimensionalAlignment.ordinal()];
        g gVar = b.f19949m;
        g gVar2 = b.f19951o;
        switch (i10) {
            case 1:
                return b.f19950n;
            case 2:
                return gVar;
            case 3:
                return gVar2;
            case 4:
            case 5:
                return null;
            case 6:
                return gVar;
            case 7:
                return gVar2;
            case 8:
                return gVar;
            case 9:
                return gVar2;
            default:
                throw new V();
        }
    }

    public static final int toTextAlign(HorizontalAlignment horizontalAlignment) {
        m.f(horizontalAlignment, "<this>");
        int i10 = WhenMappings.$EnumSwitchMapping$0[horizontalAlignment.ordinal()];
        if (i10 == 1) {
            return 5;
        }
        if (i10 == 2) {
            return 3;
        }
        if (i10 == 3) {
            return 6;
        }
        throw new V();
    }

    public static final d toVerticalAlignmentOrNull(TwoDimensionalAlignment twoDimensionalAlignment) {
        m.f(twoDimensionalAlignment, "<this>");
        int i10 = WhenMappings.$EnumSwitchMapping$2[twoDimensionalAlignment.ordinal()];
        h hVar = b.f19947j;
        h hVar2 = b.f19948l;
        switch (i10) {
            case 1:
                return b.k;
            case 2:
            case 3:
                return null;
            case 4:
                return hVar;
            case 5:
                return hVar2;
            case 6:
            case 7:
                return hVar;
            case 8:
            case 9:
                return hVar2;
            default:
                throw new V();
        }
    }

    public static final d toAlignment(VerticalAlignment verticalAlignment) {
        m.f(verticalAlignment, "<this>");
        int i10 = WhenMappings.$EnumSwitchMapping$1[verticalAlignment.ordinal()];
        if (i10 == 1) {
            return b.f19947j;
        }
        if (i10 == 2) {
            return b.k;
        }
        if (i10 == 3) {
            return b.f19948l;
        }
        throw new V();
    }

    public static final e toAlignment(TwoDimensionalAlignment twoDimensionalAlignment) {
        m.f(twoDimensionalAlignment, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$2[twoDimensionalAlignment.ordinal()]) {
            case 1:
                return b.f19942e;
            case 2:
                return b.f19941d;
            case 3:
                return b.f19943f;
            case 4:
                return b.f19939b;
            case 5:
                return b.f19945h;
            case 6:
                return b.f19938a;
            case 7:
                return b.f19940c;
            case 8:
                return b.f19944g;
            case 9:
                return b.f19946i;
            default:
                throw new V();
        }
    }
}
