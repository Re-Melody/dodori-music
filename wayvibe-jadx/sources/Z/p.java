package Z;

/* JADX INFO: loaded from: classes.dex */
public final class p extends n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h f13447d;

    public p(h hVar) {
        this.f13447d = hVar;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i10 = this.f13445c;
        this.f13445c = i10 + 2;
        Object[] objArr = this.f13443a;
        return new b(this.f13447d, objArr[i10], objArr[i10 + 1]);
    }
}
