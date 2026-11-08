package p140m7;

import com.amazon.a.a.o.b.f;
import p170p7.n;

/* JADX INFO: renamed from: m7.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2055g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EnumC2054f f22454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f22455b;

    public C2055g(EnumC2054f enumC2054f, n nVar) {
        this.f22454a = enumC2054f;
        this.f22455b = nVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2055g)) {
            return false;
        }
        C2055g c2055g = (C2055g) obj;
        return this.f22454a.equals(c2055g.f22454a) && this.f22455b.equals(c2055g.f22455b);
    }

    public final int hashCode() {
        int iHashCode = (this.f22454a.hashCode() + 1891) * 31;
        n nVar = this.f22455b;
        return nVar.f25273e.hashCode() + ((nVar.f25269a.f25264a.hashCode() + iHashCode) * 31);
    }

    public final String toString() {
        return "DocumentViewChange(" + this.f22455b + f.f16451a + this.f22454a + ")";
    }
}
