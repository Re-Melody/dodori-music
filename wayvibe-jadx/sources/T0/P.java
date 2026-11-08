package T0;

/* JADX INFO: loaded from: classes.dex */
public final class P implements InterfaceC0816t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final I f11470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f11471c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final H f11472d;

    public P(int i10, I i11, int i12, H h10) {
        this.f11469a = i10;
        this.f11470b = i11;
        this.f11471c = i12;
        this.f11472d = h10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P)) {
            return false;
        }
        P p10 = (P) obj;
        return this.f11469a == p10.f11469a && kotlin.jvm.internal.m.b(this.f11470b, p10.f11470b) && this.f11471c == p10.f11471c && this.f11472d.equals(p10.f11472d);
    }

    @Override // T0.InterfaceC0816t
    /* JADX INFO: renamed from: getLoadingStrategy-PKNRLFQ, reason: not valid java name */
    public final int mo8getLoadingStrategyPKNRLFQ() {
        return 0;
    }

    @Override // T0.InterfaceC0816t
    /* JADX INFO: renamed from: getStyle-_-LCdwA, reason: not valid java name */
    public final int mo9getStyle_LCdwA() {
        return this.f11471c;
    }

    @Override // T0.InterfaceC0816t
    public final I getWeight() {
        return this.f11470b;
    }

    public final int hashCode() {
        return this.f11472d.f11450a.hashCode() + p134m1.b.c(0, p134m1.b.c(this.f11471c, ((this.f11469a * 31) + this.f11470b.f11463a) * 31, 31), 31);
    }

    public final String toString() {
        return "ResourceFont(resId=" + this.f11469a + ", weight=" + this.f11470b + ", style=" + ((Object) C.a(this.f11471c)) + ", loadingStrategy=Blocking)";
    }
}
