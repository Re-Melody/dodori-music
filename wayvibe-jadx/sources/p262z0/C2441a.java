package p262z0;

import V0.p;
import kotlin.jvm.internal.m;

/* JADX INFO: renamed from: z0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2441a implements n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f29733b;

    public C2441a(int i10) {
        this.f29733b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C2441a.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        m.d(obj, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIconType");
        return this.f29733b == ((C2441a) obj).f29733b;
    }

    public final int hashCode() {
        return this.f29733b;
    }

    public final String toString() {
        return p.q(new StringBuilder("AndroidPointerIcon(type="), this.f29733b, ')');
    }
}
