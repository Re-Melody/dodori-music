package com.google.protobuf;

import java.util.List;

/* JADX INFO: renamed from: com.google.protobuf.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1237d0 extends AbstractC1239e0 {
    @Override // com.google.protobuf.AbstractC1239e0
    public final void a(long j10, Object obj) {
        AbstractC1232b abstractC1232b = (AbstractC1232b) ((U) Y0.f18720c.k(j10, obj));
        if (abstractC1232b.f18728a) {
            abstractC1232b.f18728a = false;
        }
    }

    @Override // com.google.protobuf.AbstractC1239e0
    public final void b(Object obj, long j10, Object obj2) {
        X0 x10 = Y0.f18720c;
        U uE = (U) x10.k(j10, obj);
        U u10 = (U) x10.k(j10, obj2);
        int size = uE.size();
        int size2 = u10.size();
        if (size > 0 && size2 > 0) {
            if (!((AbstractC1232b) uE).f18728a) {
                uE = uE.e(size2 + size);
            }
            uE.addAll(u10);
        }
        if (size > 0) {
            u10 = uE;
        }
        Y0.p(obj, j10, u10);
    }

    @Override // com.google.protobuf.AbstractC1239e0
    public final List c(long j10, Object obj) {
        U u10 = (U) Y0.f18720c.k(j10, obj);
        if (((AbstractC1232b) u10).f18728a) {
            return u10;
        }
        int size = u10.size();
        U uE = u10.e(size == 0 ? 10 : size * 2);
        Y0.p(obj, j10, uE);
        return uE;
    }
}
