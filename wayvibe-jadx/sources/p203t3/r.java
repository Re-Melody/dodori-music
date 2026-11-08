package p203t3;

import B2.AbstractC0111a;
import B2.C;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f26826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f26827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f26828c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f26829d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f26830e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long[] f26831f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f26832g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f26833h;

    public r(o oVar, long[] jArr, int[] iArr, int i10, long[] jArr2, int[] iArr2, long j10) {
        AbstractC0111a.d(iArr.length == jArr2.length);
        AbstractC0111a.d(jArr.length == jArr2.length);
        AbstractC0111a.d(iArr2.length == jArr2.length);
        this.f26826a = oVar;
        this.f26828c = jArr;
        this.f26829d = iArr;
        this.f26830e = i10;
        this.f26831f = jArr2;
        this.f26832g = iArr2;
        this.f26833h = j10;
        this.f26827b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public final int a(long j10) {
        long[] jArr = this.f26831f;
        for (int iB = C.b(jArr, j10, true); iB < jArr.length; iB++) {
            if ((this.f26832g[iB] & 1) != 0) {
                return iB;
            }
        }
        return -1;
    }
}
