package p067g0;

import p028c1.k;
import p134m1.b;

/* JADX INFO: loaded from: classes.dex */
public final class g implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f19954a;

    public g(float f10) {
        this.f19954a = f10;
    }

    public final int a(int i10, int i11, k kVar) {
        float f10 = (i11 - i10) / 2.0f;
        k kVar2 = k.Ltr;
        float f11 = this.f19954a;
        if (kVar != kVar2) {
            f11 *= -1;
        }
        return Math.round((1 + f11) * f10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && Float.compare(this.f19954a, ((g) obj).f19954a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f19954a);
    }

    public final String toString() {
        return b.l(new StringBuilder("Horizontal(bias="), this.f19954a, ')');
    }
}
