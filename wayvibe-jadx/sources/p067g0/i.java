package p067g0;

import S9.b;
import p028c1.k;

/* JADX INFO: loaded from: classes.dex */
public final class i implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f19956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f19957b;

    public i(float f10, float f11) {
        this.f19956a = f10;
        this.f19957b = f11;
    }

    @Override // p067g0.e
    public final long a(long j10, long j11, k kVar) {
        float f10 = (((int) (j11 >> 32)) - ((int) (j10 >> 32))) / 2.0f;
        float f11 = (((int) (j11 & 4294967295L)) - ((int) (j10 & 4294967295L))) / 2.0f;
        k kVar2 = k.Ltr;
        float f12 = this.f19956a;
        if (kVar != kVar2) {
            f12 *= -1;
        }
        float f13 = 1;
        return b.a(Math.round((f12 + f13) * f10), Math.round((f13 + this.f19957b) * f11));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Float.compare(this.f19956a, iVar.f19956a) == 0 && Float.compare(this.f19957b, iVar.f19957b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f19957b) + (Float.hashCode(this.f19956a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BiasAlignment(horizontalBias=");
        sb.append(this.f19956a);
        sb.append(", verticalBias=");
        return p134m1.b.l(sb, this.f19957b, ')');
    }
}
