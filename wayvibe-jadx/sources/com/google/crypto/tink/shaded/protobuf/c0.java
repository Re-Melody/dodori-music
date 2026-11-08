package com.google.crypto.tink.shaded.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class c0 extends AbstractC1181b implements RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object[] f18417d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c0 f18418e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f18419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f18420c;

    static {
        Object[] objArr = new Object[0];
        f18417d = objArr;
        f18418e = new c0(objArr, 0, false);
    }

    public c0(Object[] objArr, int i10, boolean z10) {
        this.f18411a = z10;
        this.f18419b = objArr;
        this.f18420c = i10;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        a();
        int i10 = this.f18420c;
        Object[] objArr = this.f18419b;
        if (i10 == objArr.length) {
            this.f18419b = Arrays.copyOf(this.f18419b, V0.p.c(objArr.length, 3, 2, 1, 10));
        }
        Object[] objArr2 = this.f18419b;
        int i11 = this.f18420c;
        this.f18420c = i11 + 1;
        objArr2[i11] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void c(int i10) {
        if (i10 < 0 || i10 >= this.f18420c) {
            StringBuilder sbP = p134m1.b.p(i10, "Index:", ", Size:");
            sbP.append(this.f18420c);
            throw new IndexOutOfBoundsException(sbP.toString());
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.D
    public final D e(int i10) {
        if (i10 >= this.f18420c) {
            return new c0(i10 == 0 ? f18417d : Arrays.copyOf(this.f18419b, i10), this.f18420c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        c(i10);
        return this.f18419b[i10];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1181b, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        a();
        c(i10);
        Object[] objArr = this.f18419b;
        Object obj = objArr[i10];
        int i11 = this.f18420c;
        if (i10 < i11 - 1) {
            System.arraycopy(objArr, i10 + 1, objArr, i10, (i11 - i10) - 1);
        }
        this.f18420c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        a();
        c(i10);
        Object[] objArr = this.f18419b;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f18420c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        a();
        if (i10 >= 0 && i10 <= (i11 = this.f18420c)) {
            Object[] objArr = this.f18419b;
            if (i11 < objArr.length) {
                System.arraycopy(objArr, i10, objArr, i10 + 1, i11 - i10);
            } else {
                Object[] objArr2 = new Object[V0.p.c(objArr.length, 3, 2, 1, 10)];
                System.arraycopy(this.f18419b, 0, objArr2, 0, i10);
                System.arraycopy(this.f18419b, i10, objArr2, i10 + 1, this.f18420c - i10);
                this.f18419b = objArr2;
            }
            this.f18419b[i10] = obj;
            this.f18420c++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder sbP = p134m1.b.p(i10, "Index:", ", Size:");
        sbP.append(this.f18420c);
        throw new IndexOutOfBoundsException(sbP.toString());
    }
}
