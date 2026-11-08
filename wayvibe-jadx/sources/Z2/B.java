package Z2;

import B2.AbstractC0111a;
import F.C0356a;
import p255y2.C2338n;
import p255y2.C2339o;

/* JADX INFO: loaded from: classes.dex */
public final class B implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f13460c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f13461d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f13462e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public q f13463f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public F f13464g;

    public B(int i10, int i11, String str) {
        this.f13458a = i10;
        this.f13459b = i11;
        this.f13460c = str;
    }

    @Override // Z2.o
    public final int e(p pVar, C0356a c0356a) {
        int i10 = this.f13462e;
        if (i10 != 1) {
            if (i10 == 2) {
                return -1;
            }
            throw new IllegalStateException();
        }
        F f10 = this.f13464g;
        f10.getClass();
        int iD = f10.d(pVar, 1024, true);
        if (iD != -1) {
            this.f13461d += iD;
            return 0;
        }
        this.f13462e = 2;
        this.f13464g.a(0L, 1, this.f13461d, 0, null);
        this.f13461d = 0;
        return 0;
    }

    @Override // Z2.o
    public final void f(long j10, long j11) {
        if (j10 == 0 || this.f13462e == 1) {
            this.f13462e = 1;
            this.f13461d = 0;
        }
    }

    @Override // Z2.o
    public final boolean g(p pVar) {
        int i10 = this.f13459b;
        int i11 = this.f13458a;
        AbstractC0111a.h((i11 == -1 || i10 == -1) ? false : true);
        B2.u uVar = new B2.u(i10);
        ((k) pVar).f(uVar.f630a, 0, i10, false);
        return uVar.z() == i11;
    }

    @Override // Z2.o
    public final void k(q qVar) {
        this.f13463f = qVar;
        F fL = qVar.L(1024, 4);
        this.f13464g = fL;
        C2338n c2338n = new C2338n();
        c2338n.f28918l = p255y2.C.l(this.f13460c);
        fL.b(new C2339o(c2338n));
        this.f13463f.A();
        this.f13463f.b(new C());
        this.f13462e = 1;
    }

    @Override // Z2.o
    public final void release() {
    }
}
