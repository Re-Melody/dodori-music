package p153o0;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f23498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f23499b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f23500c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f23501d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f23502e = 0;

    static {
        long j10 = 3;
        long j11 = j10 << 32;
        f23498a = (((long) 0) & 4294967295L) | j11;
        f23499b = (((long) 1) & 4294967295L) | j11;
        f23500c = j11 | (((long) 2) & 4294967295L);
        f23501d = (j10 & 4294967295L) | (((long) 4) << 32);
    }

    public static final boolean a(long j10, long j11) {
        return j10 == j11;
    }

    public static String b(long j10) {
        if (a(j10, f23498a)) {
            return "Rgb";
        }
        if (a(j10, f23499b)) {
            return "Xyz";
        }
        if (a(j10, f23500c)) {
            return "Lab";
        }
        return a(j10, f23501d) ? "Cmyk" : "Unknown";
    }
}
