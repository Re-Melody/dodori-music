package Y;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class j extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13322c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object[] f13323d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f13324e;

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public j(Object[] objArr, int i10, int i11, int i12) {
        super(i10, i11);
        this.f13322c = i12;
        Object[] objArr2 = new Object[i12];
        this.f13323d = objArr2;
        ?? r10 = i10 == i11 ? 1 : 0;
        this.f13324e = r10;
        objArr2[0] = objArr;
        b(i10 - r10, 1);
    }

    public final Object a() {
        int i10 = this.f13296a & 31;
        Object obj = this.f13323d[this.f13322c - 1];
        m.d(obj, "null cannot be cast to non-null type kotlin.Array<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.TrieIterator>");
        return ((Object[]) obj)[i10];
    }

    public final void b(int i10, int i11) {
        int i12 = (this.f13322c - i11) * 5;
        while (i11 < this.f13322c) {
            Object[] objArr = this.f13323d;
            Object obj = objArr[i11 - 1];
            m.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr[i11] = ((Object[]) obj)[S9.b.T(i10, i12)];
            i12 -= 5;
            i11++;
        }
    }

    public final void c(int i10) {
        int i11 = 0;
        while (S9.b.T(this.f13296a, i11) == i10) {
            i11 += 5;
        }
        if (i11 > 0) {
            b(this.f13296a, ((this.f13322c - 1) - (i11 / 5)) + 1);
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object objA = a();
        int i10 = this.f13296a + 1;
        this.f13296a = i10;
        if (i10 == this.f13297b) {
            this.f13324e = true;
            return objA;
        }
        c(0);
        return objA;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        this.f13296a--;
        if (this.f13324e) {
            this.f13324e = false;
            return a();
        }
        c(31);
        return a();
    }
}
