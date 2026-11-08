package p089i1;

import java.util.HashMap;
import kotlin.jvm.internal.m;
import p134m1.h;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f20466a;

    public p(h hVar) {
        this.f20466a = hVar;
        new HashMap();
        new HashMap();
        new HashMap();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!p.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        m.d(obj, "null cannot be cast to non-null type androidx.constraintlayout.compose.RawConstraintSet");
        return m.b(this.f20466a, ((p) obj).f20466a);
    }

    public final int hashCode() {
        return this.f20466a.hashCode();
    }
}
