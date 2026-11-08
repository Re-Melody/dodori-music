package O8;

import N8.h;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final class f extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f9361b;

    public /* synthetic */ f(e eVar, int i10) {
        this.f9360a = i10;
        this.f9361b = eVar;
    }

    @Override // N8.h
    public final int a() {
        switch (this.f9360a) {
            case 0:
                break;
        }
        return this.f9361b.f9356i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f9360a) {
            case 0:
                Map.Entry element = (Map.Entry) obj;
                m.f(element, "element");
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection elements) {
        switch (this.f9360a) {
            case 0:
                m.f(elements, "elements");
                throw new UnsupportedOperationException();
            default:
                m.f(elements, "elements");
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f9360a) {
            case 0:
                this.f9361b.clear();
                break;
            default:
                this.f9361b.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f9360a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry element = (Map.Entry) obj;
                m.f(element, "element");
                return this.f9361b.j(element);
            default:
                return this.f9361b.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection elements) {
        switch (this.f9360a) {
            case 0:
                m.f(elements, "elements");
                return this.f9361b.i(elements);
            default:
                return super.containsAll(elements);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        switch (this.f9360a) {
            case 0:
                break;
        }
        return this.f9361b.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f9360a) {
            case 0:
                e eVar = this.f9361b;
                eVar.getClass();
                return new c(eVar, 0);
            default:
                e eVar2 = this.f9361b;
                eVar2.getClass();
                return new c(eVar2, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f9360a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry element = (Map.Entry) obj;
                m.f(element, "element");
                e eVar = this.f9361b;
                eVar.getClass();
                eVar.g();
                int iL = eVar.l(element.getKey());
                if (iL < 0) {
                    return false;
                }
                Object[] objArr = eVar.f9349b;
                m.c(objArr);
                if (!m.b(objArr[iL], element.getValue())) {
                    return false;
                }
                eVar.q(iL);
                return true;
            default:
                e eVar2 = this.f9361b;
                eVar2.g();
                int iL2 = eVar2.l(obj);
                if (iL2 < 0) {
                    return false;
                }
                eVar2.q(iL2);
                return true;
        }
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection elements) {
        switch (this.f9360a) {
            case 0:
                m.f(elements, "elements");
                this.f9361b.g();
                break;
            default:
                m.f(elements, "elements");
                this.f9361b.g();
                break;
        }
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection elements) {
        switch (this.f9360a) {
            case 0:
                m.f(elements, "elements");
                this.f9361b.g();
                break;
            default:
                m.f(elements, "elements");
                this.f9361b.g();
                break;
        }
        return super.retainAll(elements);
    }
}
