package p255y2;

import A6.C;
import A6.E;
import A6.W;
import F.C0356a;
import J2.t;
import android.net.Uri;
import java.util.Collections;
import java.util.List;
import p134m1.b;

/* JADX INFO: loaded from: classes.dex */
public final class N {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Object f28785q = new Object();
    public static final C2346w r;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f28787b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f28789d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f28790e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f28791f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f28792g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f28793h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f28794i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public C2342s f28795j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f28796l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f28797m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f28798n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f28799o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f28800p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f28786a = f28785q;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C2346w f28788c = r;

    static {
        C0356a c0356a = new C0356a();
        C c3 = E.f299b;
        W w10 = W.f329e;
        List list = Collections.EMPTY_LIST;
        W w11 = W.f329e;
        t tVar = new t();
        C2344u c2344u = C2344u.f28982a;
        Uri uri = Uri.EMPTY;
        r = new C2346w("androidx.media3.common.Timeline", new r(c0356a), uri != null ? new C2343t(uri, null, null, list, null, w11, null, -9223372036854775807L) : null, new C2342s(tVar), C2349z.f29012y, c2344u);
        b.y(1, 2, 3, 4, 5);
        b.y(6, 7, 8, 9, 10);
        B2.C.D(11);
        B2.C.D(12);
        B2.C.D(13);
    }

    public final boolean a() {
        return this.f28795j != null;
    }

    public final void b(C2346w c2346w, Object obj, long j10, long j11, long j12, boolean z10, boolean z11, C2342s c2342s, long j13, long j14, int i10, long j15) {
        C2343t c2343t;
        this.f28786a = f28785q;
        this.f28788c = c2346w != null ? c2346w : r;
        this.f28787b = (c2346w == null || (c2343t = c2346w.f28984b) == null) ? null : c2343t.f28980f;
        this.f28789d = obj;
        this.f28790e = j10;
        this.f28791f = j11;
        this.f28792g = j12;
        this.f28793h = z10;
        this.f28794i = z11;
        this.f28795j = c2342s;
        this.f28796l = j13;
        this.f28797m = j14;
        this.f28798n = 0;
        this.f28799o = i10;
        this.f28800p = j15;
        this.k = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !N.class.equals(obj.getClass())) {
            return false;
        }
        N n6 = (N) obj;
        return B2.C.a(this.f28786a, n6.f28786a) && B2.C.a(this.f28788c, n6.f28788c) && B2.C.a(this.f28789d, n6.f28789d) && B2.C.a(this.f28795j, n6.f28795j) && this.f28790e == n6.f28790e && this.f28791f == n6.f28791f && this.f28792g == n6.f28792g && this.f28793h == n6.f28793h && this.f28794i == n6.f28794i && this.k == n6.k && this.f28796l == n6.f28796l && this.f28797m == n6.f28797m && this.f28798n == n6.f28798n && this.f28799o == n6.f28799o && this.f28800p == n6.f28800p;
    }

    public final int hashCode() {
        int iHashCode = (this.f28788c.hashCode() + ((this.f28786a.hashCode() + 217) * 31)) * 31;
        Object obj = this.f28789d;
        int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        C2342s c2342s = this.f28795j;
        int iHashCode3 = (iHashCode2 + (c2342s != null ? c2342s.hashCode() : 0)) * 31;
        long j10 = this.f28790e;
        int i10 = (iHashCode3 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f28791f;
        int i11 = (i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        long j12 = this.f28792g;
        int i12 = (((((((i11 + ((int) (j12 ^ (j12 >>> 32)))) * 31) + (this.f28793h ? 1 : 0)) * 31) + (this.f28794i ? 1 : 0)) * 31) + (this.k ? 1 : 0)) * 31;
        long j13 = this.f28796l;
        int i13 = (i12 + ((int) (j13 ^ (j13 >>> 32)))) * 31;
        long j14 = this.f28797m;
        int i14 = (((((i13 + ((int) (j14 ^ (j14 >>> 32)))) * 31) + this.f28798n) * 31) + this.f28799o) * 31;
        long j15 = this.f28800p;
        return i14 + ((int) (j15 ^ (j15 >>> 32)));
    }
}
