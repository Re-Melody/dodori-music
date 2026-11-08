package p200t0;

import p134m1.b;

/* JADX INFO: loaded from: classes.dex */
public final class u extends B {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f26532c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f26533d;

    public u(float f10, float f11) {
        super(3);
        this.f26532c = f10;
        this.f26533d = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return Float.compare(this.f26532c, uVar.f26532c) == 0 && Float.compare(this.f26533d, uVar.f26533d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f26533d) + (Float.hashCode(this.f26532c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeLineTo(dx=");
        sb.append(this.f26532c);
        sb.append(", dy=");
        return b.l(sb, this.f26533d, ')');
    }
}
