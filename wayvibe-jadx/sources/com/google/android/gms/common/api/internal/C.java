package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class C implements com.google.android.gms.common.api.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BasePendingResult f17846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ D f17847b;

    public C(D d10, BasePendingResult basePendingResult) {
        this.f17847b = d10;
        this.f17846a = basePendingResult;
    }

    @Override // com.google.android.gms.common.api.r
    public final void a(Status status) {
        ((Map) this.f17847b.f17848a).remove(this.f17846a);
    }
}
