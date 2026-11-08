package com.revenuecat.purchases.google;

import B2.AbstractC0112b;
import Z4.C0976i;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final class BillingResultExtensionsBillingIndependentKt {
    private static final String getOnPurchasesUpdatedSubResponseCodeName(int i10) {
        if (i10 == 0) {
            return "NO_APPLICABLE_SUB_RESPONSE_CODE";
        }
        if (i10 == 1) {
            return "PAYMENT_DECLINED_DUE_TO_INSUFFICIENT_FUNDS";
        }
        if (i10 == 2) {
            return "USER_INELIGIBLE";
        }
        return "UNKNOWN_SUB_RESPONSE_CODE (" + i10 + ')';
    }

    public static final String toHumanReadableDescription(C0976i c0976i) {
        m.f(c0976i, "<this>");
        StringBuilder sb = new StringBuilder("DebugMessage: ");
        sb.append(c0976i.f13770c);
        sb.append(". ErrorCode: ");
        sb.append(ErrorsKt.getBillingResponseCodeName(c0976i.f13768a));
        sb.append(". SubResponseCode: ");
        return AbstractC0112b.j(sb, getOnPurchasesUpdatedSubResponseCodeName(c0976i.f13769b), com.amazon.a.a.o.c.a.b.f16463a);
    }
}
