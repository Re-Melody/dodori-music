package p028c1;

import p134m1.b;

/* JADX INFO: loaded from: classes.dex */
public final class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f15844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f15845b;

    public c(float f10, float f11) {
        this.f15844a = f10;
        this.f15845b = f11;
    }

    @Override // p028c1.b
    public final float K() {
        return this.f15845b;
    }

    @Override // p028c1.b
    public final float a() {
        return this.f15844a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Float.compare(this.f15844a, cVar.f15844a) == 0 && Float.compare(this.f15845b, cVar.f15845b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f15845b) + (Float.hashCode(this.f15844a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DensityImpl(density=");
        sb.append(this.f15844a);
        sb.append(", fontScale=");
        return b.l(sb, this.f15845b, ')');
    }
}
