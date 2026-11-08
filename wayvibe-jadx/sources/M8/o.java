package M8;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class o implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f8416a;

    public static final Throwable a(Object obj) {
        if (obj instanceof n) {
            return ((n) obj).f8415a;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            return kotlin.jvm.internal.m.b(this.f8416a, ((o) obj).f8416a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f8416a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f8416a;
        if (obj instanceof n) {
            return ((n) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}
