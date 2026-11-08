package p220v;

import p134m1.b;

/* JADX INFO: renamed from: v.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2244a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f27354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f27355b;

    public C2244a(float f10, float f11) {
        this.f27354a = f10;
        this.f27355b = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2244a)) {
            return false;
        }
        C2244a c2244a = (C2244a) obj;
        return Float.compare(this.f27354a, c2244a.f27354a) == 0 && Float.compare(this.f27355b, c2244a.f27355b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f27355b) + (Float.hashCode(this.f27354a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FlingResult(distanceCoefficient=");
        sb.append(this.f27354a);
        sb.append(", velocityCoefficient=");
        return b.l(sb, this.f27355b, ')');
    }
}
