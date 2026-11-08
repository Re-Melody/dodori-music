package N8;

import B2.AbstractC0112b;
import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class C extends e implements RandomAccess {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f8624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f8626c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f8627d;

    public C(Object[] objArr, int i10) {
        this.f8624a = objArr;
        if (i10 < 0) {
            throw new IllegalArgumentException(p134m1.b.j(i10, "ring buffer filled size should not be negative but it is ").toString());
        }
        if (i10 <= objArr.length) {
            this.f8625b = objArr.length;
            this.f8627d = i10;
        } else {
            StringBuilder sbP = p134m1.b.p(i10, "ring buffer filled size: ", " cannot be larger than the buffer size: ");
            sbP.append(objArr.length);
            throw new IllegalArgumentException(sbP.toString().toString());
        }
    }

    @Override // java.util.List
    public final Object get(int i10) {
        int iK = k();
        if (i10 < 0 || i10 >= iK) {
            throw new IndexOutOfBoundsException(AbstractC0112b.e("index: ", i10, iK, ", size: "));
        }
        return this.f8624a[(this.f8626c + i10) % this.f8625b];
    }

    @Override // N8.e, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new B(this);
    }

    @Override // N8.AbstractC0644a
    public final int k() {
        return this.f8627d;
    }

    public final void n() {
        if (20 > this.f8627d) {
            throw new IllegalArgumentException(("n shouldn't be greater than the buffer size: n = 20, size = " + this.f8627d).toString());
        }
        int i10 = this.f8626c;
        int i11 = this.f8625b;
        int i12 = (i10 + 20) % i11;
        Object[] objArr = this.f8624a;
        if (i10 > i12) {
            m.p0(objArr, i10, i11);
            m.p0(objArr, 0, i12);
        } else {
            m.p0(objArr, i10, i12);
        }
        this.f8626c = i12;
        this.f8627d -= 20;
    }

    @Override // N8.AbstractC0644a, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[k()]);
    }

    @Override // N8.AbstractC0644a, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] array) {
        Object[] objArr;
        kotlin.jvm.internal.m.f(array, "array");
        int length = array.length;
        int i10 = this.f8627d;
        if (length < i10) {
            array = Arrays.copyOf(array, i10);
            kotlin.jvm.internal.m.e(array, "copyOf(...)");
        }
        int i11 = this.f8627d;
        int i12 = this.f8626c;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            objArr = this.f8624a;
            if (i14 >= i11 || i12 >= this.f8625b) {
                break;
            }
            array[i14] = objArr[i12];
            i14++;
            i12++;
        }
        while (i14 < i11) {
            array[i14] = objArr[i13];
            i14++;
            i13++;
        }
        if (i11 < array.length) {
            array[i11] = null;
        }
        return array;
    }
}
