package p199t;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.m;
import p004a0.c;
import p013a9.a;
import p013a9.f;

/* JADX INFO: loaded from: classes.dex */
public final class A implements f, Set, a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ B f26255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ B f26256b;

    public A(B b10) {
        this.f26256b = b10;
        this.f26255a = b10;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.f26256b.a(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection elements) {
        m.f(elements, "elements");
        B b10 = this.f26256b;
        int i10 = b10.f26260d;
        for (Object obj : elements) {
            b10.f26258b[b10.d(obj)] = obj;
        }
        return i10 != b10.f26260d;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f26256b.b();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f26255a.c(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection elements) {
        m.f(elements, "elements");
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            if (!this.f26255a.c(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f26255a.g();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new c(this.f26256b);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f26256b.j(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection elements) {
        int iHashCode;
        int iNumberOfTrailingZeros;
        m.f(elements, "elements");
        B b10 = this.f26256b;
        int i10 = b10.f26260d;
        Iterator it = elements.iterator();
        while (true) {
            int i11 = 1;
            int i12 = 0;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (next != null) {
                b10.getClass();
                iHashCode = next.hashCode();
            } else {
                iHashCode = 0;
            }
            int i13 = iHashCode * (-862048943);
            int i14 = i13 ^ (i13 << 16);
            int i15 = i14 & 127;
            int i16 = b10.f26259c;
            int i17 = (i14 >>> 7) & i16;
            while (true) {
                long[] jArr = b10.f26257a;
                int i18 = i17 >> 3;
                int i19 = (i17 & 7) << 3;
                int i20 = i11;
                int i21 = i12;
                long j10 = (((-i19) >> 63) & (jArr[i18 + i11] << (64 - i19))) | (jArr[i18] >>> i19);
                long j11 = (((long) i15) * 72340172838076673L) ^ j10;
                long j12 = -9187201950435737472L;
                long j13 = (~j11) & (j11 - 72340172838076673L) & (-9187201950435737472L);
                while (j13 != 0) {
                    iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j13) >> 3) + i17) & i16;
                    long j14 = j12;
                    if (m.b(b10.f26258b[iNumberOfTrailingZeros], next)) {
                        break;
                    }
                    j13 &= j13 - 1;
                    j12 = j14;
                }
                if ((j10 & ((~j10) << 6) & j12) != 0) {
                    iNumberOfTrailingZeros = -1;
                    break;
                }
                i12 = i21 + 8;
                i17 = (i17 + i12) & i16;
                i11 = i20;
            }
            if (iNumberOfTrailingZeros >= 0) {
                b10.k(iNumberOfTrailingZeros);
            }
        }
        return i10 != b10.f26260d;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection elements) {
        m.f(elements, "elements");
        B b10 = this.f26256b;
        long[] jArr = b10.f26257a;
        int length = jArr.length - 2;
        if (length < 0) {
            return false;
        }
        int i10 = 0;
        boolean z10 = false;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        int i13 = (i10 << 3) + i12;
                        if (!elements.contains(b10.f26258b[i13])) {
                            b10.k(i13);
                            z10 = true;
                        }
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return z10;
                }
            }
            if (i10 == length) {
                return z10;
            }
            i10++;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f26255a.f26260d;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return l.a(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] array) {
        m.f(array, "array");
        return l.b(this, array);
    }
}
