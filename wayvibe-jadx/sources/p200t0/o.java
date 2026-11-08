package p200t0;

import p134m1.b;

/* JADX INFO: loaded from: classes.dex */
public final class o extends B {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f26508c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f26509d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f26510e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f26511f;

    public o(float f10, float f11, float f12, float f13) {
        super(1);
        this.f26508c = f10;
        this.f26509d = f11;
        this.f26510e = f12;
        this.f26511f = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return Float.compare(this.f26508c, oVar.f26508c) == 0 && Float.compare(this.f26509d, oVar.f26509d) == 0 && Float.compare(this.f26510e, oVar.f26510e) == 0 && Float.compare(this.f26511f, oVar.f26511f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f26511f) + b.b(this.f26510e, b.b(this.f26509d, Float.hashCode(this.f26508c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QuadTo(x1=");
        sb.append(this.f26508c);
        sb.append(", y1=");
        sb.append(this.f26509d);
        sb.append(", x2=");
        sb.append(this.f26510e);
        sb.append(", y2=");
        return b.l(sb, this.f26511f, ')');
    }
}
