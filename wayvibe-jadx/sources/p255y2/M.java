package p255y2;

import B2.C;
import p134m1.b;

/* JADX INFO: loaded from: classes.dex */
public final class M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f28778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f28779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f28780c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f28781d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f28782e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f28783f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C2326b f28784g = C2326b.f28865c;

    static {
        b.y(0, 1, 2, 3, 4);
    }

    public final long a(int i10, int i11) {
        C2325a c2325aA = this.f28784g.a(i10);
        if (c2325aA.f28859a != -1) {
            return c2325aA.f28864f[i11];
        }
        return -9223372036854775807L;
    }

    public final int b(long j10) {
        int i10;
        C2325a c2325aA;
        int i11;
        C2326b c2326b = this.f28784g;
        long j11 = this.f28781d;
        c2326b.getClass();
        if (j10 != Long.MIN_VALUE && (j11 == -9223372036854775807L || j10 < j11)) {
            int i12 = 0;
            while (true) {
                i10 = c2326b.f28867a;
                if (i12 >= i10) {
                    break;
                }
                c2326b.a(i12).getClass();
                c2326b.a(i12).getClass();
                if (0 > j10 && ((i11 = (c2325aA = c2326b.a(i12)).f28859a) == -1 || c2325aA.a(-1) < i11)) {
                    break;
                }
                i12++;
            }
            if (i12 < i10) {
                return i12;
            }
        }
        return -1;
    }

    public final int c(long j10) {
        C2326b c2326b = this.f28784g;
        int i10 = c2326b.f28867a - 1;
        c2326b.b(i10);
        while (i10 >= 0 && j10 != Long.MIN_VALUE) {
            c2326b.a(i10).getClass();
            if (j10 >= 0) {
                break;
            }
            i10--;
        }
        if (i10 >= 0) {
            C2325a c2325aA = c2326b.a(i10);
            int i11 = c2325aA.f28859a;
            if (i11 != -1) {
                for (int i12 = 0; i12 < i11; i12++) {
                    int i13 = c2325aA.f28863e[i12];
                    if (i13 != 0 && i13 != 1) {
                    }
                }
            }
            return i10;
        }
        return -1;
    }

    public final long d(int i10) {
        this.f28784g.a(i10).getClass();
        return 0L;
    }

    public final int e(int i10) {
        return this.f28784g.a(i10).a(-1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !M.class.equals(obj.getClass())) {
            return false;
        }
        M m8 = (M) obj;
        return C.a(this.f28778a, m8.f28778a) && C.a(this.f28779b, m8.f28779b) && this.f28780c == m8.f28780c && this.f28781d == m8.f28781d && this.f28782e == m8.f28782e && this.f28783f == m8.f28783f && C.a(this.f28784g, m8.f28784g);
    }

    public final boolean f(int i10) {
        C2326b c2326b = this.f28784g;
        if (i10 != c2326b.f28867a - 1) {
            return false;
        }
        c2326b.b(i10);
        return false;
    }

    public final boolean g(int i10) {
        this.f28784g.a(i10).getClass();
        return false;
    }

    public final int hashCode() {
        Object obj = this.f28778a;
        int iHashCode = (217 + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.f28779b;
        int iHashCode2 = (((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.f28780c) * 31;
        long j10 = this.f28781d;
        int i10 = (iHashCode2 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f28782e;
        return this.f28784g.hashCode() + ((((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f28783f ? 1 : 0)) * 31);
    }
}
