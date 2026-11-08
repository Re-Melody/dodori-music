package p200t0;

import p134m1.b;

/* JADX INFO: loaded from: classes.dex */
public final class x extends B {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f26540c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f26541d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f26542e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f26543f;

    public x(float f10, float f11, float f12, float f13) {
        super(2);
        this.f26540c = f10;
        this.f26541d = f11;
        this.f26542e = f12;
        this.f26543f = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return Float.compare(this.f26540c, xVar.f26540c) == 0 && Float.compare(this.f26541d, xVar.f26541d) == 0 && Float.compare(this.f26542e, xVar.f26542e) == 0 && Float.compare(this.f26543f, xVar.f26543f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f26543f) + b.b(this.f26542e, b.b(this.f26541d, Float.hashCode(this.f26540c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeReflectiveCurveTo(dx1=");
        sb.append(this.f26540c);
        sb.append(", dy1=");
        sb.append(this.f26541d);
        sb.append(", dx2=");
        sb.append(this.f26542e);
        sb.append(", dy2=");
        return b.l(sb, this.f26543f, ')');
    }
}
