package p028c1;

import B2.AbstractC0112b;
import D7.W;
import S5.d;
import V0.p;
import com.google.android.gms.common.api.f;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f15843a;

    public /* synthetic */ a(long j10) {
        this.f15843a = j10;
    }

    public static long a(long j10, int i10, int i11, int i12, int i13, int i14) {
        if ((i14 & 1) != 0) {
            i10 = j(j10);
        }
        if ((i14 & 2) != 0) {
            i11 = h(j10);
        }
        if ((i14 & 4) != 0) {
            i12 = i(j10);
        }
        if ((i14 & 8) != 0) {
            i13 = g(j10);
        }
        if (!(i12 >= 0 && i10 >= 0)) {
            d.Q("minHeight(" + i12 + ") and minWidth(" + i10 + ") must be >= 0");
            throw null;
        }
        if (!(i11 >= i10)) {
            d.Q("maxWidth(" + i11 + ") must be >= minWidth(" + i10 + ')');
            throw null;
        }
        if (i13 >= i12) {
            return W.t(i10, i11, i12, i13);
        }
        d.Q("maxHeight(" + i13 + ") must be >= minHeight(" + i12 + ')');
        throw null;
    }

    public static final boolean b(long j10, long j11) {
        return j10 == j11;
    }

    public static final boolean c(long j10) {
        int i10 = (int) (3 & j10);
        int i11 = (((i10 & 2) >> 1) * 3) + ((i10 & 1) << 1);
        return (((int) (j10 >> (i11 + 46))) & ((1 << (18 - i11)) - 1)) != 0;
    }

    public static final boolean d(long j10) {
        int i10 = (int) (3 & j10);
        return (((int) (j10 >> 33)) & ((1 << p.A((i10 & 2) >> 1, 3, (i10 & 1) << 1, 13)) - 1)) != 0;
    }

    public static final boolean e(long j10) {
        int i10 = (int) (3 & j10);
        int i11 = (((i10 & 2) >> 1) * 3) + ((i10 & 1) << 1);
        int i12 = (1 << (18 - i11)) - 1;
        int i13 = ((int) (j10 >> (i11 + 15))) & i12;
        int i14 = ((int) (j10 >> (i11 + 46))) & i12;
        return i13 == (i14 == 0 ? f.API_PRIORITY_OTHER : i14 - 1);
    }

    public static final boolean f(long j10) {
        int i10 = (int) (3 & j10);
        int iA = (1 << p.A((i10 & 2) >> 1, 3, (i10 & 1) << 1, 13)) - 1;
        int i11 = ((int) (j10 >> 2)) & iA;
        int i12 = ((int) (j10 >> 33)) & iA;
        return i11 == (i12 == 0 ? f.API_PRIORITY_OTHER : i12 - 1);
    }

    public static final int g(long j10) {
        int i10 = (int) (3 & j10);
        int i11 = (((i10 & 2) >> 1) * 3) + ((i10 & 1) << 1);
        int i12 = ((int) (j10 >> (i11 + 46))) & ((1 << (18 - i11)) - 1);
        return i12 == 0 ? f.API_PRIORITY_OTHER : i12 - 1;
    }

    public static final int h(long j10) {
        int i10 = (int) (3 & j10);
        int iA = ((int) (j10 >> 33)) & ((1 << p.A((i10 & 2) >> 1, 3, (i10 & 1) << 1, 13)) - 1);
        return iA == 0 ? f.API_PRIORITY_OTHER : iA - 1;
    }

    public static final int i(long j10) {
        int i10 = (int) (3 & j10);
        int i11 = (((i10 & 2) >> 1) * 3) + ((i10 & 1) << 1);
        return ((int) (j10 >> (i11 + 15))) & ((1 << (18 - i11)) - 1);
    }

    public static final int j(long j10) {
        int i10 = (int) (3 & j10);
        return ((int) (j10 >> 2)) & ((1 << p.A((i10 & 2) >> 1, 3, (i10 & 1) << 1, 13)) - 1);
    }

    public static final boolean k(long j10) {
        int i10 = (int) (3 & j10);
        int i11 = (((i10 & 2) >> 1) * 3) + ((i10 & 1) << 1);
        return (((int) (j10 >> 33)) & ((1 << (i11 + 13)) - 1)) - 1 == 0 || (((int) (j10 >> (i11 + 46))) & ((1 << (18 - i11)) - 1)) - 1 == 0;
    }

    public static String l(long j10) {
        int iH = h(j10);
        String strValueOf = iH == Integer.MAX_VALUE ? "Infinity" : String.valueOf(iH);
        int iG = g(j10);
        String strValueOf2 = iG != Integer.MAX_VALUE ? String.valueOf(iG) : "Infinity";
        StringBuilder sb = new StringBuilder("Constraints(minWidth = ");
        sb.append(j(j10));
        sb.append(", maxWidth = ");
        sb.append(strValueOf);
        sb.append(", minHeight = ");
        sb.append(i(j10));
        sb.append(", maxHeight = ");
        return AbstractC0112b.j(sb, strValueOf2, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f15843a == ((a) obj).f15843a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f15843a);
    }

    public final String toString() {
        return l(this.f15843a);
    }
}
