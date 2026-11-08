package E;

/* JADX INFO: renamed from: E.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0334a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f2876a;

    public C0334a(float f10) {
        this.f2876a = f10;
        if (Float.compare(f10, 0) > 0) {
            return;
        }
        throw new IllegalArgumentException(("Provided min size " + ((Object) p028c1.e.b(f10)) + " should be larger than zero.").toString());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0334a) {
            return p028c1.e.a(this.f2876a, ((C0334a) obj).f2876a);
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f2876a);
    }
}
