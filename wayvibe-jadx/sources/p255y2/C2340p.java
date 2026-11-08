package p255y2;

import B2.C;

/* JADX INFO: renamed from: y2.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2340p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f28968b;

    static {
        C.D(0);
        C.D(1);
    }

    public C2340p(String str, String str2) {
        this.f28967a = C.J(str);
        this.f28968b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2340p.class == obj.getClass()) {
            C2340p c2340p = (C2340p) obj;
            if (C.a(this.f28967a, c2340p.f28967a) && C.a(this.f28968b, c2340p.f28968b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f28968b.hashCode() * 31;
        String str = this.f28967a;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
