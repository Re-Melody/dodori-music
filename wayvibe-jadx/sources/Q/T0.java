package Q;

/* JADX INFO: loaded from: classes.dex */
public final class T0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final M0 f9972b;

    public T0(String str, M0 m8) {
        this.f9971a = str;
        this.f9972b = m8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || T0.class != obj.getClass()) {
            return false;
        }
        T0 t10 = (T0) obj;
        return kotlin.jvm.internal.m.b(this.f9971a, t10.f9971a) && this.f9972b == t10.f9972b;
    }

    public final int hashCode() {
        return this.f9972b.hashCode() + p134m1.b.f(this.f9971a.hashCode() * 961, 31, false);
    }
}
