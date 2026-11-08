package p200t0;

import p134m1.b;

/* JADX INFO: loaded from: classes.dex */
public final class q extends B {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f26516c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f26517d;

    public q(float f10, float f11) {
        super(1);
        this.f26516c = f10;
        this.f26517d = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return Float.compare(this.f26516c, qVar.f26516c) == 0 && Float.compare(this.f26517d, qVar.f26517d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f26517d) + (Float.hashCode(this.f26516c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReflectiveQuadTo(x=");
        sb.append(this.f26516c);
        sb.append(", y=");
        return b.l(sb, this.f26517d, ')');
    }
}
