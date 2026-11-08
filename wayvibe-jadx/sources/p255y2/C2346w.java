package p255y2;

import A6.C;
import A6.E;
import A6.W;
import F.C0356a;
import J2.t;
import java.util.Collections;
import java.util.List;
import p134m1.b;

/* JADX INFO: renamed from: y2.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2346w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2343t f28984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C2342s f28985c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C2349z f28986d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final r f28987e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C2344u f28988f;

    static {
        C0356a c0356a = new C0356a();
        C c3 = E.f299b;
        W w10 = W.f329e;
        List list = Collections.EMPTY_LIST;
        W w11 = W.f329e;
        t tVar = new t();
        C2344u c2344u = C2344u.f28982a;
        c0356a.b();
        tVar.a();
        C2349z c2349z = C2349z.f29012y;
        b.y(0, 1, 2, 3, 4);
        B2.C.D(5);
    }

    public C2346w(String str, r rVar, C2343t c2343t, C2342s c2342s, C2349z c2349z, C2344u c2344u) {
        this.f28983a = str;
        this.f28984b = c2343t;
        this.f28985c = c2342s;
        this.f28986d = c2349z;
        this.f28987e = rVar;
        this.f28988f = c2344u;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2346w)) {
            return false;
        }
        C2346w c2346w = (C2346w) obj;
        return B2.C.a(this.f28983a, c2346w.f28983a) && this.f28987e.equals(c2346w.f28987e) && B2.C.a(this.f28984b, c2346w.f28984b) && this.f28985c.equals(c2346w.f28985c) && B2.C.a(this.f28986d, c2346w.f28986d) && B2.C.a(this.f28988f, c2346w.f28988f);
    }

    public final int hashCode() {
        int iHashCode = this.f28983a.hashCode() * 31;
        C2343t c2343t = this.f28984b;
        int iHashCode2 = (this.f28986d.hashCode() + ((this.f28987e.hashCode() + ((this.f28985c.hashCode() + ((iHashCode + (c2343t != null ? c2343t.hashCode() : 0)) * 31)) * 31)) * 31)) * 31;
        this.f28988f.getClass();
        return iHashCode2;
    }
}
