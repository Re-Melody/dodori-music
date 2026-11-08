package R2;

import p255y2.C2326b;

/* JADX INFO: renamed from: R2.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0777e extends AbstractC0791t {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f10817c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f10818d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f10819e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f10820f;

    public C0777e(p255y2.O o10, long j10, long j11) throws C0778f {
        super(o10);
        boolean z10 = false;
        if (o10.h() != 1) {
            throw new C0778f(0);
        }
        p255y2.N nM = o10.m(0, new p255y2.N(), 0L);
        long jMax = Math.max(0L, j10);
        if (!nM.k && jMax != 0 && !nM.f28793h) {
            throw new C0778f(1);
        }
        long jMax2 = j11 == Long.MIN_VALUE ? nM.f28797m : Math.max(0L, j11);
        long j12 = nM.f28797m;
        if (j12 != -9223372036854775807L) {
            jMax2 = jMax2 > j12 ? j12 : jMax2;
            if (jMax > jMax2) {
                throw new C0778f(2);
            }
        }
        this.f10817c = jMax;
        this.f10818d = jMax2;
        this.f10819e = jMax2 != -9223372036854775807L ? jMax2 - jMax : -9223372036854775807L;
        if (nM.f28794i && (jMax2 == -9223372036854775807L || (j12 != -9223372036854775807L && jMax2 == j12))) {
            z10 = true;
        }
        this.f10820f = z10;
    }

    @Override // R2.AbstractC0791t, p255y2.O
    public final p255y2.M f(int i10, p255y2.M m8, boolean z10) {
        this.f10868b.f(0, m8, z10);
        long j10 = m8.f28782e - this.f10817c;
        long j11 = this.f10819e;
        long j12 = j11 != -9223372036854775807L ? j11 - j10 : -9223372036854775807L;
        Object obj = m8.f28778a;
        Object obj2 = m8.f28779b;
        C2326b c2326b = C2326b.f28865c;
        m8.f28778a = obj;
        m8.f28779b = obj2;
        m8.f28780c = 0;
        m8.f28781d = j12;
        m8.f28782e = j10;
        m8.f28784g = c2326b;
        m8.f28783f = false;
        return m8;
    }

    @Override // R2.AbstractC0791t, p255y2.O
    public final p255y2.N m(int i10, p255y2.N n6, long j10) {
        this.f10868b.m(0, n6, 0L);
        long j11 = n6.f28800p;
        long j12 = this.f10817c;
        n6.f28800p = j11 + j12;
        n6.f28797m = this.f10819e;
        n6.f28794i = this.f10820f;
        long j13 = n6.f28796l;
        if (j13 != -9223372036854775807L) {
            long jMax = Math.max(j13, j12);
            n6.f28796l = jMax;
            long j14 = this.f10818d;
            if (j14 != -9223372036854775807L) {
                jMax = Math.min(jMax, j14);
            }
            n6.f28796l = jMax - j12;
        }
        long jT = B2.C.T(j12);
        long j15 = n6.f28790e;
        if (j15 != -9223372036854775807L) {
            n6.f28790e = j15 + jT;
        }
        long j16 = n6.f28791f;
        if (j16 != -9223372036854775807L) {
            n6.f28791f = j16 + jT;
        }
        return n6;
    }
}
