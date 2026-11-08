package p220v;

import Z8.c;
import kotlin.jvm.internal.m;
import p067g0.e;
import p230w.V;

/* JADX INFO: renamed from: v.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2263u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f27414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f27415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final V f27416c;

    public C2263u(e eVar, c cVar, V v3) {
        this.f27414a = eVar;
        this.f27415b = cVar;
        this.f27416c = v3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2263u)) {
            return false;
        }
        C2263u c2263u = (C2263u) obj;
        return m.b(this.f27414a, c2263u.f27414a) && m.b(this.f27415b, c2263u.f27415b) && this.f27416c.equals(c2263u.f27416c);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + ((this.f27416c.hashCode() + ((this.f27415b.hashCode() + (this.f27414a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ChangeSize(alignment=" + this.f27414a + ", size=" + this.f27415b + ", animationSpec=" + this.f27416c + ", clip=true)";
    }
}
