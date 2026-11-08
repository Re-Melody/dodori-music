package M8;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class r implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f8423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f8424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f8425c;

    public r(Object obj, Object obj2, Object obj3) {
        this.f8423a = obj;
        this.f8424b = obj2;
        this.f8425c = obj3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return kotlin.jvm.internal.m.b(this.f8423a, rVar.f8423a) && kotlin.jvm.internal.m.b(this.f8424b, rVar.f8424b) && kotlin.jvm.internal.m.b(this.f8425c, rVar.f8425c);
    }

    public final int hashCode() {
        Object obj = this.f8423a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f8424b;
        int iHashCode2 = (iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.f8425c;
        return iHashCode2 + (obj3 != null ? obj3.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f8423a + ", " + this.f8424b + ", " + this.f8425c + ')';
    }
}
