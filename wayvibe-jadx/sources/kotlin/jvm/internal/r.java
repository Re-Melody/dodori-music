package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class r implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f21867a;

    public r(Class jClass) {
        m.f(jClass, "jClass");
        this.f21867a = jClass;
    }

    @Override // kotlin.jvm.internal.d
    public final Class a() {
        return this.f21867a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            return m.b(this.f21867a, ((r) obj).f21867a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f21867a.hashCode();
    }

    public final String toString() {
        return this.f21867a.toString() + " (Kotlin reflection is not available)";
    }
}
