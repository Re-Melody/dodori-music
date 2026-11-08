package p152o;

/* JADX INFO: loaded from: classes.dex */
public final class P0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f23250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f23251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f23252c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f23253d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f23254e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f23255f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f23256g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f23257h;

    public final void a(int i10, int i11) {
        this.f23252c = i10;
        this.f23253d = i11;
        this.f23257h = true;
        if (this.f23256g) {
            if (i11 != Integer.MIN_VALUE) {
                this.f23250a = i11;
            }
            if (i10 != Integer.MIN_VALUE) {
                this.f23251b = i10;
                return;
            }
            return;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f23250a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f23251b = i11;
        }
    }
}
