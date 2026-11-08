package M8;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class l implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f8413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f8414b;

    public l(Object obj, Object obj2) {
        this.f8413a = obj;
        this.f8414b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return kotlin.jvm.internal.m.b(this.f8413a, lVar.f8413a) && kotlin.jvm.internal.m.b(this.f8414b, lVar.f8414b);
    }

    public final int hashCode() {
        Object obj = this.f8413a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f8414b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f8413a + ", " + this.f8414b + ')';
    }
}
