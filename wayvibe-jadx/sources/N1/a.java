package N1;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f8515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f8517c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f8518d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f8519e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f8520f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f8521g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f8522h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f8523i;

    public final float a(long j10) {
        long j11 = this.f8519e;
        if (j10 < j11) {
            return 0.0f;
        }
        long j12 = this.f8521g;
        if (j12 < 0 || j10 < j12) {
            return d.b((j10 - j11) / this.f8515a, 0.0f, 1.0f) * 0.5f;
        }
        float f10 = this.f8522h;
        return (d.b((j10 - j12) / this.f8523i, 0.0f, 1.0f) * f10) + (1.0f - f10);
    }
}
