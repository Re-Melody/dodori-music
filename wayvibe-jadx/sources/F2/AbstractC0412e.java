package F2;

import B2.AbstractC0111a;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;
import p255y2.C2338n;
import p255y2.C2339o;

/* JADX INFO: renamed from: F2.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0412e implements f0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4099b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public j0 f4101d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4102e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public G2.m f4103f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public B2.w f4104g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f4105h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public R2.V f4106i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public C2339o[] f4107j;
    public long k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f4108l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f4110n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f4111o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public U2.p f4113q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f4098a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final M.s f4100c = new M.s(12, false);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f4109m = Long.MIN_VALUE;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public p255y2.O f4112p = p255y2.O.f28801a;

    public AbstractC0412e(int i10) {
        this.f4099b = i10;
    }

    public static int f(int i10, int i11, int i12, int i13) {
        return i10 | i11 | i12 | ColorExtractionConstants.MINIMUM_ALPHA_THRESHOLD | i13;
    }

    public static boolean m(int i10, boolean z10) {
        int i11 = i10 & 7;
        if (i11 != 4) {
            return z10 && i11 == 3;
        }
        return true;
    }

    public abstract int B(C2339o c2339o);

    public int C() {
        return 0;
    }

    public final C0420m g(Exception exc, C2339o c2339o, boolean z10, int i10) {
        int iB;
        if (c2339o == null || this.f4111o) {
            iB = 4;
        } else {
            this.f4111o = true;
            try {
                iB = B(c2339o) & 7;
                this.f4111o = false;
            } catch (C0420m unused) {
                this.f4111o = false;
                iB = 4;
            } catch (Throwable th) {
                this.f4111o = false;
                throw th;
            }
        }
        return new C0420m(1, exc, i10, j(), this.f4102e, c2339o, c2339o == null ? 4 : iB, z10);
    }

    public P i() {
        return null;
    }

    public abstract String j();

    public final boolean k() {
        return this.f4109m == Long.MIN_VALUE;
    }

    public abstract boolean l();

    public abstract boolean n();

    public abstract void o();

    public abstract void q(long j10, boolean z10);

    public abstract void v(C2339o[] c2339oArr, long j10, long j11);

    public final int w(M.s sVar, E2.g gVar, int i10) {
        R2.V v3 = this.f4106i;
        v3.getClass();
        int iE = v3.e(sVar, gVar, i10);
        if (iE == -4) {
            if (gVar.e(4)) {
                this.f4109m = Long.MIN_VALUE;
                return this.f4110n ? -4 : -3;
            }
            long j10 = gVar.f3032g + this.k;
            gVar.f3032g = j10;
            this.f4109m = Math.max(this.f4109m, j10);
            return iE;
        }
        if (iE == -5) {
            C2339o c2339o = (C2339o) sVar.f7971c;
            c2339o.getClass();
            long j11 = c2339o.r;
            if (j11 != Long.MAX_VALUE) {
                C2338n c2338nA = c2339o.a();
                c2338nA.f28923q = j11 + this.k;
                sVar.f7971c = new C2339o(c2338nA);
            }
        }
        return iE;
    }

    public abstract void x(long j10, long j11);

    public final void y(C2339o[] c2339oArr, R2.V v3, long j10, long j11, R2.D d10) {
        AbstractC0111a.h(!this.f4110n);
        this.f4106i = v3;
        if (this.f4109m == Long.MIN_VALUE) {
            this.f4109m = j10;
        }
        this.f4107j = c2339oArr;
        this.k = j11;
        v(c2339oArr, j10, j11);
    }

    public final void z() {
        AbstractC0111a.h(this.f4105h == 0);
        this.f4100c.x();
        s();
    }

    public void h() {
    }

    public void r() {
    }

    public void s() {
    }

    public void t() {
    }

    public void u() {
    }

    public void A(float f10, float f11) {
    }

    @Override // F2.f0
    public void d(int i10, Object obj) {
    }

    public void p(boolean z10, boolean z11) {
    }
}
