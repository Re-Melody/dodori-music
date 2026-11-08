package com.google.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.protobuf.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1231a0 extends AbstractC1232b implements InterfaceC1233b0, RandomAccess {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f18727b;

    static {
        new C1231a0();
    }

    public C1231a0(ArrayList arrayList) {
        super(true);
        this.f18727b = arrayList;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        a();
        this.f18727b.add(i10, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractC1232b, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.f18727b.size(), collection);
    }

    @Override // com.google.protobuf.InterfaceC1233b0
    public final void b(AbstractC1252l abstractC1252l) {
        a();
        this.f18727b.add(abstractC1252l);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractC1232b, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        a();
        this.f18727b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.U
    public final U e(int i10) {
        List list = this.f18727b;
        if (i10 < list.size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i10);
        arrayList.addAll(list);
        return new C1231a0(arrayList);
    }

    @Override // com.google.protobuf.InterfaceC1233b0
    public final List g() {
        return Collections.unmodifiableList(this.f18727b);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        List list = this.f18727b;
        Object obj = list.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC1252l) {
            AbstractC1252l abstractC1252l = (AbstractC1252l) obj;
            abstractC1252l.getClass();
            String strZ = abstractC1252l.size() == 0 ? "" : abstractC1252l.z(V.f18703a);
            if (abstractC1252l.r()) {
                list.set(i10, strZ);
            }
            return strZ;
        }
        byte[] bArr = (byte[]) obj;
        String str = new String(bArr, V.f18703a);
        J0 j10 = b1.f18729a;
        if (b1.f18729a.s(bArr, 0, bArr.length)) {
            list.set(i10, str);
        }
        return str;
    }

    @Override // com.google.protobuf.AbstractC1232b, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        a();
        Object objRemove = this.f18727b.remove(i10);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        if (!(objRemove instanceof AbstractC1252l)) {
            return new String((byte[]) objRemove, V.f18703a);
        }
        AbstractC1252l abstractC1252l = (AbstractC1252l) objRemove;
        abstractC1252l.getClass();
        return abstractC1252l.size() == 0 ? "" : abstractC1252l.z(V.f18703a);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        a();
        Object obj2 = this.f18727b.set(i10, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof AbstractC1252l)) {
            return new String((byte[]) obj2, V.f18703a);
        }
        AbstractC1252l abstractC1252l = (AbstractC1252l) obj2;
        abstractC1252l.getClass();
        return abstractC1252l.size() == 0 ? "" : abstractC1252l.z(V.f18703a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f18727b.size();
    }

    @Override // com.google.protobuf.InterfaceC1233b0
    public final InterfaceC1233b0 v() {
        return this.f18728a ? new T0(this) : this;
    }

    @Override // com.google.protobuf.InterfaceC1233b0
    public final Object w(int i10) {
        return this.f18727b.get(i10);
    }

    public C1231a0() {
        super(false);
        this.f18727b = Collections.EMPTY_LIST;
    }

    @Override // com.google.protobuf.AbstractC1232b, java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection collection) {
        a();
        if (collection instanceof InterfaceC1233b0) {
            collection = ((InterfaceC1233b0) collection).g();
        }
        boolean zAddAll = this.f18727b.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    public C1231a0(int i10) {
        this(new ArrayList(i10));
    }
}
