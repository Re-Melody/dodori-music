package U;

/* JADX INFO: loaded from: classes.dex */
public final class N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f11772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f11773b;

    public N(Integer num, Object obj) {
        this.f11772a = num;
        this.f11773b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N)) {
            return false;
        }
        N n6 = (N) obj;
        return this.f11772a.equals(n6.f11772a) && kotlin.jvm.internal.m.b(this.f11773b, n6.f11773b);
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2 = this.f11772a.hashCode() * 31;
        Object obj = this.f11773b;
        if (obj instanceof Enum) {
            iHashCode = ((Enum) obj).ordinal();
        } else {
            iHashCode = obj != null ? obj.hashCode() : 0;
        }
        return iHashCode + iHashCode2;
    }

    public final String toString() {
        return "JoinedKey(left=" + this.f11772a + ", right=" + this.f11773b + ')';
    }
}
