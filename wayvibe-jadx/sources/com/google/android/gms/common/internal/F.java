package com.google.android.gms.common.internal;

/* JADX INFO: loaded from: classes.dex */
public final class F extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final H5.b f17997a;

    public F(H5.b bVar) {
        E.a("ResolvableConnectionException can only be created with a connection result containing a resolution.", (bVar.f6029b == 0 || bVar.f6030c == null) ? false : true);
        this.f17997a = bVar;
    }
}
