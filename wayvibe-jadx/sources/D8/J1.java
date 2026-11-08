package D8;

import B8.C0118e;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class J1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0118e f2266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final B8.e0 f2267b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final B8.h0 f2268c;

    public J1(B8.h0 h0Var, B8.e0 e0Var, C0118e c0118e) {
        p229v9.a.k(h0Var, "method");
        this.f2268c = h0Var;
        p229v9.a.k(e0Var, "headers");
        this.f2267b = e0Var;
        p229v9.a.k(c0118e, "callOptions");
        this.f2266a = c0118e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && J1.class == obj.getClass()) {
            J1 j10 = (J1) obj;
            if (p228v8.c.d(this.f2266a, j10.f2266a) && p228v8.c.d(this.f2267b, j10.f2267b) && p228v8.c.d(this.f2268c, j10.f2268c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2266a, this.f2267b, this.f2268c});
    }

    public final String toString() {
        return "[method=" + this.f2268c + " headers=" + this.f2267b + " callOptions=" + this.f2266a + "]";
    }
}
