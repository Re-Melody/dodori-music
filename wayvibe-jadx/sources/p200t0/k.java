package p200t0;

import p134m1.b;

/* JADX INFO: loaded from: classes.dex */
public final class k extends B {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f26497c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f26498d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f26499e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f26500f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f26501g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f26502h;

    public k(float f10, float f11, float f12, float f13, float f14, float f15) {
        super(2);
        this.f26497c = f10;
        this.f26498d = f11;
        this.f26499e = f12;
        this.f26500f = f13;
        this.f26501g = f14;
        this.f26502h = f15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Float.compare(this.f26497c, kVar.f26497c) == 0 && Float.compare(this.f26498d, kVar.f26498d) == 0 && Float.compare(this.f26499e, kVar.f26499e) == 0 && Float.compare(this.f26500f, kVar.f26500f) == 0 && Float.compare(this.f26501g, kVar.f26501g) == 0 && Float.compare(this.f26502h, kVar.f26502h) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f26502h) + b.b(this.f26501g, b.b(this.f26500f, b.b(this.f26499e, b.b(this.f26498d, Float.hashCode(this.f26497c) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CurveTo(x1=");
        sb.append(this.f26497c);
        sb.append(", y1=");
        sb.append(this.f26498d);
        sb.append(", x2=");
        sb.append(this.f26499e);
        sb.append(", y2=");
        sb.append(this.f26500f);
        sb.append(", x3=");
        sb.append(this.f26501g);
        sb.append(", y3=");
        return b.l(sb, this.f26502h, ')');
    }
}
