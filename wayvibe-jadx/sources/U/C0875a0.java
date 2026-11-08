package U;

/* JADX INFO: renamed from: U.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0875a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p199t.y f11841a;

    public final boolean equals(Object obj) {
        if (obj instanceof C0875a0) {
            return kotlin.jvm.internal.m.b(this.f11841a, ((C0875a0) obj).f11841a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f11841a.hashCode();
    }

    public final String toString() {
        return "MutableScatterMultiMap(map=" + this.f11841a + ')';
    }
}
