package F8;

import E9.C0351l;
import V0.p;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0351l f4569d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C0351l f4570e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C0351l f4571f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C0351l f4572g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C0351l f4573h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0351l f4574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0351l f4575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f4576c;

    static {
        C0351l c0351l = C0351l.f3388d;
        f4569d = p217u7.d.l(":status");
        f4570e = p217u7.d.l(":method");
        f4571f = p217u7.d.l(":path");
        f4572g = p217u7.d.l(":scheme");
        f4573h = p217u7.d.l(":authority");
        p217u7.d.l(":host");
        p217u7.d.l(":version");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(C0351l c0351l, String str) {
        this(c0351l, p217u7.d.l(str));
        C0351l c0351l2 = C0351l.f3388d;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f4574a.equals(bVar.f4574a) && this.f4575b.equals(bVar.f4575b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f4575b.hashCode() + ((this.f4574a.hashCode() + 527) * 31);
    }

    public final String toString() {
        return p.B(this.f4574a.A(), ": ", this.f4575b.A());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(String str, String str2) {
        this(p217u7.d.l(str), p217u7.d.l(str2));
        C0351l c0351l = C0351l.f3388d;
    }

    public b(C0351l c0351l, C0351l c0351l2) {
        this.f4574a = c0351l;
        this.f4575b = c0351l2;
        this.f4576c = c0351l2.k() + c0351l.k() + 32;
    }
}
