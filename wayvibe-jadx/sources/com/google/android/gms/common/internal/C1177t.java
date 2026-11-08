package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.internal.InterfaceC1151s;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1177t implements InterfaceC1162d, InterfaceC1160b, InterfaceC1161c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static C1177t f18081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1178u f18082c = new C1178u(false, 0, 0, false, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f18083a;

    public static synchronized C1177t b() {
        try {
            if (f18081b == null) {
                f18081b = new C1177t();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f18081b;
    }

    @Override // com.google.android.gms.common.internal.InterfaceC1162d
    public void a(H5.b bVar) {
        boolean z10 = bVar.f6029b == 0;
        AbstractC1164f abstractC1164f = (AbstractC1164f) this.f18083a;
        if (z10) {
            abstractC1164f.getRemoteService(null, abstractC1164f.getScopes());
        } else if (abstractC1164f.zzl() != null) {
            ((InterfaceC1151s) ((C1177t) abstractC1164f.zzl()).f18083a).d0(bVar);
        }
    }
}
