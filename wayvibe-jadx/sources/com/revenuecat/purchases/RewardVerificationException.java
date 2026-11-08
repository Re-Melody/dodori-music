package com.revenuecat.purchases;

import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class RewardVerificationException extends PurchasesException {
    private final boolean isServerError;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardVerificationException(PurchasesError error, boolean z10) {
        super(error);
        m.f(error, "error");
        this.isServerError = z10;
    }

    public final boolean isServerError() {
        return this.isServerError;
    }
}
