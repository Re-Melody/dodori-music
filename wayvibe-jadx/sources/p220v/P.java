package p220v;

import p134m1.b;

/* JADX INFO: loaded from: classes.dex */
public final class P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f27334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f27335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f27336c;

    public P(float f10, float f11, long j10) {
        this.f27334a = f10;
        this.f27335b = f11;
        this.f27336c = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P)) {
            return false;
        }
        P p10 = (P) obj;
        return Float.compare(this.f27334a, p10.f27334a) == 0 && Float.compare(this.f27335b, p10.f27335b) == 0 && this.f27336c == p10.f27336c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f27336c) + b.b(this.f27335b, Float.hashCode(this.f27334a) * 31, 31);
    }

    public final String toString() {
        return "FlingInfo(initialVelocity=" + this.f27334a + ", distance=" + this.f27335b + ", duration=" + this.f27336c + ')';
    }
}
