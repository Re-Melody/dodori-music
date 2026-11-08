package com.revenuecat.purchases;

import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public class PurchasesException extends Exception {
    private final PurchasesError error;
    private final String overridenMessage;

    public /* synthetic */ PurchasesException(PurchasesError purchasesError, String str, int i10, f fVar) {
        this(purchasesError, (i10 & 2) != 0 ? null : str);
    }

    public final PurchasesErrorCode getCode() {
        return this.error.getCode();
    }

    public final PurchasesError getError() {
        return this.error;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String str = this.overridenMessage;
        return str == null ? this.error.getMessage() : str;
    }

    public final String getOverridenMessage$purchases_defaultsRelease() {
        return this.overridenMessage;
    }

    public final String getUnderlyingErrorMessage() {
        return this.error.getUnderlyingErrorMessage();
    }

    public PurchasesException(PurchasesError error, String str) {
        m.f(error, "error");
        this.error = error;
        this.overridenMessage = str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PurchasesException(PurchasesError error) {
        this(error, null);
        m.f(error, "error");
    }
}
