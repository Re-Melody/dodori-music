package p241x;

import p028c1.e;
import p134m1.b;
import p143n0.e0;

/* JADX INFO: renamed from: x.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2318v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f28301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e0 f28302b;

    public C2318v(float f10, e0 e0Var) {
        this.f28301a = f10;
        this.f28302b = e0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2318v)) {
            return false;
        }
        C2318v c2318v = (C2318v) obj;
        return e.a(this.f28301a, c2318v.f28301a) && this.f28302b.equals(c2318v.f28302b);
    }

    public final int hashCode() {
        return this.f28302b.hashCode() + (Float.hashCode(this.f28301a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BorderStroke(width=");
        b.r(this.f28301a, ", brush=", sb);
        sb.append(this.f28302b);
        sb.append(')');
        return sb.toString();
    }
}
