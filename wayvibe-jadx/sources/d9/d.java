package d9;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f19429a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f19430b;

    static {
        Integer num = W8.a.f12940a;
        f19430b = (num == null || num.intValue() >= 34) ? new p053e9.a() : new b();
    }

    public abstract int e(int i10);

    public abstract int f();

    public abstract int g(int i10);

    public abstract long k();

    public long l(long j10, long j11) {
        long jK;
        long j12;
        long jE;
        int iF;
        if (j11 <= j10) {
            throw new IllegalArgumentException(("Random range is empty: [" + Long.valueOf(j10) + ", " + Long.valueOf(j11) + ").").toString());
        }
        long j13 = j11 - j10;
        if (j13 > 0) {
            if (((-j13) & j13) == j13) {
                int i10 = (int) j13;
                int i11 = (int) (j13 >>> 32);
                if (i10 != 0) {
                    iF = e(31 - Integer.numberOfLeadingZeros(i10));
                } else if (i11 == 1) {
                    iF = f();
                } else {
                    jE = (((long) e(31 - Integer.numberOfLeadingZeros(i11))) << 32) + (((long) f()) & 4294967295L);
                }
                jE = ((long) iF) & 4294967295L;
            } else {
                do {
                    jK = k() >>> 1;
                    j12 = jK % j13;
                } while ((j13 - 1) + (jK - j12) < 0);
                jE = j12;
            }
            return j10 + jE;
        }
        while (true) {
            long jK2 = k();
            if (j10 <= jK2 && jK2 < j11) {
                return jK2;
            }
        }
    }
}
