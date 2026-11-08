package p044d7;

import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f19302b;

    public d(i iVar, Object obj, Comparator comparator) {
        this.f19301a = 0;
        this.f19302b = new ArrayDeque();
        while (!iVar.isEmpty()) {
            int iCompare = obj != null ? comparator.compare(iVar.getKey(), obj) : 1;
            if (iCompare < 0) {
                iVar = iVar.n();
            } else if (iCompare == 0) {
                ((ArrayDeque) this.f19302b).push((k) iVar);
                return;
            } else {
                ((ArrayDeque) this.f19302b).push((k) iVar);
                iVar = iVar.c();
            }
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f19301a) {
            case 0:
                return ((ArrayDeque) this.f19302b).size() > 0;
            default:
                return ((Iterator) this.f19302b).hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f19301a) {
            case 0:
                ArrayDeque arrayDeque = (ArrayDeque) this.f19302b;
                try {
                    k kVar = (k) arrayDeque.pop();
                    AbstractMap.SimpleEntry simpleEntry = new AbstractMap.SimpleEntry(kVar.f19306a, kVar.f19307b);
                    for (i iVarC = kVar.f19309d; !iVarC.isEmpty(); iVarC = iVarC.c()) {
                        arrayDeque.push((k) iVarC);
                    }
                    return simpleEntry;
                } catch (EmptyStackException unused) {
                    throw new NoSuchElementException();
                }
            default:
                return ((Map.Entry) ((Iterator) this.f19302b).next()).getKey();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f19301a) {
            case 0:
                throw new UnsupportedOperationException("remove called on immutable collection");
            default:
                ((Iterator) this.f19302b).remove();
                return;
        }
    }

    public d(Iterator it) {
        this.f19301a = 1;
        this.f19302b = it;
    }
}
