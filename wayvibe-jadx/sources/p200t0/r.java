package p200t0;

import p134m1.b;

/* JADX INFO: loaded from: classes.dex */
public final class r extends B {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f26518c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f26519d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f26520e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f26521f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f26522g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f26523h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f26524i;

    public r(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14) {
        super(3);
        this.f26518c = f10;
        this.f26519d = f11;
        this.f26520e = f12;
        this.f26521f = z10;
        this.f26522g = z11;
        this.f26523h = f13;
        this.f26524i = f14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return Float.compare(this.f26518c, rVar.f26518c) == 0 && Float.compare(this.f26519d, rVar.f26519d) == 0 && Float.compare(this.f26520e, rVar.f26520e) == 0 && this.f26521f == rVar.f26521f && this.f26522g == rVar.f26522g && Float.compare(this.f26523h, rVar.f26523h) == 0 && Float.compare(this.f26524i, rVar.f26524i) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f26524i) + b.b(this.f26523h, b.f(b.f(b.b(this.f26520e, b.b(this.f26519d, Float.hashCode(this.f26518c) * 31, 31), 31), 31, this.f26521f), 31, this.f26522g), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeArcTo(horizontalEllipseRadius=");
        sb.append(this.f26518c);
        sb.append(", verticalEllipseRadius=");
        sb.append(this.f26519d);
        sb.append(", theta=");
        sb.append(this.f26520e);
        sb.append(", isMoreThanHalf=");
        sb.append(this.f26521f);
        sb.append(", isPositiveArc=");
        sb.append(this.f26522g);
        sb.append(", arcStartDx=");
        sb.append(this.f26523h);
        sb.append(", arcStartDy=");
        return b.l(sb, this.f26524i, ')');
    }
}
