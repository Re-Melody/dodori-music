package p220v;

import Z8.c;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import p230w.C;

/* JADX INFO: loaded from: classes.dex */
public final class W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f27345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C f27346b;

    /* JADX WARN: Multi-variable type inference failed */
    public W(c cVar, C c3) {
        this.f27345a = (n) cVar;
        this.f27346b = c3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof W)) {
            return false;
        }
        W w10 = (W) obj;
        return m.b(this.f27345a, w10.f27345a) && this.f27346b.equals(w10.f27346b);
    }

    public final int hashCode() {
        return this.f27346b.hashCode() + (this.f27345a.hashCode() * 31);
    }

    public final String toString() {
        return "Slide(slideOffset=" + this.f27345a + ", animationSpec=" + this.f27346b + ')';
    }
}
