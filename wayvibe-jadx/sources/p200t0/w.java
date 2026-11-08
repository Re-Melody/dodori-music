package p200t0;

import p134m1.b;

/* JADX INFO: loaded from: classes.dex */
public final class w extends B {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f26536c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f26537d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f26538e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f26539f;

    public w(float f10, float f11, float f12, float f13) {
        super(1);
        this.f26536c = f10;
        this.f26537d = f11;
        this.f26538e = f12;
        this.f26539f = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return Float.compare(this.f26536c, wVar.f26536c) == 0 && Float.compare(this.f26537d, wVar.f26537d) == 0 && Float.compare(this.f26538e, wVar.f26538e) == 0 && Float.compare(this.f26539f, wVar.f26539f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f26539f) + b.b(this.f26538e, b.b(this.f26537d, Float.hashCode(this.f26536c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeQuadTo(dx1=");
        sb.append(this.f26536c);
        sb.append(", dy1=");
        sb.append(this.f26537d);
        sb.append(", dx2=");
        sb.append(this.f26538e);
        sb.append(", dy2=");
        return b.l(sb, this.f26539f, ')');
    }
}
