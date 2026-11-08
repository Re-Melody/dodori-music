package p199t;

import N8.m;

/* JADX INFO: renamed from: t.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2232g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float[] f26289a;

    static {
        long[] jArr = E.f26264a;
        int iF = E.f(0);
        int iMax = iF > 0 ? Math.max(7, E.e(iF)) : 0;
        if (iMax != 0) {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            m.q0(jArr);
        }
        int i10 = iMax >> 3;
        long j10 = 255 << ((iMax & 7) << 3);
        jArr[i10] = (jArr[i10] & (~j10)) | j10;
        float[] fArr = new float[iMax];
        f26289a = new float[0];
    }
}
