package M2;

import p255y2.C2336l;

/* JADX INFO: loaded from: classes.dex */
public abstract class g implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f8149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f8150c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f8151d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f8152e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C2336l f8153f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f8154g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f8155h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f8156i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f8157j;
    public final boolean k;

    public g(String str, f fVar, long j10, int i10, long j11, C2336l c2336l, String str2, String str3, long j12, long j13, boolean z10) {
        this.f8148a = str;
        this.f8149b = fVar;
        this.f8150c = j10;
        this.f8151d = i10;
        this.f8152e = j11;
        this.f8153f = c2336l;
        this.f8154g = str2;
        this.f8155h = str3;
        this.f8156i = j12;
        this.f8157j = j13;
        this.k = z10;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        Long l10 = (Long) obj;
        long jLongValue = l10.longValue();
        long j10 = this.f8152e;
        if (j10 > jLongValue) {
            return 1;
        }
        return j10 < l10.longValue() ? -1 : 0;
    }
}
