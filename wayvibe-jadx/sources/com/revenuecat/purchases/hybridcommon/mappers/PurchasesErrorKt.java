package com.revenuecat.purchases.hybridcommon.mappers;

import M8.l;
import N8.t;
import N8.y;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.hybridcommon.ErrorContainer;
import java.util.Map;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final class PurchasesErrorKt {
    public static final ErrorContainer map(PurchasesError purchasesError, Map<String, ? extends Object> extra) {
        m.f(purchasesError, "<this>");
        m.f(extra, "extra");
        int code = purchasesError.getCode().getCode();
        String message = purchasesError.getMessage();
        l lVar = new l("code", Integer.valueOf(purchasesError.getCode().getCode()));
        l lVar2 = new l("message", purchasesError.getMessage());
        l lVar3 = new l("readableErrorCode", purchasesError.getCode().name());
        l lVar4 = new l("readable_error_code", purchasesError.getCode().name());
        String underlyingErrorMessage = purchasesError.getUnderlyingErrorMessage();
        if (underlyingErrorMessage == null) {
            underlyingErrorMessage = "";
        }
        return new ErrorContainer(code, message, y.k0(y.g0(lVar, lVar2, lVar3, lVar4, new l("underlyingErrorMessage", underlyingErrorMessage)), extra));
    }

    public static /* synthetic */ ErrorContainer map$default(PurchasesError purchasesError, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            map = t.f8651a;
        }
        return map(purchasesError, map);
    }
}
