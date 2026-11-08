package p143n0;

import kotlin.jvm.internal.m;
import p133m0.d;

/* JADX INFO: loaded from: classes.dex */
public final class O extends Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f22716a;

    public O(d dVar) {
        this.f22716a = dVar;
    }

    @Override // p143n0.Q
    public final d a() {
        return this.f22716a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof O) {
            return m.b(this.f22716a, ((O) obj).f22716a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f22716a.hashCode();
    }
}
