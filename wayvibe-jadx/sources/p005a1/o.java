package p005a1;

import p134m1.b;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o f14103c = new o(1.0f, 0.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f14104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f14105b;

    public o(float f10, float f11) {
        this.f14104a = f10;
        this.f14105b = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f14104a == oVar.f14104a && this.f14105b == oVar.f14105b;
    }

    public final int hashCode() {
        return Float.hashCode(this.f14105b) + (Float.hashCode(this.f14104a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextGeometricTransform(scaleX=");
        sb.append(this.f14104a);
        sb.append(", skewX=");
        return b.l(sb, this.f14105b, ')');
    }
}
