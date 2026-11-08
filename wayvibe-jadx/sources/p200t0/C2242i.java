package p200t0;

import p134m1.b;

/* JADX INFO: renamed from: t0.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2242i extends B {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f26489c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f26490d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f26491e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f26492f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f26493g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f26494h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f26495i;

    public C2242i(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14) {
        super(3);
        this.f26489c = f10;
        this.f26490d = f11;
        this.f26491e = f12;
        this.f26492f = z10;
        this.f26493g = z11;
        this.f26494h = f13;
        this.f26495i = f14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2242i)) {
            return false;
        }
        C2242i c2242i = (C2242i) obj;
        return Float.compare(this.f26489c, c2242i.f26489c) == 0 && Float.compare(this.f26490d, c2242i.f26490d) == 0 && Float.compare(this.f26491e, c2242i.f26491e) == 0 && this.f26492f == c2242i.f26492f && this.f26493g == c2242i.f26493g && Float.compare(this.f26494h, c2242i.f26494h) == 0 && Float.compare(this.f26495i, c2242i.f26495i) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f26495i) + b.b(this.f26494h, b.f(b.f(b.b(this.f26491e, b.b(this.f26490d, Float.hashCode(this.f26489c) * 31, 31), 31), 31, this.f26492f), 31, this.f26493g), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ArcTo(horizontalEllipseRadius=");
        sb.append(this.f26489c);
        sb.append(", verticalEllipseRadius=");
        sb.append(this.f26490d);
        sb.append(", theta=");
        sb.append(this.f26491e);
        sb.append(", isMoreThanHalf=");
        sb.append(this.f26492f);
        sb.append(", isPositiveArc=");
        sb.append(this.f26493g);
        sb.append(", arcStartX=");
        sb.append(this.f26494h);
        sb.append(", arcStartY=");
        return b.l(sb, this.f26495i, ')');
    }
}
