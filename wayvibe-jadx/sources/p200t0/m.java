package p200t0;

import p134m1.b;

/* JADX INFO: loaded from: classes.dex */
public final class m extends B {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f26504c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f26505d;

    public m(float f10, float f11) {
        super(3);
        this.f26504c = f10;
        this.f26505d = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return Float.compare(this.f26504c, mVar.f26504c) == 0 && Float.compare(this.f26505d, mVar.f26505d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f26505d) + (Float.hashCode(this.f26504c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LineTo(x=");
        sb.append(this.f26504c);
        sb.append(", y=");
        return b.l(sb, this.f26505d, ')');
    }
}
