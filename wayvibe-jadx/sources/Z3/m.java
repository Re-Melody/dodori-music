package Z3;

import K1.z0;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final V3.b f13641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z0 f13642b;

    public m(V3.b bVar, z0 _windowInsetsCompat) {
        kotlin.jvm.internal.m.f(_windowInsetsCompat, "_windowInsetsCompat");
        this.f13641a = bVar;
        this.f13642b = _windowInsetsCompat;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!m.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.m.d(obj, "null cannot be cast to non-null type androidx.window.layout.WindowMetrics");
        m mVar = (m) obj;
        return kotlin.jvm.internal.m.b(this.f13641a, mVar.f13641a) && kotlin.jvm.internal.m.b(this.f13642b, mVar.f13642b);
    }

    public final int hashCode() {
        return this.f13642b.hashCode() + (this.f13641a.hashCode() * 31);
    }

    public final String toString() {
        return "WindowMetrics( bounds=" + this.f13641a + ", windowInsetsCompat=" + this.f13642b + ')';
    }
}
