package p235w4;

import X4.a;
import android.util.Pair;

/* JADX INFO: loaded from: classes.dex */
public abstract class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final B f27894a = new y();

    public abstract int a();

    public int a(int i10, int i11, boolean z10) {
        if (i11 == 0) {
            if (i10 == a(z10)) {
                return -1;
            }
            return i10 + 1;
        }
        if (i11 == 1) {
            return i10;
        }
        if (i11 == 2) {
            return i10 == a(z10) ? b(z10) : i10 + 1;
        }
        throw new IllegalStateException();
    }

    public abstract int a(Object obj);

    public abstract A a(int i10, A a10, boolean z10, long j10);

    public abstract z a(int i10, z zVar, boolean z10);

    public abstract int b();

    public int b(boolean z10) {
        return c() ? -1 : 0;
    }

    public final boolean c() {
        return a() == 0;
    }

    public final boolean b(int i10, z zVar, A a10, int i11, boolean z10) {
        return a(i10, zVar, a10, i11, z10) == -1;
    }

    public int a(boolean z10) {
        if (c()) {
            return -1;
        }
        return a() - 1;
    }

    public final A a(int i10, A a10) {
        return a(i10, a10, false);
    }

    public final A a(int i10, A a10, boolean z10) {
        return a(i10, a10, z10, 0L);
    }

    public final int a(int i10, z zVar, A a10, int i11, boolean z10) {
        int i12 = a(i10, zVar).f28041c;
        if (a(i12, a10).f27890e != i10) {
            return i10 + 1;
        }
        int iA = a(i12, i11, z10);
        if (iA == -1) {
            return -1;
        }
        return a(iA, a10).f27889d;
    }

    public final z a(int i10, z zVar) {
        return a(i10, zVar, false);
    }

    public final Pair<Integer, Long> a(A a10, z zVar, int i10, long j10) {
        return a(a10, zVar, i10, j10, 0L);
    }

    public final Pair<Integer, Long> a(A a10, z zVar, int i10, long j10, long j11) {
        a.h(i10, a());
        a(i10, a10, false, j11);
        if (j10 == -9223372036854775807L) {
            j10 = a10.f27891f;
            if (j10 == -9223372036854775807L) {
                return null;
            }
        }
        int i11 = a10.f27889d;
        long j12 = a10.f27893h + j10;
        long j13 = a(i11, zVar).f28042d;
        while (j13 != -9223372036854775807L && j12 >= j13 && i11 < a10.f27890e) {
            j12 -= j13;
            i11++;
            j13 = a(i11, zVar).f28042d;
        }
        return Pair.create(Integer.valueOf(i11), Long.valueOf(j12));
    }
}
