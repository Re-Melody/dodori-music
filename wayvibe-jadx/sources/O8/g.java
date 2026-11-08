package O8;

import Z.i;
import Z.n;
import Z.o;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final class g extends AbstractCollection implements Collection, p013a9.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f9363b;

    public /* synthetic */ g(Object obj, int i10) {
        this.f9362a = i10;
        this.f9363b = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f9362a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection elements) {
        switch (this.f9362a) {
            case 0:
                m.f(elements, "elements");
                throw new UnsupportedOperationException();
            default:
                return super.addAll(elements);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.f9362a) {
            case 0:
                ((e) this.f9363b).clear();
                break;
            default:
                ((Z.e) this.f9363b).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f9362a) {
            case 0:
                return ((e) this.f9363b).containsValue(obj);
            default:
                return ((Z.e) this.f9363b).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.f9362a) {
            case 0:
                return ((e) this.f9363b).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f9362a) {
            case 0:
                e eVar = (e) this.f9363b;
                eVar.getClass();
                return new c(eVar, 2);
            default:
                n[] nVarArr = new n[8];
                for (int i10 = 0; i10 < 8; i10++) {
                    nVarArr[i10] = new o(2);
                }
                return new i((Z.e) this.f9363b, nVarArr);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.f9362a) {
            case 0:
                e eVar = (e) this.f9363b;
                eVar.g();
                int iN = eVar.n(obj);
                if (iN < 0) {
                    return false;
                }
                eVar.q(iN);
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection elements) {
        switch (this.f9362a) {
            case 0:
                m.f(elements, "elements");
                ((e) this.f9363b).g();
                break;
        }
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection elements) {
        switch (this.f9362a) {
            case 0:
                m.f(elements, "elements");
                ((e) this.f9363b).g();
                break;
        }
        return super.retainAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        switch (this.f9362a) {
            case 0:
                return ((e) this.f9363b).f9356i;
            default:
                Z.e eVar = (Z.e) this.f9363b;
                eVar.getClass();
                return eVar.f13425f;
        }
    }
}
