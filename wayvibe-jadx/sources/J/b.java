package J;

/* JADX INFO: loaded from: classes.dex */
public final class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f6444a;

    public b(float f10) {
        this.f6444a = f10;
    }

    @Override // J.a
    public final float a(long j10, p028c1.b bVar) {
        return bVar.O(this.f6444a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && p028c1.e.a(this.f6444a, ((b) obj).f6444a);
    }

    public final int hashCode() {
        return Float.hashCode(this.f6444a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.f6444a + ".dp)";
    }
}
