package p200t0;

import p134m1.b;

/* JADX INFO: loaded from: classes.dex */
public final class z extends B {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f26546c;

    public z(float f10) {
        super(3);
        this.f26546c = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z) && Float.compare(this.f26546c, ((z) obj).f26546c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f26546c);
    }

    public final String toString() {
        return b.l(new StringBuilder("RelativeVerticalTo(dy="), this.f26546c, ')');
    }
}
