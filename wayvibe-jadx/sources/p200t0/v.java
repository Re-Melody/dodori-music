package p200t0;

import p134m1.b;

/* JADX INFO: loaded from: classes.dex */
public final class v extends B {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f26534c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f26535d;

    public v(float f10, float f11) {
        super(3);
        this.f26534c = f10;
        this.f26535d = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return Float.compare(this.f26534c, vVar.f26534c) == 0 && Float.compare(this.f26535d, vVar.f26535d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f26535d) + (Float.hashCode(this.f26534c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeMoveTo(dx=");
        sb.append(this.f26534c);
        sb.append(", dy=");
        return b.l(sb, this.f26535d, ')');
    }
}
