package p230w;

import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC2285s f27775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final A f27776b;

    public t0(AbstractC2285s abstractC2285s, A a10) {
        this.f27775a = abstractC2285s;
        this.f27776b = a10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return m.b(this.f27775a, t0Var.f27775a) && m.b(this.f27776b, t0Var.f27776b);
    }

    public final int hashCode() {
        return Integer.hashCode(0) + ((this.f27776b.hashCode() + (this.f27775a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "VectorizedKeyframeSpecElementInfo(vectorValue=" + this.f27775a + ", easing=" + this.f27776b + ", arcMode=ArcMode(value=0))";
    }
}
