package p200t0;

import p134m1.b;

/* JADX INFO: loaded from: classes.dex */
public final class A extends B {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f26368c;

    public A(float f10) {
        super(3);
        this.f26368c = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof A) && Float.compare(this.f26368c, ((A) obj).f26368c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f26368c);
    }

    public final String toString() {
        return b.l(new StringBuilder("VerticalTo(y="), this.f26368c, ')');
    }
}
