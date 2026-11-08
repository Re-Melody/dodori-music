package C;

import D0.InterfaceC0190p;
import D0.InterfaceC0191q;

/* JADX INFO: loaded from: classes.dex */
public final class T extends V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public U f957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f958b;

    @Override // C.V, F0.InterfaceC0406y
    public final int maxIntrinsicHeight(InterfaceC0191q interfaceC0191q, InterfaceC0190p interfaceC0190p, int i10) {
        return this.f957a == U.Min ? interfaceC0190p.h0(i10) : interfaceC0190p.d(i10);
    }

    @Override // C.V, F0.InterfaceC0406y
    public final int minIntrinsicHeight(InterfaceC0191q interfaceC0191q, InterfaceC0190p interfaceC0190p, int i10) {
        return this.f957a == U.Min ? interfaceC0190p.h0(i10) : interfaceC0190p.d(i10);
    }

    @Override // C.V
    public final long o0(D0.L l10, long j10) {
        int iH0 = this.f957a == U.Min ? l10.h0(p028c1.a.h(j10)) : l10.d(p028c1.a.h(j10));
        if (iH0 < 0) {
            iH0 = 0;
        }
        if (iH0 >= 0) {
            return D7.W.t(0, com.google.android.gms.common.api.f.API_PRIORITY_OTHER, iH0, iH0);
        }
        S5.d.Q("height(" + iH0 + ") must be >= 0");
        throw null;
    }

    @Override // C.V
    public final boolean p0() {
        return this.f958b;
    }
}
