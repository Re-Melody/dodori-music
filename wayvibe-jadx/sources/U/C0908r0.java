package U;

/* JADX INFO: renamed from: U.r0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0908r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f11951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C0913u f11952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C0878c f11953c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Z8.e f11954d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f11955e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public p199t.v f11956f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p199t.y f11957g;

    public C0908r0(C0913u c0913u) {
        this.f11952b = c0913u;
    }

    public static boolean a(D d10, p199t.y yVar) {
        kotlin.jvm.internal.m.d(d10, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>");
        M0 m8 = d10.f11702c;
        if (m8 == null) {
            m8 = U.f11815f;
        }
        return !m8.a(d10.m().f11697f, yVar.e(d10));
    }

    public final boolean b() {
        if (this.f11952b != null) {
            C0878c c0878c = this.f11953c;
            if (c0878c != null ? c0878c.a() : false) {
                return true;
            }
        }
        return false;
    }

    public final M c(Object obj) {
        M mO;
        C0913u c0913u = this.f11952b;
        return (c0913u == null || (mO = c0913u.o(this, obj)) == null) ? M.IGNORED : mO;
    }

    public final void d() {
        C0913u c0913u = this.f11952b;
        if (c0913u != null) {
            c0913u.f11973o = true;
        }
        this.f11952b = null;
        this.f11956f = null;
        this.f11957g = null;
    }

    public final void e(boolean z10) {
        if (z10) {
            this.f11951a |= 32;
        } else {
            this.f11951a &= -33;
        }
    }
}
