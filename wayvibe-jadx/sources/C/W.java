package C;

import D0.InterfaceC0190p;
import D0.InterfaceC0191q;

/* JADX INFO: loaded from: classes.dex */
public final class W extends V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public U f959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f960b;

    @Override // C.V, F0.InterfaceC0406y
    public final int maxIntrinsicWidth(InterfaceC0191q interfaceC0191q, InterfaceC0190p interfaceC0190p, int i10) {
        return this.f959a == U.Min ? interfaceC0190p.x(i10) : interfaceC0190p.A(i10);
    }

    @Override // C.V, F0.InterfaceC0406y
    public final int minIntrinsicWidth(InterfaceC0191q interfaceC0191q, InterfaceC0190p interfaceC0190p, int i10) {
        return this.f959a == U.Min ? interfaceC0190p.x(i10) : interfaceC0190p.A(i10);
    }

    @Override // C.V
    public final long o0(D0.L l10, long j10) {
        int iX = this.f959a == U.Min ? l10.x(p028c1.a.g(j10)) : l10.A(p028c1.a.g(j10));
        if (iX < 0) {
            iX = 0;
        }
        if (iX >= 0) {
            return D7.W.t(iX, iX, 0, com.google.android.gms.common.api.f.API_PRIORITY_OTHER);
        }
        S5.d.Q("width(" + iX + ") must be >= 0");
        throw null;
    }

    @Override // C.V
    public final boolean p0() {
        return this.f960b;
    }
}
