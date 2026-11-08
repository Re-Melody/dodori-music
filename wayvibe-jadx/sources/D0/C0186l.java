package D0;

/* JADX INFO: renamed from: D0.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0186l implements L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC0190p f1814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Enum f1815c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Enum f1816d;

    public /* synthetic */ C0186l(InterfaceC0190p interfaceC0190p, Enum r10, Enum r11, int i10) {
        this.f1813a = i10;
        this.f1814b = interfaceC0190p;
        this.f1815c = r10;
        this.f1816d = r11;
    }

    @Override // D0.InterfaceC0190p
    public final int A(int i10) {
        switch (this.f1813a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.f1814b.A(i10);
    }

    @Override // D0.L
    public final X E(long j10) {
        switch (this.f1813a) {
            case 0:
                EnumC0192s enumC0192s = EnumC0192s.Width;
                EnumC0192s enumC0192s2 = (EnumC0192s) this.f1816d;
                r rVar = (r) this.f1815c;
                InterfaceC0190p interfaceC0190p = this.f1814b;
                if (enumC0192s2 == enumC0192s) {
                    return new C0188n(rVar == r.Max ? interfaceC0190p.A(p028c1.a.g(j10)) : interfaceC0190p.x(p028c1.a.g(j10)), p028c1.a.c(j10) ? p028c1.a.g(j10) : 32767, 0);
                }
                return new C0188n(p028c1.a.d(j10) ? p028c1.a.h(j10) : 32767, rVar == r.Max ? interfaceC0190p.d(p028c1.a.h(j10)) : interfaceC0190p.h0(p028c1.a.h(j10)), 0);
            case 1:
                Q q5 = Q.Width;
                Q q9 = (Q) this.f1816d;
                P p10 = (P) this.f1815c;
                InterfaceC0190p interfaceC0190p2 = this.f1814b;
                if (q9 == q5) {
                    return new C0188n(p10 == P.Max ? interfaceC0190p2.A(p028c1.a.g(j10)) : interfaceC0190p2.x(p028c1.a.g(j10)), p028c1.a.c(j10) ? p028c1.a.g(j10) : 32767, 1);
                }
                return new C0188n(p028c1.a.d(j10) ? p028c1.a.h(j10) : 32767, p10 == P.Max ? interfaceC0190p2.d(p028c1.a.h(j10)) : interfaceC0190p2.h0(p028c1.a.h(j10)), 1);
            default:
                F0.k0 k0Var = F0.k0.Width;
                F0.k0 k0Var2 = (F0.k0) this.f1816d;
                F0.j0 j0Var = (F0.j0) this.f1815c;
                InterfaceC0190p interfaceC0190p3 = this.f1814b;
                if (k0Var2 == k0Var) {
                    return new C0188n(j0Var == F0.j0.Max ? interfaceC0190p3.A(p028c1.a.g(j10)) : interfaceC0190p3.x(p028c1.a.g(j10)), p028c1.a.c(j10) ? p028c1.a.g(j10) : 32767, 2);
                }
                return new C0188n(p028c1.a.d(j10) ? p028c1.a.h(j10) : 32767, j0Var == F0.j0.Max ? interfaceC0190p3.d(p028c1.a.h(j10)) : interfaceC0190p3.h0(p028c1.a.h(j10)), 2);
        }
    }

    @Override // D0.InterfaceC0190p
    public final Object J() {
        switch (this.f1813a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.f1814b.J();
    }

    @Override // D0.InterfaceC0190p
    public final int d(int i10) {
        switch (this.f1813a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.f1814b.d(i10);
    }

    @Override // D0.InterfaceC0190p
    public final int h0(int i10) {
        switch (this.f1813a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.f1814b.h0(i10);
    }

    @Override // D0.InterfaceC0190p
    public final int x(int i10) {
        switch (this.f1813a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.f1814b.x(i10);
    }
}
