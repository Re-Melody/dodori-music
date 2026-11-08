package p255y2;

import B2.AbstractC0111a;
import B2.C;
import android.util.Pair;

/* JADX INFO: loaded from: classes.dex */
public abstract class O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final L f28801a = new L();

    static {
        C.D(0);
        C.D(1);
        C.D(2);
    }

    public int a(boolean z10) {
        return p() ? -1 : 0;
    }

    public abstract int b(Object obj);

    public int c(boolean z10) {
        if (p()) {
            return -1;
        }
        return o() - 1;
    }

    public final int d(int i10, M m8, N n6, int i11, boolean z10) {
        int i12 = f(i10, m8, false).f28780c;
        if (m(i12, n6, 0L).f28799o != i10) {
            return i10 + 1;
        }
        int iE = e(i12, i11, z10);
        if (iE == -1) {
            return -1;
        }
        return m(iE, n6, 0L).f28798n;
    }

    public int e(int i10, int i11, boolean z10) {
        if (i11 == 0) {
            if (i10 == c(z10)) {
                return -1;
            }
            return i10 + 1;
        }
        if (i11 == 1) {
            return i10;
        }
        if (i11 == 2) {
            return i10 == c(z10) ? a(z10) : i10 + 1;
        }
        throw new IllegalStateException();
    }

    public final boolean equals(Object obj) {
        int iC;
        if (this != obj) {
            if (obj instanceof O) {
                O o10 = (O) obj;
                if (o10.o() == o() && o10.h() == h()) {
                    N n6 = new N();
                    M m8 = new M();
                    N n10 = new N();
                    M m10 = new M();
                    for (int i10 = 0; i10 < o(); i10++) {
                        if (m(i10, n6, 0L).equals(o10.m(i10, n10, 0L))) {
                        }
                    }
                    for (int i11 = 0; i11 < h(); i11++) {
                        if (f(i11, m8, true).equals(o10.f(i11, m10, true))) {
                        }
                    }
                    int iA = a(true);
                    if (iA == o10.a(true) && (iC = c(true)) == o10.c(true)) {
                        while (iA != iC) {
                            int iE = e(iA, 0, true);
                            if (iE == o10.e(iA, 0, true)) {
                                iA = iE;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public abstract M f(int i10, M m8, boolean z10);

    public M g(Object obj, M m8) {
        return f(b(obj), m8, true);
    }

    public abstract int h();

    public final int hashCode() {
        N n6 = new N();
        M m8 = new M();
        int iO = o() + 217;
        for (int i10 = 0; i10 < o(); i10++) {
            iO = (iO * 31) + m(i10, n6, 0L).hashCode();
        }
        int iH = h() + (iO * 31);
        for (int i11 = 0; i11 < h(); i11++) {
            iH = (iH * 31) + f(i11, m8, true).hashCode();
        }
        int iA = a(true);
        while (iA != -1) {
            iH = (iH * 31) + iA;
            iA = e(iA, 0, true);
        }
        return iH;
    }

    public final Pair i(N n6, M m8, int i10, long j10) {
        Pair pairJ = j(n6, m8, i10, j10, 0L);
        pairJ.getClass();
        return pairJ;
    }

    public final Pair j(N n6, M m8, int i10, long j10, long j11) {
        AbstractC0111a.f(i10, o());
        m(i10, n6, j11);
        if (j10 == -9223372036854775807L) {
            j10 = n6.f28796l;
            if (j10 == -9223372036854775807L) {
                return null;
            }
        }
        int i11 = n6.f28798n;
        f(i11, m8, false);
        while (i11 < n6.f28799o && m8.f28782e != j10) {
            int i12 = i11 + 1;
            if (f(i12, m8, false).f28782e > j10) {
                break;
            }
            i11 = i12;
        }
        f(i11, m8, true);
        long jMin = j10 - m8.f28782e;
        long j12 = m8.f28781d;
        if (j12 != -9223372036854775807L) {
            jMin = Math.min(jMin, j12 - 1);
        }
        long jMax = Math.max(0L, jMin);
        Object obj = m8.f28779b;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(jMax));
    }

    public int k(int i10, int i11, boolean z10) {
        if (i11 == 0) {
            if (i10 == a(z10)) {
                return -1;
            }
            return i10 - 1;
        }
        if (i11 == 1) {
            return i10;
        }
        if (i11 == 2) {
            return i10 == a(z10) ? c(z10) : i10 - 1;
        }
        throw new IllegalStateException();
    }

    public abstract Object l(int i10);

    public abstract N m(int i10, N n6, long j10);

    public final void n(int i10, N n6) {
        m(i10, n6, 0L);
    }

    public abstract int o();

    public final boolean p() {
        return o() == 0;
    }
}
