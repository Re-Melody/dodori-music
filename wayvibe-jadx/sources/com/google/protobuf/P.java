package com.google.protobuf;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class P extends AbstractC1232b implements T, RandomAccess, InterfaceC1276x0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final P f18691d = new P(new int[0], 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f18692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f18693c;

    public P(int[] iArr, int i10, boolean z10) {
        super(z10);
        this.f18692b = iArr;
        this.f18693c = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        int iIntValue = ((Integer) obj).intValue();
        a();
        if (i10 < 0 || i10 > (i11 = this.f18693c)) {
            StringBuilder sbP = p134m1.b.p(i10, "Index:", ", Size:");
            sbP.append(this.f18693c);
            throw new IndexOutOfBoundsException(sbP.toString());
        }
        int[] iArr = this.f18692b;
        if (i11 < iArr.length) {
            System.arraycopy(iArr, i10, iArr, i10 + 1, i11 - i10);
        } else {
            int[] iArr2 = new int[V0.p.b(i11, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            System.arraycopy(this.f18692b, i10, iArr2, i10 + 1, this.f18693c - i10);
            this.f18692b = iArr2;
        }
        this.f18692b[i10] = iIntValue;
        this.f18693c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractC1232b, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        Charset charset = V.f18703a;
        collection.getClass();
        if (!(collection instanceof P)) {
            return super.addAll(collection);
        }
        P p10 = (P) collection;
        int i10 = p10.f18693c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f18693c;
        if (com.google.android.gms.common.api.f.API_PRIORITY_OTHER - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        int[] iArr = this.f18692b;
        if (i12 > iArr.length) {
            this.f18692b = Arrays.copyOf(iArr, i12);
        }
        System.arraycopy(p10.f18692b, 0, this.f18692b, this.f18693c, p10.f18693c);
        this.f18693c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void c(int i10) {
        a();
        int i11 = this.f18693c;
        int[] iArr = this.f18692b;
        if (i11 == iArr.length) {
            int[] iArr2 = new int[V0.p.b(i11, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            this.f18692b = iArr2;
        }
        int[] iArr3 = this.f18692b;
        int i12 = this.f18693c;
        this.f18693c = i12 + 1;
        iArr3[i12] = i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i10) {
        if (i10 < 0 || i10 >= this.f18693c) {
            StringBuilder sbP = p134m1.b.p(i10, "Index:", ", Size:");
            sbP.append(this.f18693c);
            throw new IndexOutOfBoundsException(sbP.toString());
        }
    }

    @Override // com.google.protobuf.U
    public final U e(int i10) {
        if (i10 >= this.f18693c) {
            return new P(Arrays.copyOf(this.f18692b, i10), this.f18693c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractC1232b, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P)) {
            return super.equals(obj);
        }
        P p10 = (P) obj;
        if (this.f18693c != p10.f18693c) {
            return false;
        }
        int[] iArr = p10.f18692b;
        for (int i10 = 0; i10 < this.f18693c; i10++) {
            if (this.f18692b[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        d(i10);
        return Integer.valueOf(this.f18692b[i10]);
    }

    @Override // com.google.protobuf.AbstractC1232b, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f18693c; i11++) {
            i10 = (i10 * 31) + this.f18692b[i11];
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i10 = this.f18693c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f18692b[i11] == iIntValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.protobuf.AbstractC1232b, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        a();
        d(i10);
        int[] iArr = this.f18692b;
        int i11 = iArr[i10];
        int i12 = this.f18693c;
        if (i10 < i12 - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (i12 - i10) - 1);
        }
        this.f18693c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        a();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f18692b;
        System.arraycopy(iArr, i11, iArr, i10, this.f18693c - i11);
        this.f18693c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        a();
        d(i10);
        int[] iArr = this.f18692b;
        int i11 = iArr[i10];
        iArr[i10] = iIntValue;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f18693c;
    }

    @Override // com.google.protobuf.AbstractC1232b, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        c(((Integer) obj).intValue());
        return true;
    }
}
