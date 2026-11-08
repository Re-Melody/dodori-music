package p179q7;

import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f f25684b = new f(new HashSet());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f25685a;

    public f(HashSet hashSet) {
        this.f25685a = hashSet;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        return this.f25685a.equals(((f) obj).f25685a);
    }

    public final int hashCode() {
        return this.f25685a.hashCode();
    }

    public final String toString() {
        return "FieldMask{mask=" + this.f25685a.toString() + "}";
    }
}
