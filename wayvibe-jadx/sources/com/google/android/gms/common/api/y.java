package com.google.android.gms.common.api;

/* JADX INFO: loaded from: classes.dex */
public final class y extends UnsupportedOperationException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final H5.d f17976a;

    public y(H5.d dVar) {
        this.f17976a = dVar;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "Missing ".concat(String.valueOf(this.f17976a));
    }
}
