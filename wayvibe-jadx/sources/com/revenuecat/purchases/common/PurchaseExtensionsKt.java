package com.revenuecat.purchases.common;

import N8.n;
import android.text.TextUtils;
import com.android.billingclient.api.Purchase;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final class PurchaseExtensionsKt {
    public static final String getFirstProductId(Purchase purchase) {
        m.f(purchase, "<this>");
        Object obj = purchase.a().get(0);
        m.e(obj, "products[0]");
        return (String) obj;
    }

    public static final String toHumanReadableDescription(Purchase purchase) {
        m.f(purchase, "<this>");
        StringBuilder sb = new StringBuilder("productIds: ");
        sb.append(n.H0(purchase.a(), null, "[", "]", null, 57));
        sb.append(", orderId: ");
        String strOptString = purchase.f17013c.optString("orderId");
        if (TextUtils.isEmpty(strOptString)) {
            strOptString = null;
        }
        sb.append(strOptString);
        sb.append(", purchaseToken: ");
        sb.append(purchase.b());
        return sb.toString();
    }
}
