package p255y2;

import B2.C;

/* JADX INFO: loaded from: classes.dex */
public final class Z {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Z f28854e = new Z(0, 0, 0, 1.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f28855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f28856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f28857c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f28858d;

    static {
        C.D(0);
        C.D(1);
        C.D(2);
        C.D(3);
    }

    public Z(int i10, int i11, int i12, float f10) {
        this.f28855a = i10;
        this.f28856b = i11;
        this.f28857c = i12;
        this.f28858d = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Z) {
            Z z10 = (Z) obj;
            if (this.f28855a == z10.f28855a && this.f28856b == z10.f28856b && this.f28857c == z10.f28857c && this.f28858d == z10.f28858d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f28858d) + ((((((217 + this.f28855a) * 31) + this.f28856b) * 31) + this.f28857c) * 31);
    }
}
