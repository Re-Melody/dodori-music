package p153o0;

import p134m1.b;

/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f23571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f23572b;

    public s(float f10, float f11) {
        this.f23571a = f10;
        this.f23572b = f11;
    }

    public final float[] a() {
        float f10 = this.f23571a;
        float f11 = this.f23572b;
        return new float[]{f10 / f11, 1.0f, ((1.0f - f10) - f11) / f11};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Float.compare(this.f23571a, sVar.f23571a) == 0 && Float.compare(this.f23572b, sVar.f23572b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f23572b) + (Float.hashCode(this.f23571a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WhitePoint(x=");
        sb.append(this.f23571a);
        sb.append(", y=");
        return b.l(sb, this.f23572b, ')');
    }
}
