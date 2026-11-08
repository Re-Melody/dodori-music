package Z;

/* JADX INFO: loaded from: classes.dex */
public final class o extends n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f13446d;

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f13446d) {
            case 0:
                int i10 = this.f13445c;
                this.f13445c = i10 + 2;
                Object[] objArr = this.f13443a;
                return new a(objArr[i10], objArr[i10 + 1]);
            case 1:
                int i11 = this.f13445c;
                this.f13445c = i11 + 2;
                return this.f13443a[i11];
            default:
                int i12 = this.f13445c;
                this.f13445c = i12 + 2;
                return this.f13443a[i12 + 1];
        }
    }
}
