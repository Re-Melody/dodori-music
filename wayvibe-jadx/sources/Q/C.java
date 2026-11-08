package Q;

/* JADX INFO: loaded from: classes.dex */
public final class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f9800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f9801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f9802c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f9803d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f9804e;

    public C(float f10, float f11, float f12, float f13, float f14) {
        this.f9800a = f10;
        this.f9801b = f11;
        this.f9802c = f12;
        this.f9803d = f13;
        this.f9804e = f14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C)) {
            return false;
        }
        C c3 = (C) obj;
        return p028c1.e.a(this.f9800a, c3.f9800a) && p028c1.e.a(this.f9801b, c3.f9801b) && p028c1.e.a(this.f9802c, c3.f9802c) && p028c1.e.a(this.f9803d, c3.f9803d) && p028c1.e.a(this.f9804e, c3.f9804e);
    }

    public final int hashCode() {
        return Float.hashCode(this.f9804e) + p134m1.b.b(this.f9803d, p134m1.b.b(this.f9802c, p134m1.b.b(this.f9801b, Float.hashCode(this.f9800a) * 31, 31), 31), 31);
    }
}
