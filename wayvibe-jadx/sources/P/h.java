package P;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f9402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f9403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f9404c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f9405d;

    public h(float f10, float f11, float f12, float f13) {
        this.f9402a = f10;
        this.f9403b = f11;
        this.f9404c = f12;
        this.f9405d = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f9402a == hVar.f9402a && this.f9403b == hVar.f9403b && this.f9404c == hVar.f9404c && this.f9405d == hVar.f9405d;
    }

    public final int hashCode() {
        return Float.hashCode(this.f9405d) + p134m1.b.b(this.f9404c, p134m1.b.b(this.f9403b, Float.hashCode(this.f9402a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RippleAlpha(draggedAlpha=");
        sb.append(this.f9402a);
        sb.append(", focusedAlpha=");
        sb.append(this.f9403b);
        sb.append(", hoveredAlpha=");
        sb.append(this.f9404c);
        sb.append(", pressedAlpha=");
        return p134m1.b.l(sb, this.f9405d, ')');
    }
}
