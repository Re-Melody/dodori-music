package p220v;

import N8.y;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public abstract class L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final M f27328a = new M(new Y((O) null, (W) null, (C2263u) null, (T) null, (LinkedHashMap) null, 63));

    public final M a(L l10) {
        Y y6 = ((M) l10).f27329b;
        O o10 = y6.f27348a;
        if (o10 == null) {
            o10 = ((M) this).f27329b.f27348a;
        }
        W w10 = y6.f27349b;
        if (w10 == null) {
            w10 = ((M) this).f27329b.f27349b;
        }
        C2263u c2263u = y6.f27350c;
        if (c2263u == null) {
            c2263u = ((M) this).f27329b.f27350c;
        }
        T t10 = y6.f27351d;
        if (t10 == null) {
            t10 = ((M) this).f27329b.f27351d;
        }
        return new M(new Y(o10, w10, c2263u, t10, y.k0(((M) this).f27329b.f27353f, y6.f27353f), 16));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof L) && m.b(((M) ((L) obj)).f27329b, ((M) this).f27329b);
    }

    public final int hashCode() {
        return ((M) this).f27329b.hashCode();
    }

    public final String toString() {
        if (equals(f27328a)) {
            return "EnterTransition.None";
        }
        StringBuilder sb = new StringBuilder("EnterTransition: \nFade - ");
        Y y6 = ((M) this).f27329b;
        O o10 = y6.f27348a;
        sb.append(o10 != null ? o10.toString() : null);
        sb.append(",\nSlide - ");
        W w10 = y6.f27349b;
        sb.append(w10 != null ? w10.toString() : null);
        sb.append(",\nShrink - ");
        C2263u c2263u = y6.f27350c;
        sb.append(c2263u != null ? c2263u.toString() : null);
        sb.append(",\nScale - ");
        T t10 = y6.f27351d;
        sb.append(t10 != null ? t10.toString() : null);
        return sb.toString();
    }
}
