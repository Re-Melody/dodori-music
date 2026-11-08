package p200t0;

import p134m1.b;

/* JADX INFO: loaded from: classes.dex */
public final class l extends B {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f26503c;

    public l(float f10) {
        super(3);
        this.f26503c = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && Float.compare(this.f26503c, ((l) obj).f26503c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f26503c);
    }

    public final String toString() {
        return b.l(new StringBuilder("HorizontalTo(x="), this.f26503c, ')');
    }
}
