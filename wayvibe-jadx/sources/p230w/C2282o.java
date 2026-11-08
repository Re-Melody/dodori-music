package p230w;

/* JADX INFO: renamed from: w.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2282o extends AbstractC2285s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f27754a;

    public C2282o(float f10) {
        this.f27754a = f10;
    }

    @Override // p230w.AbstractC2285s
    public final float a(int i10) {
        if (i10 == 0) {
            return this.f27754a;
        }
        return 0.0f;
    }

    @Override // p230w.AbstractC2285s
    public final int b() {
        return 1;
    }

    @Override // p230w.AbstractC2285s
    public final AbstractC2285s c() {
        return new C2282o(0.0f);
    }

    @Override // p230w.AbstractC2285s
    public final void d() {
        this.f27754a = 0.0f;
    }

    @Override // p230w.AbstractC2285s
    public final void e(float f10, int i10) {
        if (i10 == 0) {
            this.f27754a = f10;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C2282o) && ((C2282o) obj).f27754a == this.f27754a;
    }

    public final int hashCode() {
        return Float.hashCode(this.f27754a);
    }

    public final String toString() {
        return "AnimationVector1D: value = " + this.f27754a;
    }
}
