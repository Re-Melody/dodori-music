package p220v;

import kotlin.jvm.internal.m;
import p230w.C;

/* JADX INFO: loaded from: classes.dex */
public final class O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C f27333a;

    public O(C c3) {
        this.f27333a = c3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O)) {
            return false;
        }
        O o10 = (O) obj;
        o10.getClass();
        return Float.compare(0.0f, 0.0f) == 0 && m.b(this.f27333a, o10.f27333a);
    }

    public final int hashCode() {
        return this.f27333a.hashCode() + (Float.hashCode(0.0f) * 31);
    }

    public final String toString() {
        return "Fade(alpha=0.0, animationSpec=" + this.f27333a + ')';
    }
}
