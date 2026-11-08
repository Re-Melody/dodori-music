package p134m1;

/* JADX INFO: loaded from: classes.dex */
public final class f extends d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f22202e;

    public f(float f10) {
        super(null);
        this.f22202e = f10;
    }

    @Override // p134m1.d
    public final float d() {
        char[] cArr;
        if (Float.isNaN(this.f22202e) && (cArr = this.f22198a) != null && cArr.length >= 1) {
            this.f22202e = Float.parseFloat(c());
        }
        return this.f22202e;
    }

    @Override // p134m1.d
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            float fD = d();
            float fD2 = ((f) obj).d();
            if ((Float.isNaN(fD) && Float.isNaN(fD2)) || fD == fD2) {
                return true;
            }
        }
        return false;
    }

    @Override // p134m1.d
    public final int f() {
        char[] cArr;
        if (Float.isNaN(this.f22202e) && (cArr = this.f22198a) != null && cArr.length >= 1) {
            this.f22202e = Integer.parseInt(c());
        }
        return (int) this.f22202e;
    }

    @Override // p134m1.d
    public final int hashCode() {
        int iHashCode = super.hashCode() * 31;
        float f10 = this.f22202e;
        return iHashCode + (f10 != 0.0f ? Float.floatToIntBits(f10) : 0);
    }
}
