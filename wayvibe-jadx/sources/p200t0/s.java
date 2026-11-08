package p200t0;

import p134m1.b;

/* JADX INFO: loaded from: classes.dex */
public final class s extends B {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f26525c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f26526d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f26527e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f26528f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f26529g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f26530h;

    public s(float f10, float f11, float f12, float f13, float f14, float f15) {
        super(2);
        this.f26525c = f10;
        this.f26526d = f11;
        this.f26527e = f12;
        this.f26528f = f13;
        this.f26529g = f14;
        this.f26530h = f15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Float.compare(this.f26525c, sVar.f26525c) == 0 && Float.compare(this.f26526d, sVar.f26526d) == 0 && Float.compare(this.f26527e, sVar.f26527e) == 0 && Float.compare(this.f26528f, sVar.f26528f) == 0 && Float.compare(this.f26529g, sVar.f26529g) == 0 && Float.compare(this.f26530h, sVar.f26530h) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f26530h) + b.b(this.f26529g, b.b(this.f26528f, b.b(this.f26527e, b.b(this.f26526d, Float.hashCode(this.f26525c) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeCurveTo(dx1=");
        sb.append(this.f26525c);
        sb.append(", dy1=");
        sb.append(this.f26526d);
        sb.append(", dx2=");
        sb.append(this.f26527e);
        sb.append(", dy2=");
        sb.append(this.f26528f);
        sb.append(", dx3=");
        sb.append(this.f26529g);
        sb.append(", dy3=");
        return b.l(sb, this.f26530h, ')');
    }
}
