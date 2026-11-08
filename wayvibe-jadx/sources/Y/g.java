package Y;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class g extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f13314c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j f13315d;

    public g(Object[] objArr, int i10, Object[] objArr2, int i11, int i12) {
        super(i10, i11);
        this.f13314c = objArr2;
        int i13 = (i11 - 1) & (-32);
        this.f13315d = new j(objArr, i10 > i13 ? i13 : i10, i13, i12);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        j jVar = this.f13315d;
        if (jVar.hasNext()) {
            this.f13296a++;
            return jVar.next();
        }
        int i10 = this.f13296a;
        this.f13296a = i10 + 1;
        return this.f13314c[i10 - jVar.f13297b];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f13296a;
        j jVar = this.f13315d;
        int i11 = jVar.f13297b;
        if (i10 <= i11) {
            this.f13296a = i10 - 1;
            return jVar.previous();
        }
        int i12 = i10 - 1;
        this.f13296a = i12;
        return this.f13314c[i12 - i11];
    }
}
