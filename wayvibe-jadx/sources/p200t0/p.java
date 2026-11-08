package p200t0;

import p134m1.b;

/* JADX INFO: loaded from: classes.dex */
public final class p extends B {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f26512c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f26513d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f26514e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f26515f;

    public p(float f10, float f11, float f12, float f13) {
        super(2);
        this.f26512c = f10;
        this.f26513d = f11;
        this.f26514e = f12;
        this.f26515f = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return Float.compare(this.f26512c, pVar.f26512c) == 0 && Float.compare(this.f26513d, pVar.f26513d) == 0 && Float.compare(this.f26514e, pVar.f26514e) == 0 && Float.compare(this.f26515f, pVar.f26515f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f26515f) + b.b(this.f26514e, b.b(this.f26513d, Float.hashCode(this.f26512c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReflectiveCurveTo(x1=");
        sb.append(this.f26512c);
        sb.append(", y1=");
        sb.append(this.f26513d);
        sb.append(", x2=");
        sb.append(this.f26514e);
        sb.append(", y2=");
        return b.l(sb, this.f26515f, ')');
    }
}
