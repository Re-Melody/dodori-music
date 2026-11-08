package S2;

import B2.C;
import B2.u;
import Z2.E;
import Z2.F;
import Z2.n;
import p255y2.C2339o;
import p255y2.InterfaceC2333i;

/* JADX INFO: loaded from: classes.dex */
public final class c implements F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2339o f11023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f11024c = new n();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C2339o f11025d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public F f11026e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f11027f;

    public c(int i10, int i11, C2339o c2339o) {
        this.f11022a = i11;
        this.f11023b = c2339o;
    }

    @Override // Z2.F
    public final void a(long j10, int i10, int i11, int i12, E e2) {
        long j11 = this.f11027f;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            this.f11026e = this.f11024c;
        }
        F f10 = this.f11026e;
        int i13 = C.f560a;
        f10.a(j10, i10, i11, i12, e2);
    }

    @Override // Z2.F
    public final void b(C2339o c2339o) {
        C2339o c2339o2 = this.f11023b;
        if (c2339o2 != null) {
            c2339o = c2339o.c(c2339o2);
        }
        this.f11025d = c2339o;
        F f10 = this.f11026e;
        int i10 = C.f560a;
        f10.b(c2339o);
    }

    @Override // Z2.F
    public final void c(u uVar, int i10, int i11) {
        F f10 = this.f11026e;
        int i12 = C.f560a;
        f10.c(uVar, i10, 0);
    }

    @Override // Z2.F
    public final int d(InterfaceC2333i interfaceC2333i, int i10, boolean z10) {
        F f10 = this.f11026e;
        int i11 = C.f560a;
        return f10.d(interfaceC2333i, i10, z10);
    }
}
