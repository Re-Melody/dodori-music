package M4;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f8283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f8284c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f8285d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f8286e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f8287f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f8288g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f8289h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f8290i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f8291j;
    public final int k;

    public c(String str, long j10, int i10, long j11, String str2, String str3, long j12, long j13) {
        this.f8282a = str;
        this.f8283b = j10;
        this.f8284c = i10;
        this.f8285d = j11;
        this.f8286e = str2;
        this.f8287f = str3;
        this.f8290i = j12;
        this.f8291j = j13;
        this.f8288g = null;
        this.f8289h = null;
        this.k = 0;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        Long l10 = (Long) obj;
        long jLongValue = l10.longValue();
        long j10 = this.f8285d;
        if (j10 > jLongValue) {
            return 1;
        }
        return j10 < l10.longValue() ? -1 : 0;
    }

    public c(String str, long j10, int i10, long j11, int i11, String str2, String str3, String str4, long j12, long j13) {
        this.f8282a = str;
        this.f8283b = j10;
        this.f8284c = i10;
        this.f8285d = j11;
        this.f8286e = str2;
        this.f8288g = str3;
        this.f8289h = str4;
        this.f8290i = j12;
        this.f8291j = j13;
        this.f8287f = null;
        this.k = i11;
    }
}
