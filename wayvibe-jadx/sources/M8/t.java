package M8;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p260y9.C2384u;

/* JADX INFO: loaded from: classes2.dex */
public class t implements Iterator, p013a9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f8429c;

    public /* synthetic */ t(Object obj, int i10) {
        this.f8427a = i10;
        this.f8429c = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f8427a) {
            case 0:
                return this.f8428b < ((byte[]) this.f8429c).length;
            case 1:
                return this.f8428b < ((int[]) this.f8429c).length;
            case 2:
                return this.f8428b < ((long[]) this.f8429c).length;
            case 3:
                return this.f8428b < ((short[]) this.f8429c).length;
            case 4:
                return this.f8428b < ((N8.e) this.f8429c).k();
            case 5:
                return this.f8428b < ((Object[]) this.f8429c).length;
            default:
                return this.f8428b > 0;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f8427a) {
            case 0:
                int i10 = this.f8428b;
                byte[] bArr = (byte[]) this.f8429c;
                if (i10 >= bArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f8428b));
                }
                this.f8428b = i10 + 1;
                return new s(bArr[i10]);
            case 1:
                int i11 = this.f8428b;
                int[] iArr = (int[]) this.f8429c;
                if (i11 >= iArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f8428b));
                }
                this.f8428b = i11 + 1;
                return new v(iArr[i11]);
            case 2:
                int i12 = this.f8428b;
                long[] jArr = (long[]) this.f8429c;
                if (i12 >= jArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f8428b));
                }
                this.f8428b = i12 + 1;
                return new x(jArr[i12]);
            case 3:
                int i13 = this.f8428b;
                short[] sArr = (short[]) this.f8429c;
                if (i13 >= sArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f8428b));
                }
                this.f8428b = i13 + 1;
                return new A(sArr[i13]);
            case 4:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i14 = this.f8428b;
                this.f8428b = i14 + 1;
                return ((N8.e) this.f8429c).get(i14);
            case 5:
                try {
                    Object[] objArr = (Object[]) this.f8429c;
                    int i15 = this.f8428b;
                    this.f8428b = i15 + 1;
                    return objArr[i15];
                } catch (ArrayIndexOutOfBoundsException e2) {
                    this.f8428b--;
                    throw new NoSuchElementException(e2.getMessage());
                }
            default:
                C2384u c2384u = (C2384u) this.f8429c;
                int i16 = this.f8428b;
                this.f8428b = i16 - 1;
                return c2384u.f29252e[c2384u.f29250c - i16];
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f8427a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 3:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 4:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 5:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public t(Object[] array) {
        this.f8427a = 5;
        kotlin.jvm.internal.m.f(array, "array");
        this.f8429c = array;
    }

    public t(C2384u c2384u) {
        this.f8427a = 6;
        this.f8429c = c2384u;
        this.f8428b = c2384u.f29250c;
    }
}
