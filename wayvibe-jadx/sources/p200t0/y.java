package p200t0;

import p134m1.b;

/* JADX INFO: loaded from: classes.dex */
public final class y extends B {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f26544c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f26545d;

    public y(float f10, float f11) {
        super(1);
        this.f26544c = f10;
        this.f26545d = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return Float.compare(this.f26544c, yVar.f26544c) == 0 && Float.compare(this.f26545d, yVar.f26545d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f26545d) + (Float.hashCode(this.f26544c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeReflectiveQuadTo(dx=");
        sb.append(this.f26544c);
        sb.append(", dy=");
        return b.l(sb, this.f26545d, ')');
    }
}
