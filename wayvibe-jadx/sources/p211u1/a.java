package p211u1;

/* JADX INFO: loaded from: classes.dex */
public final class a extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f27024e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f27025f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p201t1.a f27026g;

    public int getType() {
        return this.f27024e;
    }

    public void setAllowsGoneWidget(boolean z10) {
        this.f27026g.f26551m0 = z10;
    }

    public void setType(int i10) {
        this.f27024e = i10;
        this.f27025f = i10;
        if (1 == getResources().getConfiguration().getLayoutDirection()) {
            int i11 = this.f27024e;
            if (i11 == 5) {
                this.f27025f = 1;
            } else if (i11 == 6) {
                this.f27025f = 0;
            }
        } else {
            int i12 = this.f27024e;
            if (i12 == 5) {
                this.f27025f = 0;
            } else if (i12 == 6) {
                this.f27025f = 1;
            }
        }
        this.f27026g.f26549k0 = this.f27025f;
    }
}
