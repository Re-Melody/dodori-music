package O0;

/* JADX INFO: loaded from: classes.dex */
public final class J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final E f8886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final E f8887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final E f8888c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final E f8889d;

    public J(E e2, E e4, E e7, E e10) {
        this.f8886a = e2;
        this.f8887b = e4;
        this.f8888c = e7;
        this.f8889d = e10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof J)) {
            return false;
        }
        J j10 = (J) obj;
        return kotlin.jvm.internal.m.b(this.f8886a, j10.f8886a) && kotlin.jvm.internal.m.b(this.f8887b, j10.f8887b) && kotlin.jvm.internal.m.b(this.f8888c, j10.f8888c) && kotlin.jvm.internal.m.b(this.f8889d, j10.f8889d);
    }

    public final int hashCode() {
        E e2 = this.f8886a;
        int iHashCode = (e2 != null ? e2.hashCode() : 0) * 31;
        E e4 = this.f8887b;
        int iHashCode2 = (iHashCode + (e4 != null ? e4.hashCode() : 0)) * 31;
        E e7 = this.f8888c;
        int iHashCode3 = (iHashCode2 + (e7 != null ? e7.hashCode() : 0)) * 31;
        E e10 = this.f8889d;
        return iHashCode3 + (e10 != null ? e10.hashCode() : 0);
    }
}
