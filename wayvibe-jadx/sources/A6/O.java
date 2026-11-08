package A6;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class O extends AbstractSequentialList implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractCollection f320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p267z6.i f321b;

    /* JADX WARN: Multi-variable type inference failed */
    public O(List list, p267z6.i iVar) {
        list.getClass();
        this.f320a = (AbstractCollection) list;
        this.f321b = iVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i10) {
        return new M(this, this.f320a.listIterator(i10), 1);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        this.f320a.subList(i10, i11).clear();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f320a.size();
    }
}
