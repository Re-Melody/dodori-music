package Y;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class h extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f13316c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f13317d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public j f13318e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f13319f;

    public h(f fVar, int i10) {
        super(i10, fVar.f13313h);
        this.f13316c = fVar;
        this.f13317d = fVar.q();
        this.f13319f = -1;
        b();
    }

    public final void a() {
        if (this.f13317d != this.f13316c.q()) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // Y.a, java.util.ListIterator
    public final void add(Object obj) {
        a();
        int i10 = this.f13296a;
        f fVar = this.f13316c;
        fVar.add(i10, obj);
        this.f13296a++;
        this.f13297b = fVar.k();
        this.f13317d = fVar.q();
        this.f13319f = -1;
        b();
    }

    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v4 */
    public final void b() {
        f fVar = this.f13316c;
        Object[] objArr = fVar.f13311f;
        if (objArr == null) {
            this.f13318e = null;
            return;
        }
        int i10 = (fVar.f13313h - 1) & (-32);
        int i11 = this.f13296a;
        if (i11 > i10) {
            i11 = i10;
        }
        int i12 = (fVar.f13309d / 5) + 1;
        j jVar = this.f13318e;
        if (jVar == null) {
            this.f13318e = new j(objArr, i11, i10, i12);
            return;
        }
        jVar.f13296a = i11;
        jVar.f13297b = i10;
        jVar.f13322c = i12;
        if (jVar.f13323d.length < i12) {
            jVar.f13323d = new Object[i12];
        }
        jVar.f13323d[0] = objArr;
        ?? r10 = i11 == i10 ? 1 : 0;
        jVar.f13324e = r10;
        jVar.b(i11 - r10, 1);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        a();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f13296a;
        this.f13319f = i10;
        j jVar = this.f13318e;
        f fVar = this.f13316c;
        if (jVar == null) {
            Object[] objArr = fVar.f13312g;
            this.f13296a = i10 + 1;
            return objArr[i10];
        }
        if (jVar.hasNext()) {
            this.f13296a++;
            return jVar.next();
        }
        Object[] objArr2 = fVar.f13312g;
        int i11 = this.f13296a;
        this.f13296a = i11 + 1;
        return objArr2[i11 - jVar.f13297b];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        a();
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f13296a;
        this.f13319f = i10 - 1;
        j jVar = this.f13318e;
        f fVar = this.f13316c;
        if (jVar == null) {
            Object[] objArr = fVar.f13312g;
            int i11 = i10 - 1;
            this.f13296a = i11;
            return objArr[i11];
        }
        int i12 = jVar.f13297b;
        if (i10 <= i12) {
            this.f13296a = i10 - 1;
            return jVar.previous();
        }
        Object[] objArr2 = fVar.f13312g;
        int i13 = i10 - 1;
        this.f13296a = i13;
        return objArr2[i13 - i12];
    }

    @Override // Y.a, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        a();
        int i10 = this.f13319f;
        if (i10 == -1) {
            throw new IllegalStateException();
        }
        f fVar = this.f13316c;
        fVar.n(i10);
        int i11 = this.f13319f;
        if (i11 < this.f13296a) {
            this.f13296a = i11;
        }
        this.f13297b = fVar.k();
        this.f13317d = fVar.q();
        this.f13319f = -1;
        b();
    }

    @Override // Y.a, java.util.ListIterator
    public final void set(Object obj) {
        a();
        int i10 = this.f13319f;
        if (i10 == -1) {
            throw new IllegalStateException();
        }
        f fVar = this.f13316c;
        fVar.set(i10, obj);
        this.f13317d = fVar.q();
        b();
    }
}
