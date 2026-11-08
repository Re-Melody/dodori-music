package p028c1;

import p038d1.a;
import p134m1.b;

/* JADX INFO: loaded from: classes.dex */
public final class l implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f15859a;

    public l(float f10) {
        this.f15859a = f10;
    }

    @Override // p038d1.a
    public final float a(float f10) {
        return f10 / this.f15859a;
    }

    @Override // p038d1.a
    public final float b(float f10) {
        return f10 * this.f15859a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && Float.compare(this.f15859a, ((l) obj).f15859a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f15859a);
    }

    public final String toString() {
        return b.l(new StringBuilder("LinearFontScaleConverter(fontScale="), this.f15859a, ')');
    }
}
