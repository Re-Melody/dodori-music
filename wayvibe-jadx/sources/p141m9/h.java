package p141m9;

import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final class h extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f22530a;

    public h(Throwable th) {
        this.f22530a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return m.b(this.f22530a, ((h) obj).f22530a);
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.f22530a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // p141m9.i
    public final String toString() {
        return "Closed(" + this.f22530a + ')';
    }
}
