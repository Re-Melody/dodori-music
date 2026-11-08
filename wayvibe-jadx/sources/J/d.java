package J;

/* JADX INFO: loaded from: classes.dex */
public final class d implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f6446a;

    public d(float f10) {
        this.f6446a = f10;
        if (f10 < 0.0f || f10 > 100.0f) {
            throw new IllegalArgumentException("The percent should be in the range of [0, 100]");
        }
    }

    @Override // J.a
    public final float a(long j10, p028c1.b bVar) {
        return (this.f6446a / 100.0f) * p133m0.f.c(j10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && Float.compare(this.f6446a, ((d) obj).f6446a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f6446a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.f6446a + "%)";
    }
}
