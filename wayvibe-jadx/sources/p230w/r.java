package p230w;

import p134m1.b;

/* JADX INFO: loaded from: classes.dex */
public final class r extends AbstractC2285s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f27771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f27772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f27773c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f27774d;

    public r(float f10, float f11, float f12, float f13) {
        this.f27771a = f10;
        this.f27772b = f11;
        this.f27773c = f12;
        this.f27774d = f13;
    }

    @Override // p230w.AbstractC2285s
    public final float a(int i10) {
        if (i10 == 0) {
            return this.f27771a;
        }
        if (i10 == 1) {
            return this.f27772b;
        }
        if (i10 == 2) {
            return this.f27773c;
        }
        if (i10 != 3) {
            return 0.0f;
        }
        return this.f27774d;
    }

    @Override // p230w.AbstractC2285s
    public final int b() {
        return 4;
    }

    @Override // p230w.AbstractC2285s
    public final AbstractC2285s c() {
        return new r(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // p230w.AbstractC2285s
    public final void d() {
        this.f27771a = 0.0f;
        this.f27772b = 0.0f;
        this.f27773c = 0.0f;
        this.f27774d = 0.0f;
    }

    @Override // p230w.AbstractC2285s
    public final void e(float f10, int i10) {
        if (i10 == 0) {
            this.f27771a = f10;
            return;
        }
        if (i10 == 1) {
            this.f27772b = f10;
        } else if (i10 == 2) {
            this.f27773c = f10;
        } else {
            if (i10 != 3) {
                return;
            }
            this.f27774d = f10;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return rVar.f27771a == this.f27771a && rVar.f27772b == this.f27772b && rVar.f27773c == this.f27773c && rVar.f27774d == this.f27774d;
    }

    public final int hashCode() {
        return Float.hashCode(this.f27774d) + b.b(this.f27773c, b.b(this.f27772b, Float.hashCode(this.f27771a) * 31, 31), 31);
    }

    public final String toString() {
        return "AnimationVector4D: v1 = " + this.f27771a + ", v2 = " + this.f27772b + ", v3 = " + this.f27773c + ", v4 = " + this.f27774d;
    }
}
