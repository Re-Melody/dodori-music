package J;

/* JADX INFO: loaded from: classes.dex */
public final class e implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f6447a;

    public e(float f10) {
        this.f6447a = f10;
    }

    @Override // J.a
    public final float a(long j10, p028c1.b bVar) {
        return this.f6447a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && Float.compare(this.f6447a, ((e) obj).f6447a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f6447a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.f6447a + ".px)";
    }
}
