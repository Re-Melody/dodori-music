package V4;

import J4.p;
import android.os.SystemClock;
import java.util.Arrays;
import p235w4.n;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f12571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f12573c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n[] f12574d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long[] f12575e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f12576f;

    public a(p pVar, int... iArr) {
        int i10 = 0;
        X4.a.q(iArr.length > 0);
        pVar.getClass();
        this.f12571a = pVar;
        int length = iArr.length;
        this.f12572b = length;
        this.f12574d = new n[length];
        for (int i11 = 0; i11 < iArr.length; i11++) {
            this.f12574d[i11] = pVar.f6648b[iArr[i11]];
        }
        Arrays.sort(this.f12574d, new F9.n(3));
        this.f12573c = new int[this.f12572b];
        while (true) {
            int i12 = this.f12572b;
            if (i10 >= i12) {
                this.f12575e = new long[i12];
                return;
            } else {
                this.f12573c[i10] = pVar.a(this.f12574d[i10]);
                i10++;
            }
        }
    }

    public final boolean a(int i10) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long[] jArr = this.f12575e;
        boolean z10 = jArr[i10] > jElapsedRealtime;
        int i11 = 0;
        while (i11 < this.f12572b && !z10) {
            z10 = i11 != i10 && jArr[i11] <= jElapsedRealtime;
            i11++;
        }
        if (!z10) {
            return false;
        }
        jArr[i10] = Math.max(jArr[i10], jElapsedRealtime + 60000);
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f12571a == aVar.f12571a && Arrays.equals(this.f12573c, aVar.f12573c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f12576f == 0) {
            this.f12576f = Arrays.hashCode(this.f12573c) + (System.identityHashCode(this.f12571a) * 31);
        }
        return this.f12576f;
    }
}
