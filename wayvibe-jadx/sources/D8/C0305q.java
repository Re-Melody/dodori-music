package D8;

import B8.AbstractC0120g;
import B8.EnumC0119f;
import java.text.MessageFormat;
import java.util.logging.Level;

/* JADX INFO: renamed from: D8.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0305q extends AbstractC0120g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0313t f2742d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x2 f2743e;

    public C0305q(C0313t c0313t, x2 x2Var) {
        this.f2742d = c0313t;
        p229v9.a.k(x2Var, com.amazon.a.a.h.a.f16115b);
        this.f2743e = x2Var;
    }

    public static Level v(EnumC0119f enumC0119f) {
        int i10 = AbstractC0302p.f2735a[enumC0119f.ordinal()];
        if (i10 == 1 || i10 == 2) {
            return Level.FINE;
        }
        return i10 != 3 ? Level.FINEST : Level.FINER;
    }

    @Override // B8.AbstractC0120g
    public final void m(EnumC0119f enumC0119f, String str) {
        B8.C c3;
        C0313t c0313t = this.f2742d;
        B8.H h10 = c0313t.f2785b;
        Level levelV = v(enumC0119f);
        if (C0313t.f2783c.isLoggable(levelV)) {
            C0313t.a(h10, levelV, str);
        }
        if (!u(enumC0119f) || enumC0119f == EnumC0119f.DEBUG) {
            return;
        }
        int i10 = AbstractC0302p.f2735a[enumC0119f.ordinal()];
        if (i10 != 1) {
            c3 = i10 != 2 ? B8.C.CT_INFO : B8.C.CT_WARNING;
        } else {
            c3 = B8.C.CT_ERROR;
        }
        B8.C c9 = c3;
        long jC = this.f2743e.c();
        p229v9.a.k(str, com.amazon.a.a.o.b.f16404c);
        p229v9.a.k(c9, "severity");
        new B8.D(str, c9, jC, null);
        synchronized (c0313t.f2784a) {
        }
    }

    @Override // B8.AbstractC0120g
    public final void n(EnumC0119f enumC0119f, String str, Object... objArr) {
        m(enumC0119f, (u(enumC0119f) || C0313t.f2783c.isLoggable(v(enumC0119f))) ? MessageFormat.format(str, objArr) : null);
    }

    public final boolean u(EnumC0119f enumC0119f) {
        if (enumC0119f != EnumC0119f.DEBUG) {
            synchronized (this.f2742d.f2784a) {
            }
        }
        return false;
    }
}
