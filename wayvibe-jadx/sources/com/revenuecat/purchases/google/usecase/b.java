package com.revenuecat.purchases.google.usecase;

import Z4.C0972e;
import Z4.C0976i;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f18871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GetBillingConfigUseCase f18872b;

    public /* synthetic */ b(AtomicBoolean atomicBoolean, GetBillingConfigUseCase getBillingConfigUseCase) {
        this.f18871a = atomicBoolean;
        this.f18872b = getBillingConfigUseCase;
    }

    public final void a(C0976i c0976i, C0972e c0972e) {
        GetBillingConfigUseCase.AnonymousClass1.invoke$lambda$1(this.f18871a, this.f18872b, c0976i, c0972e);
    }
}
