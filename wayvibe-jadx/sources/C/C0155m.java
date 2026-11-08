package C;

import D0.InterfaceC0190p;
import D0.InterfaceC0191q;
import F0.InterfaceC0406y;

/* JADX INFO: renamed from: C.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0155m extends p067g0.q implements InterfaceC0406y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f1035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f1036b;

    @Override // F0.InterfaceC0406y
    public final int maxIntrinsicHeight(InterfaceC0191q interfaceC0191q, InterfaceC0190p interfaceC0190p, int i10) {
        return i10 != Integer.MAX_VALUE ? Math.round(i10 / this.f1035a) : interfaceC0190p.d(i10);
    }

    @Override // F0.InterfaceC0406y
    public final int maxIntrinsicWidth(InterfaceC0191q interfaceC0191q, InterfaceC0190p interfaceC0190p, int i10) {
        return i10 != Integer.MAX_VALUE ? Math.round(i10 * this.f1035a) : interfaceC0190p.A(i10);
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00bf  */
    @Override // F0.InterfaceC0406y
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final D0.N mo2measure3p2s80s(D0.O o10, D0.L l10, long j10) {
        long jO0;
        if (this.f1036b) {
            jO0 = o0(j10, true);
            if (p028c1.j.a(jO0, 0L)) {
                jO0 = p0(j10, true);
                if (p028c1.j.a(jO0, 0L)) {
                    jO0 = q0(j10, true);
                    if (p028c1.j.a(jO0, 0L)) {
                        jO0 = r0(j10, true);
                        if (p028c1.j.a(jO0, 0L)) {
                            jO0 = o0(j10, false);
                            if (p028c1.j.a(jO0, 0L)) {
                                jO0 = p0(j10, false);
                                if (p028c1.j.a(jO0, 0L)) {
                                    jO0 = q0(j10, false);
                                    if (p028c1.j.a(jO0, 0L)) {
                                        jO0 = r0(j10, false);
                                        if (p028c1.j.a(jO0, 0L)) {
                                            jO0 = 0;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            jO0 = p0(j10, true);
            if (p028c1.j.a(jO0, 0L)) {
                jO0 = o0(j10, true);
                if (p028c1.j.a(jO0, 0L)) {
                    jO0 = r0(j10, true);
                    if (p028c1.j.a(jO0, 0L)) {
                        jO0 = q0(j10, true);
                        if (p028c1.j.a(jO0, 0L)) {
                            jO0 = p0(j10, false);
                            if (p028c1.j.a(jO0, 0L)) {
                                jO0 = o0(j10, false);
                                if (p028c1.j.a(jO0, 0L)) {
                                    jO0 = r0(j10, false);
                                    if (p028c1.j.a(jO0, 0L)) {
                                        jO0 = q0(j10, false);
                                        if (p028c1.j.a(jO0, 0L)) {
                                            jO0 = 0;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (!p028c1.j.a(jO0, 0L)) {
            int i10 = (int) (jO0 >> 32);
            int i11 = (int) (4294967295L & jO0);
            if (i10 < 0 || i11 < 0) {
                S5.d.Q("width(" + i10 + ") and height(" + i11 + ") must be >= 0");
                throw null;
            }
            j10 = D7.W.t(i10, i10, i11, i11);
        }
        D0.X xE = l10.E(j10);
        return o10.S(xE.f1762a, xE.f1763b, N8.t.f8651a, new C0154l(xE, 0));
    }

    @Override // F0.InterfaceC0406y
    public final int minIntrinsicHeight(InterfaceC0191q interfaceC0191q, InterfaceC0190p interfaceC0190p, int i10) {
        return i10 != Integer.MAX_VALUE ? Math.round(i10 / this.f1035a) : interfaceC0190p.h0(i10);
    }

    @Override // F0.InterfaceC0406y
    public final int minIntrinsicWidth(InterfaceC0191q interfaceC0191q, InterfaceC0190p interfaceC0190p, int i10) {
        return i10 != Integer.MAX_VALUE ? Math.round(i10 * this.f1035a) : interfaceC0190p.x(i10);
    }

    public final long o0(long j10, boolean z10) {
        int iRound;
        int iG = p028c1.a.g(j10);
        if (iG == Integer.MAX_VALUE || (iRound = Math.round(iG * this.f1035a)) <= 0) {
            return 0L;
        }
        long jF = p025b9.a.f(iRound, iG);
        if (!z10 || D7.W.M(j10, jF)) {
            return jF;
        }
        return 0L;
    }

    public final long p0(long j10, boolean z10) {
        int iRound;
        int iH = p028c1.a.h(j10);
        if (iH == Integer.MAX_VALUE || (iRound = Math.round(iH / this.f1035a)) <= 0) {
            return 0L;
        }
        long jF = p025b9.a.f(iH, iRound);
        if (!z10 || D7.W.M(j10, jF)) {
            return jF;
        }
        return 0L;
    }

    public final long q0(long j10, boolean z10) {
        int i10 = p028c1.a.i(j10);
        int iRound = Math.round(i10 * this.f1035a);
        if (iRound <= 0) {
            return 0L;
        }
        long jF = p025b9.a.f(iRound, i10);
        if (!z10 || D7.W.M(j10, jF)) {
            return jF;
        }
        return 0L;
    }

    public final long r0(long j10, boolean z10) {
        int iJ = p028c1.a.j(j10);
        int iRound = Math.round(iJ / this.f1035a);
        if (iRound <= 0) {
            return 0L;
        }
        long jF = p025b9.a.f(iJ, iRound);
        if (!z10 || D7.W.M(j10, jF)) {
            return jF;
        }
        return 0L;
    }
}
