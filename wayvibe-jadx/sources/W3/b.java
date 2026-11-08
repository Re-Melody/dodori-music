package W3;

import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f12784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f12785b;

    public b(c cVar, a aVar) {
        this.f12784a = cVar;
        this.f12785b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!b.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        m.d(obj, "null cannot be cast to non-null type androidx.window.core.layout.WindowSizeClass");
        b bVar = (b) obj;
        return m.b(this.f12784a, bVar.f12784a) && m.b(this.f12785b, bVar.f12785b);
    }

    public final int hashCode() {
        return (this.f12784a.f12789a * 31) + this.f12785b.f12783a;
    }

    public final String toString() {
        return "WindowSizeClass {windowWidthSizeClass=" + this.f12784a + ", windowHeightSizeClass=" + this.f12785b + " }";
    }
}
