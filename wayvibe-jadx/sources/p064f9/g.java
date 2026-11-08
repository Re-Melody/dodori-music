package p064f9;

/* JADX INFO: loaded from: classes2.dex */
public final class g extends e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g f19899d = new g(1, 0, 1);

    @Override // p064f9.e
    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        if (isEmpty() && ((g) obj).isEmpty()) {
            return true;
        }
        g gVar = (g) obj;
        if (this.f19892a == gVar.f19892a) {
            return this.f19893b == gVar.f19893b;
        }
        return false;
    }

    @Override // p064f9.e
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f19892a * 31) + this.f19893b;
    }

    @Override // p064f9.e
    public final boolean isEmpty() {
        return this.f19892a > this.f19893b;
    }

    @Override // p064f9.e
    public final String toString() {
        return this.f19892a + ".." + this.f19893b;
    }
}
