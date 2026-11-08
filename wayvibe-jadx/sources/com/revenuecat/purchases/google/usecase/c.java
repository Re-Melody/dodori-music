package com.revenuecat.purchases.google.usecase;

import Z4.C0976i;
import Z4.InterfaceC0984q;
import Z4.w;
import java.util.Date;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements InterfaceC0984q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f18873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ QueryProductDetailsUseCase f18874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Set f18875c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f18876d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Date f18877e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0984q f18878f;

    public /* synthetic */ c(AtomicBoolean atomicBoolean, QueryProductDetailsUseCase queryProductDetailsUseCase, Set set, String str, Date date, InterfaceC0984q interfaceC0984q) {
        this.f18873a = atomicBoolean;
        this.f18874b = queryProductDetailsUseCase;
        this.f18875c = set;
        this.f18876d = str;
        this.f18877e = date;
        this.f18878f = interfaceC0984q;
    }

    @Override // Z4.InterfaceC0984q
    public final void b(C0976i c0976i, w wVar) {
        QueryProductDetailsUseCase.queryProductDetailsAsyncEnsuringOneResponse$lambda$14(this.f18873a, this.f18874b, this.f18875c, this.f18876d, this.f18877e, this.f18878f, c0976i, wVar);
    }
}
