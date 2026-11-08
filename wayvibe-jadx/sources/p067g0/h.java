package p067g0;

import p134m1.b;

/* JADX INFO: loaded from: classes.dex */
public final class h implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f19955a;

    public h(float f10) {
        this.f19955a = f10;
    }

    public final int a(int i10, int i11) {
        return Math.round((1 + this.f19955a) * ((i11 - i10) / 2.0f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && Float.compare(this.f19955a, ((h) obj).f19955a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f19955a);
    }

    public final String toString() {
        return b.l(new StringBuilder("Vertical(bias="), this.f19955a, ')');
    }
}
