package M8;

/* JADX INFO: loaded from: classes2.dex */
public final class A implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final short f8400a;

    public /* synthetic */ A(short s8) {
        this.f8400a = s8;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return kotlin.jvm.internal.m.g(this.f8400a & 65535, ((A) obj).f8400a & 65535);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof A) {
            return this.f8400a == ((A) obj).f8400a;
        }
        return false;
    }

    public final int hashCode() {
        return Short.hashCode(this.f8400a);
    }

    public final String toString() {
        return String.valueOf(65535 & this.f8400a);
    }
}
