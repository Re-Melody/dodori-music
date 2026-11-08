package N;

import D7.W;
import K.Y;
import O0.C0673b;
import O0.L;
import O0.s;
import T0.InterfaceC0817u;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f8463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public L f8464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InterfaceC0817u f8465c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f8466d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f8467e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f8468f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f8469g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public p028c1.b f8471i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public C0673b f8472j;
    public boolean k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public b f8474m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public s f8475n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public p028c1.k f8476o;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f8470h = a.f8436a;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f8473l = p025b9.a.f(0, 0);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f8477p = W.t(0, 0, 0, 0);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f8478q = -1;
    public int r = -1;

    public e(String str, L l10, InterfaceC0817u interfaceC0817u, int i10, boolean z10, int i11, int i12) {
        this.f8463a = str;
        this.f8464b = l10;
        this.f8465c = interfaceC0817u;
        this.f8466d = i10;
        this.f8467e = z10;
        this.f8468f = i11;
        this.f8469g = i12;
    }

    public final int a(int i10, p028c1.k kVar) {
        int i11 = this.f8478q;
        int i12 = this.r;
        if (i10 == i11 && i11 != -1) {
            return i12;
        }
        int iN = Y.n(b(W.a(0, i10, 0, com.google.android.gms.common.api.f.API_PRIORITY_OTHER), kVar).l());
        this.f8478q = i10;
        this.r = iN;
        return iN;
    }

    public final C0673b b(long j10, p028c1.k kVar) {
        s sVarD = d(kVar);
        long jW = S5.d.w(j10, this.f8467e, this.f8466d, sVarD.d());
        boolean z10 = this.f8467e;
        int i10 = this.f8466d;
        int i11 = this.f8468f;
        return new C0673b((X0.c) sVarD, ((z10 || i10 != 2) && i11 >= 1) ? i11 : 1, i10 == 2, jW);
    }

    public final void c(p028c1.b bVar) {
        long jA;
        p028c1.b bVar2 = this.f8471i;
        if (bVar != null) {
            int i10 = a.f8437b;
            jA = a.a(bVar.a(), bVar.K());
        } else {
            jA = a.f8436a;
        }
        if (bVar2 == null) {
            this.f8471i = bVar;
            this.f8470h = jA;
            return;
        }
        if (bVar == null || this.f8470h != jA) {
            this.f8471i = bVar;
            this.f8470h = jA;
            this.f8472j = null;
            this.f8475n = null;
            this.f8476o = null;
            this.f8478q = -1;
            this.r = -1;
            this.f8477p = W.t(0, 0, 0, 0);
            this.f8473l = p025b9.a.f(0, 0);
            this.k = false;
        }
    }

    public final s d(p028c1.k kVar) {
        s cVar = this.f8475n;
        if (cVar == null || kVar != this.f8476o || cVar.a()) {
            this.f8476o = kVar;
            String str = this.f8463a;
            L lM = S5.d.M(this.f8464b, kVar);
            p028c1.b bVar = this.f8471i;
            m.c(bVar);
            InterfaceC0817u interfaceC0817u = this.f8465c;
            N8.s sVar = N8.s.f8650a;
            cVar = new X0.c(str, lM, sVar, sVar, interfaceC0817u, bVar);
        }
        this.f8475n = cVar;
        return cVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphLayoutCache(paragraph=");
        sb.append(this.f8472j != null ? "<paragraph>" : "null");
        sb.append(", lastDensity=");
        long j10 = this.f8470h;
        int i10 = a.f8437b;
        sb.append((Object) ("InlineDensity(density=" + Float.intBitsToFloat((int) (j10 >> 32)) + ", fontScale=" + Float.intBitsToFloat((int) (j10 & 4294967295L)) + ')'));
        sb.append(')');
        return sb.toString();
    }
}
