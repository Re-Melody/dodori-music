package F2;

import android.util.Pair;

/* JADX INFO: renamed from: F2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0408a extends p255y2.O {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f4044d = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4045b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final R2.Y f4046c;

    public AbstractC0408a(R2.Y y6) {
        this.f4046c = y6;
        this.f4045b = y6.f10772b.length;
    }

    @Override // p255y2.O
    public final int a(boolean z10) {
        if (this.f4045b != 0) {
            int iW = 0;
            if (z10) {
                int[] iArr = this.f4046c.f10772b;
                iW = iArr.length > 0 ? iArr[0] : -1;
            }
            while (y(iW).p()) {
                iW = w(iW, z10);
                if (iW == -1) {
                }
            }
            return y(iW).a(z10) + v(iW);
        }
        return -1;
    }

    @Override // p255y2.O
    public final int b(Object obj) {
        int iB;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int iQ = q(obj2);
        if (iQ == -1 || (iB = y(iQ).b(obj3)) == -1) {
            return -1;
        }
        return u(iQ) + iB;
    }

    @Override // p255y2.O
    public final int c(boolean z10) {
        int iX;
        int i10 = this.f4045b;
        if (i10 != 0) {
            if (z10) {
                int[] iArr = this.f4046c.f10772b;
                iX = iArr.length > 0 ? iArr[iArr.length - 1] : -1;
            } else {
                iX = i10 - 1;
            }
            while (y(iX).p()) {
                iX = x(iX, z10);
                if (iX == -1) {
                }
            }
            return y(iX).c(z10) + v(iX);
        }
        return -1;
    }

    @Override // p255y2.O
    public final int e(int i10, int i11, boolean z10) {
        int iS = s(i10);
        int iV = v(iS);
        int iE = y(iS).e(i10 - iV, i11 == 2 ? 0 : i11, z10);
        if (iE != -1) {
            return iV + iE;
        }
        int iW = w(iS, z10);
        while (iW != -1 && y(iW).p()) {
            iW = w(iW, z10);
        }
        if (iW != -1) {
            return y(iW).a(z10) + v(iW);
        }
        if (i11 == 2) {
            return a(z10);
        }
        return -1;
    }

    @Override // p255y2.O
    public final p255y2.M f(int i10, p255y2.M m8, boolean z10) {
        int iR = r(i10);
        int iV = v(iR);
        y(iR).f(i10 - u(iR), m8, z10);
        m8.f28780c += iV;
        if (z10) {
            Object objT = t(iR);
            Object obj = m8.f28779b;
            obj.getClass();
            m8.f28779b = Pair.create(objT, obj);
        }
        return m8;
    }

    @Override // p255y2.O
    public final p255y2.M g(Object obj, p255y2.M m8) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int iQ = q(obj2);
        int iV = v(iQ);
        y(iQ).g(obj3, m8);
        m8.f28780c += iV;
        m8.f28779b = obj;
        return m8;
    }

    @Override // p255y2.O
    public final int k(int i10, int i11, boolean z10) {
        int iS = s(i10);
        int iV = v(iS);
        int iK = y(iS).k(i10 - iV, i11 == 2 ? 0 : i11, z10);
        if (iK != -1) {
            return iV + iK;
        }
        int iX = x(iS, z10);
        while (iX != -1 && y(iX).p()) {
            iX = x(iX, z10);
        }
        if (iX != -1) {
            return y(iX).c(z10) + v(iX);
        }
        if (i11 == 2) {
            return c(z10);
        }
        return -1;
    }

    @Override // p255y2.O
    public final Object l(int i10) {
        int iR = r(i10);
        return Pair.create(t(iR), y(iR).l(i10 - u(iR)));
    }

    @Override // p255y2.O
    public final p255y2.N m(int i10, p255y2.N n6, long j10) {
        int iS = s(i10);
        int iV = v(iS);
        int iU = u(iS);
        y(iS).m(i10 - iV, n6, j10);
        Object objT = t(iS);
        if (!p255y2.N.f28785q.equals(n6.f28786a)) {
            objT = Pair.create(objT, n6.f28786a);
        }
        n6.f28786a = objT;
        n6.f28798n += iU;
        n6.f28799o += iU;
        return n6;
    }

    public abstract int q(Object obj);

    public abstract int r(int i10);

    public abstract int s(int i10);

    public abstract Object t(int i10);

    public abstract int u(int i10);

    public abstract int v(int i10);

    public final int w(int i10, boolean z10) {
        if (!z10) {
            if (i10 < this.f4045b - 1) {
                return i10 + 1;
            }
            return -1;
        }
        R2.Y y6 = this.f4046c;
        int i11 = y6.f10773c[i10] + 1;
        int[] iArr = y6.f10772b;
        if (i11 < iArr.length) {
            return iArr[i11];
        }
        return -1;
    }

    public final int x(int i10, boolean z10) {
        if (!z10) {
            if (i10 > 0) {
                return i10 - 1;
            }
            return -1;
        }
        R2.Y y6 = this.f4046c;
        int i11 = y6.f10773c[i10] - 1;
        if (i11 >= 0) {
            return y6.f10772b[i11];
        }
        return -1;
    }

    public abstract p255y2.O y(int i10);
}
