package p220v;

import N8.y;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class N {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final N f27330b = new N(new Y((O) null, (W) null, (C2263u) null, (T) null, (LinkedHashMap) null, 63));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final N f27331c = new N(new Y((O) null, (W) null, (C2263u) null, (T) null, (LinkedHashMap) null, 47));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Y f27332a;

    public N(Y y6) {
        this.f27332a = y6;
    }

    public final N a(N n6) {
        Y y6 = n6.f27332a;
        Y y10 = this.f27332a;
        O o10 = y6.f27348a;
        if (o10 == null) {
            o10 = y10.f27348a;
        }
        W w10 = y6.f27349b;
        if (w10 == null) {
            w10 = y10.f27349b;
        }
        C2263u c2263u = y6.f27350c;
        if (c2263u == null) {
            c2263u = y10.f27350c;
        }
        T t10 = y6.f27351d;
        if (t10 == null) {
            t10 = y10.f27351d;
        }
        return new N(new Y(o10, w10, c2263u, t10, y6.f27352e || y10.f27352e, y.k0(y10.f27353f, y6.f27353f)));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof N) && m.b(((N) obj).f27332a, this.f27332a);
    }

    public final int hashCode() {
        return this.f27332a.hashCode();
    }

    public final String toString() {
        if (equals(f27330b)) {
            return "ExitTransition.None";
        }
        if (equals(f27331c)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        StringBuilder sb = new StringBuilder("ExitTransition: \nFade - ");
        Y y6 = this.f27332a;
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
        sb.append(",\nKeepUntilTransitionsFinished - ");
        sb.append(y6.f27352e);
        return sb.toString();
    }
}
