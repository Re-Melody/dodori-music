package Aa;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f509b;

    public c(String str, Object obj) {
        this.f508a = str;
        this.f509b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            c cVar = (c) obj;
            if (!this.f508a.equals(cVar.f508a)) {
                return false;
            }
            Object obj2 = cVar.f509b;
            Object obj3 = this.f509b;
            if (obj3 != null) {
                return obj3 instanceof Object[] ? Arrays.deepEquals((Object[]) obj3, (Object[]) obj2) : obj3.equals(obj2);
            }
            if (obj2 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f508a.hashCode() * 31;
        Object obj = this.f509b;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        return String.format("%s: %s", this.f508a, this.f509b);
    }
}
