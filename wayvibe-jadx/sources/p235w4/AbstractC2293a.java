package p235w4;

import J4.l;
import X4.a;
import X4.c;
import p256y4.d;
import p265z4.b;

/* JADX INFO: renamed from: w4.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2293a implements v, w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f27895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private x f27896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f27897c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f27898d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private l f27899e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f27900f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f27901g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f27902h;

    public AbstractC2293a(int i10) {
        this.f27895a = i10;
    }

    public final int A() {
        return this.f27897c;
    }

    public final boolean B() {
        return this.f27901g ? this.f27902h : this.f27899e.c();
    }

    public abstract void a(long j10, boolean z10);

    @Override // p235w4.v
    public final void a(x xVar, n[] nVarArr, l lVar, long j10, boolean z10, long j11) {
        a.q(this.f27898d == 0);
        this.f27896b = xVar;
        this.f27898d = 1;
        a(z10);
        a(nVarArr, lVar, j11);
        a(j10, z10);
    }

    public int a_() {
        return 0;
    }

    @Override // p235w4.v
    public final void b(long j10) {
        this.f27902h = false;
        this.f27901g = false;
        a(j10, false);
    }

    @Override // p235w4.v
    public final void c(int i10) {
        this.f27897c = i10;
    }

    public abstract void d();

    @Override // p235w4.v
    public c g() {
        return null;
    }

    @Override // p235w4.v, p235w4.w
    public final int o() {
        return this.f27895a;
    }

    @Override // p235w4.v
    public final int q() {
        return this.f27898d;
    }

    @Override // p235w4.v
    public final void r() {
        a.q(this.f27898d == 1);
        this.f27898d = 2;
        b();
    }

    @Override // p235w4.v
    public final l s() {
        return this.f27899e;
    }

    @Override // p235w4.v
    public final boolean t() {
        return this.f27901g;
    }

    @Override // p235w4.v
    public final void u() {
        this.f27902h = true;
    }

    @Override // p235w4.v
    public final boolean v() {
        return this.f27902h;
    }

    @Override // p235w4.v
    public final void w() {
        this.f27899e.d();
    }

    @Override // p235w4.v
    public final void x() {
        a.q(this.f27898d == 2);
        this.f27898d = 1;
        c();
    }

    @Override // p235w4.v
    public final void y() {
        a.q(this.f27898d == 1);
        this.f27898d = 0;
        this.f27899e = null;
        this.f27902h = false;
        d();
    }

    public final x z() {
        return this.f27896b;
    }

    public void c() {
    }

    public int c(long j10) {
        return this.f27899e.a(j10 - this.f27900f);
    }

    public void b() {
    }

    @Override // p235w4.v
    public final void a(n[] nVarArr, l lVar, long j10) {
        a.q(!this.f27902h);
        this.f27899e = lVar;
        this.f27901g = false;
        this.f27900f = j10;
        a(nVarArr, j10);
    }

    @Override // p235w4.e
    public void a(int i10, Object obj) {
    }

    public void a(boolean z10) {
    }

    public void a(n[] nVarArr, long j10) {
    }

    public final int a(o oVar, d dVar, boolean z10) {
        int iB = this.f27899e.b(oVar, dVar, z10);
        if (iB == -4) {
            if (dVar.c(4)) {
                this.f27901g = true;
                return this.f27902h ? -4 : -3;
            }
            dVar.f29075f += this.f27900f;
            return iB;
        }
        if (iB == -5) {
            n nVar = oVar.f28020a;
            long j10 = nVar.f28016w;
            if (j10 != Long.MAX_VALUE) {
                oVar.f28020a = nVar.b(j10 + this.f27900f);
            }
        }
        return iB;
    }

    public static boolean a(p265z4.d dVar, b bVar) {
        if (bVar == null) {
            return true;
        }
        if (dVar == null) {
            return false;
        }
        return dVar.a();
    }

    @Override // p235w4.v
    public final w p() {
        return this;
    }
}
