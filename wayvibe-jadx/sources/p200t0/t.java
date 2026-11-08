package p200t0;

import p134m1.b;

/* JADX INFO: loaded from: classes.dex */
public final class t extends B {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f26531c;

    public t(float f10) {
        super(3);
        this.f26531c = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t) && Float.compare(this.f26531c, ((t) obj).f26531c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f26531c);
    }

    public final String toString() {
        return b.l(new StringBuilder("RelativeHorizontalTo(dx="), this.f26531c, ')');
    }
}
