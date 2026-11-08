package N8;

/* JADX INFO: loaded from: classes2.dex */
public final class B extends AbstractC0645b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f8621c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f8622d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C f8623e;

    public B(C c3) {
        this.f8623e = c3;
        this.f8621c = c3.f8627d;
        this.f8622d = c3.f8626c;
    }

    @Override // N8.AbstractC0645b
    public final void a() {
        int i10 = this.f8621c;
        if (i10 == 0) {
            this.f8635a = 2;
            return;
        }
        C c3 = this.f8623e;
        Object[] objArr = c3.f8624a;
        int i11 = this.f8622d;
        this.f8636b = objArr[i11];
        this.f8635a = 1;
        this.f8622d = (i11 + 1) % c3.f8625b;
        this.f8621c = i10 - 1;
    }
}
