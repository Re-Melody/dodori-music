package p200t0;

import p134m1.b;

/* JADX INFO: loaded from: classes.dex */
public final class n extends B {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f26506c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f26507d;

    public n(float f10, float f11) {
        super(3);
        this.f26506c = f10;
        this.f26507d = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Float.compare(this.f26506c, nVar.f26506c) == 0 && Float.compare(this.f26507d, nVar.f26507d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f26507d) + (Float.hashCode(this.f26506c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MoveTo(x=");
        sb.append(this.f26506c);
        sb.append(", y=");
        return b.l(sb, this.f26507d, ')');
    }
}
