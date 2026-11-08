package T0;

/* JADX INFO: renamed from: T0.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0811n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f11528a;

    public final boolean equals(Object obj) {
        if (obj instanceof C0811n) {
            return kotlin.jvm.internal.m.b(this.f11528a, ((C0811n) obj).f11528a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f11528a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "AsyncTypefaceResult(result=" + this.f11528a + ')';
    }
}
