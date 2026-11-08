package p230w;

/* JADX INFO: renamed from: w.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2283p extends AbstractC2285s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f27757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f27758b;

    public C2283p(float f10, float f11) {
        this.f27757a = f10;
        this.f27758b = f11;
    }

    @Override // p230w.AbstractC2285s
    public final float a(int i10) {
        if (i10 == 0) {
            return this.f27757a;
        }
        if (i10 != 1) {
            return 0.0f;
        }
        return this.f27758b;
    }

    @Override // p230w.AbstractC2285s
    public final int b() {
        return 2;
    }

    @Override // p230w.AbstractC2285s
    public final AbstractC2285s c() {
        return new C2283p(0.0f, 0.0f);
    }

    @Override // p230w.AbstractC2285s
    public final void d() {
        this.f27757a = 0.0f;
        this.f27758b = 0.0f;
    }

    @Override // p230w.AbstractC2285s
    public final void e(float f10, int i10) {
        if (i10 == 0) {
            this.f27757a = f10;
        } else {
            if (i10 != 1) {
                return;
            }
            this.f27758b = f10;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2283p)) {
            return false;
        }
        C2283p c2283p = (C2283p) obj;
        return c2283p.f27757a == this.f27757a && c2283p.f27758b == this.f27758b;
    }

    public final int hashCode() {
        return Float.hashCode(this.f27758b) + (Float.hashCode(this.f27757a) * 31);
    }

    public final String toString() {
        return "AnimationVector2D: v1 = " + this.f27757a + ", v2 = " + this.f27758b;
    }
}
