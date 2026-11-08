package com.revenuecat.purchases.google;

import Z4.C0976i;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.strings.BillingStrings;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class BillingWrapper$onPurchasesUpdated$$inlined$log$1 extends n implements Z8.a {
    final /* synthetic */ C0976i $billingResult$inlined;
    final /* synthetic */ LogIntent $intent;
    final /* synthetic */ List $notNullPurchasesList$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillingWrapper$onPurchasesUpdated$$inlined$log$1(LogIntent logIntent, C0976i c0976i, List list) {
        super(0);
        this.$intent = logIntent;
        this.$billingResult$inlined = c0976i;
        this.$notNullPurchasesList$inlined = list;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x005d  */
    @Override // Z8.a
    public final String invoke() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(N8.n.H0(this.$intent.getEmojiList(), "", null, null, null, 62));
        sb.append(' ');
        String str2 = String.format(BillingStrings.BILLING_WRAPPER_PURCHASES_ERROR, Arrays.copyOf(new Object[]{BillingResultExtensionsBillingIndependentKt.toHumanReadableDescription(this.$billingResult$inlined)}, 1));
        List list = this.$notNullPurchasesList$inlined;
        if (list.isEmpty()) {
            list = null;
        }
        List list2 = list;
        if (list2 != null) {
            str = " Purchases:" + N8.n.H0(list2, ", ", null, null, BillingWrapper$onPurchasesUpdated$2$2$1.INSTANCE, 30);
            if (str == null) {
                str = " No purchases received";
            }
        } else {
            str = " No purchases received";
        }
        sb.append(str2.concat(str));
        return sb.toString();
    }
}
