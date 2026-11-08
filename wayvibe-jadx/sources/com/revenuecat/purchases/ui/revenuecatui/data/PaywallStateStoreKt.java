package com.revenuecat.purchases.ui.revenuecatui.data;

import B8.V;
import com.revenuecat.purchases.paywalls.components.common.StateDeclaration;
import p270z9.C;
import p270z9.l;

/* JADX INFO: loaded from: classes2.dex */
public final class PaywallStateStoreKt {

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StateDeclaration.ValueType.values().length];
            try {
                iArr[StateDeclaration.ValueType.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StateDeclaration.ValueType.STRING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StateDeclaration.ValueType.INTEGER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[StateDeclaration.ValueType.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[StateDeclaration.ValueType.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean matchesDeclaredType(C c3, StateDeclaration.ValueType valueType) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[valueType.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                return c3.c();
            }
            if (i10 != 3) {
                if (i10 != 4) {
                    if (i10 == 5) {
                        return false;
                    }
                    throw new V();
                }
                if (c3.c() || l.f(c3) == null) {
                    return false;
                }
            } else {
                if (c3.c()) {
                    return false;
                }
                if (l.k(c3) == null) {
                    Double dF = l.f(c3);
                    Double dValueOf = dF != null ? Double.valueOf(dF.doubleValue() % 1.0d) : null;
                    if (dValueOf == null || dValueOf.doubleValue() != 0.0d) {
                        return false;
                    }
                }
            }
        } else if (c3.c() || l.d(c3) == null) {
            return false;
        }
        return true;
    }
}
