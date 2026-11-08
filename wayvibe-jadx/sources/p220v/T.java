package p220v;

import p134m1.b;
import p143n0.g0;
import p230w.n0;

/* JADX INFO: loaded from: classes.dex */
public final class T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f27340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f27341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n0 f27342c;

    public T(float f10, long j10, n0 n0Var) {
        this.f27340a = f10;
        this.f27341b = j10;
        this.f27342c = n0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof T)) {
            return false;
        }
        T t10 = (T) obj;
        return Float.compare(this.f27340a, t10.f27340a) == 0 && g0.a(this.f27341b, t10.f27341b) && this.f27342c.equals(t10.f27342c);
    }

    public final int hashCode() {
        int iHashCode = Float.hashCode(this.f27340a) * 31;
        int i10 = g0.f22770c;
        return this.f27342c.hashCode() + b.g(this.f27341b, iHashCode, 31);
    }

    public final String toString() {
        return "Scale(scale=" + this.f27340a + ", transformOrigin=" + ((Object) g0.d(this.f27341b)) + ", animationSpec=" + this.f27342c + ')';
    }
}
