package R;

import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final W3.b f10612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f10613b;

    public f(W3.b bVar, e eVar) {
        this.f10612a = bVar;
        this.f10613b = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return m.b(this.f10612a, fVar.f10612a) && m.b(this.f10613b, fVar.f10613b);
    }

    public final int hashCode() {
        return this.f10613b.hashCode() + (this.f10612a.hashCode() * 31);
    }

    public final String toString() {
        return "WindowAdaptiveInfo(windowSizeClass=" + this.f10612a + ", windowPosture=" + this.f10613b + ')';
    }
}
