package com.google.android.gms.common.api;

import com.google.android.gms.common.api.internal.BasePendingResult;

/* JADX INFO: loaded from: classes.dex */
public final class A extends BasePendingResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Status f17822a;

    public A(Status status) {
        super(null);
        this.f17822a = status;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final u createFailedResult(Status status) {
        return this.f17822a;
    }
}
