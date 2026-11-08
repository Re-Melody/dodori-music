package p262z0;

import V0.p;

/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f29798a;

    public /* synthetic */ y(int i10) {
        this.f29798a = i10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof y) {
            return this.f29798a == ((y) obj).f29798a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f29798a);
    }

    public final String toString() {
        return p.q(new StringBuilder("PointerKeyboardModifiers(packedValue="), this.f29798a, ')');
    }
}
