package U2;

import B2.AbstractC0111a;
import B2.C;
import android.os.SystemClock;
import java.util.Arrays;
import java.util.List;
import p255y2.C2339o;
import p255y2.P;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final P f12078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f12080c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C2339o[] f12081d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long[] f12082e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f12083f;

    public c(P p10, int[] iArr) {
        int i10 = 0;
        AbstractC0111a.h(iArr.length > 0);
        p10.getClass();
        this.f12078a = p10;
        int length = iArr.length;
        this.f12079b = length;
        this.f12081d = new C2339o[length];
        for (int i11 = 0; i11 < iArr.length; i11++) {
            this.f12081d[i11] = p10.f28805d[iArr[i11]];
        }
        Arrays.sort(this.f12081d, new E3.d(9));
        this.f12080c = new int[this.f12079b];
        while (true) {
            int i12 = this.f12079b;
            if (i10 >= i12) {
                this.f12082e = new long[i12];
                return;
            } else {
                this.f12080c[i10] = p10.a(this.f12081d[i10]);
                i10++;
            }
        }
    }

    public int c(List list, long j10) {
        return list.size();
    }

    public final boolean d(int i10, long j10) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean zK = k(i10, jElapsedRealtime);
        int i11 = 0;
        while (i11 < this.f12079b && !zK) {
            zK = (i11 == i10 || k(i11, jElapsedRealtime)) ? false : true;
            i11++;
        }
        if (!zK) {
            return false;
        }
        long[] jArr = this.f12082e;
        long j11 = jArr[i10];
        int i12 = C.f560a;
        long j12 = jElapsedRealtime + j10;
        if (((j10 ^ j12) & (jElapsedRealtime ^ j12)) < 0) {
            j12 = Long.MAX_VALUE;
        }
        jArr[i10] = Math.max(j11, j12);
        return true;
    }

    public final C2339o e() {
        return this.f12081d[f()];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f12078a.equals(cVar.f12078a) && Arrays.equals(this.f12080c, cVar.f12080c)) {
                return true;
            }
        }
        return false;
    }

    public abstract int f();

    public abstract Object g();

    public abstract int h();

    public final int hashCode() {
        if (this.f12083f == 0) {
            this.f12083f = Arrays.hashCode(this.f12080c) + (System.identityHashCode(this.f12078a) * 31);
        }
        return this.f12083f;
    }

    public final int i(int i10) {
        for (int i11 = 0; i11 < this.f12079b; i11++) {
            if (this.f12080c[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }

    public final int j(C2339o c2339o) {
        for (int i10 = 0; i10 < this.f12079b; i10++) {
            if (this.f12081d[i10] == c2339o) {
                return i10;
            }
        }
        return -1;
    }

    public final boolean k(int i10, long j10) {
        return this.f12082e[i10] > j10;
    }

    public abstract void m(long j10, long j11, List list, S2.k[] kVarArr);

    public void a() {
    }

    public void b() {
    }

    public void l(float f10) {
    }
}
