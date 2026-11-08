package V2;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f12511c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f12512d;

    public h(int i10, int i11, int i12, int i13) {
        this.f12509a = i10;
        this.f12510b = i11;
        this.f12511c = i12;
        this.f12512d = i13;
    }

    public final boolean a(int i10) {
        if (i10 == 1) {
            if (this.f12509a - this.f12510b <= 1) {
                return false;
            }
        } else if (this.f12511c - this.f12512d <= 1) {
            return false;
        }
        return true;
    }
}
