package p078h2;

/* JADX INFO: loaded from: classes.dex */
public final class l implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f20194b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f20195c = -1;

    public l(int i10) {
        this.f20193a = i10;
    }

    @Override // p078h2.k
    public final boolean v(CharSequence charSequence, int i10, int i11, r rVar) {
        int i12 = this.f20193a;
        if (i10 > i12 || i12 >= i11) {
            return i11 <= i12;
        }
        this.f20194b = i10;
        this.f20195c = i11;
        return false;
    }

    @Override // p078h2.k
    public final Object j() {
        return this;
    }
}
