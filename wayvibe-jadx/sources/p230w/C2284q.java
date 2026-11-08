package p230w;

import p134m1.b;

/* JADX INFO: renamed from: w.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2284q extends AbstractC2285s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f27768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f27769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f27770c;

    public C2284q(float f10, float f11, float f12) {
        this.f27768a = f10;
        this.f27769b = f11;
        this.f27770c = f12;
    }

    @Override // p230w.AbstractC2285s
    public final float a(int i10) {
        if (i10 == 0) {
            return this.f27768a;
        }
        if (i10 == 1) {
            return this.f27769b;
        }
        if (i10 != 2) {
            return 0.0f;
        }
        return this.f27770c;
    }

    @Override // p230w.AbstractC2285s
    public final int b() {
        return 3;
    }

    @Override // p230w.AbstractC2285s
    public final AbstractC2285s c() {
        return new C2284q(0.0f, 0.0f, 0.0f);
    }

    @Override // p230w.AbstractC2285s
    public final void d() {
        this.f27768a = 0.0f;
        this.f27769b = 0.0f;
        this.f27770c = 0.0f;
    }

    @Override // p230w.AbstractC2285s
    public final void e(float f10, int i10) {
        if (i10 == 0) {
            this.f27768a = f10;
        } else if (i10 == 1) {
            this.f27769b = f10;
        } else {
            if (i10 != 2) {
                return;
            }
            this.f27770c = f10;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2284q)) {
            return false;
        }
        C2284q c2284q = (C2284q) obj;
        return c2284q.f27768a == this.f27768a && c2284q.f27769b == this.f27769b && c2284q.f27770c == this.f27770c;
    }

    public final int hashCode() {
        return Float.hashCode(this.f27770c) + b.b(this.f27769b, Float.hashCode(this.f27768a) * 31, 31);
    }

    public final String toString() {
        return "AnimationVector3D: v1 = " + this.f27768a + ", v2 = " + this.f27769b + ", v3 = " + this.f27770c;
    }
}
