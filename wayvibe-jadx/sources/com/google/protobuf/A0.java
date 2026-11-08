package com.google.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class A0 extends AbstractC1232b implements RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final A0 f18651d = new A0(new Object[0], 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f18652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f18653c;

    public A0(Object[] objArr, int i10, boolean z10) {
        super(z10);
        this.f18652b = objArr;
        this.f18653c = i10;
    }

    @Override // com.google.protobuf.AbstractC1232b, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        a();
        int i10 = this.f18653c;
        Object[] objArr = this.f18652b;
        if (i10 == objArr.length) {
            this.f18652b = Arrays.copyOf(objArr, ((i10 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f18652b;
        int i11 = this.f18653c;
        this.f18653c = i11 + 1;
        objArr2[i11] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void c(int i10) {
        if (i10 < 0 || i10 >= this.f18653c) {
            StringBuilder sbP = p134m1.b.p(i10, "Index:", ", Size:");
            sbP.append(this.f18653c);
            throw new IndexOutOfBoundsException(sbP.toString());
        }
    }

    @Override // com.google.protobuf.U
    public final U e(int i10) {
        if (i10 >= this.f18653c) {
            return new A0(Arrays.copyOf(this.f18652b, i10), this.f18653c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        c(i10);
        return this.f18652b[i10];
    }

    @Override // com.google.protobuf.AbstractC1232b, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        a();
        c(i10);
        Object[] objArr = this.f18652b;
        Object obj = objArr[i10];
        int i11 = this.f18653c;
        if (i10 < i11 - 1) {
            System.arraycopy(objArr, i10 + 1, objArr, i10, (i11 - i10) - 1);
        }
        this.f18653c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        a();
        c(i10);
        Object[] objArr = this.f18652b;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f18653c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        a();
        if (i10 >= 0 && i10 <= (i11 = this.f18653c)) {
            Object[] objArr = this.f18652b;
            if (i11 < objArr.length) {
                System.arraycopy(objArr, i10, objArr, i10 + 1, i11 - i10);
            } else {
                Object[] objArr2 = new Object[V0.p.b(i11, 3, 2, 1)];
                System.arraycopy(objArr, 0, objArr2, 0, i10);
                System.arraycopy(this.f18652b, i10, objArr2, i10 + 1, this.f18653c - i10);
                this.f18652b = objArr2;
            }
            this.f18652b[i10] = obj;
            this.f18653c++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder sbP = p134m1.b.p(i10, "Index:", ", Size:");
        sbP.append(this.f18653c);
        throw new IndexOutOfBoundsException(sbP.toString());
    }
}
