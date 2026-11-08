package p004a0;

import X8.j;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.m;
import p013a9.a;
import p085h9.i;
import p085h9.l;
import p199t.B;
import p199t.z;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Iterator, a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f14078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f14079c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f14080d;

    public c(Object obj, Map map) {
        this.f14077a = 0;
        this.f14078b = obj;
        this.f14080d = map;
    }

    public void a() {
        Object objInvoke;
        int i10 = this.f14079c;
        j jVar = (j) this.f14080d;
        if (i10 == -2) {
            objInvoke = ((Z8.a) jVar.f13277b).invoke();
        } else {
            Z8.c cVar = (Z8.c) jVar.f13278c;
            Object obj = this.f14078b;
            m.c(obj);
            objInvoke = cVar.invoke(obj);
        }
        this.f14078b = objInvoke;
        this.f14079c = objInvoke == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        l lVar;
        Iterator it;
        switch (this.f14077a) {
            case 0:
                return this.f14079c < ((Map) this.f14080d).size();
            case 1:
                if (this.f14079c < 0) {
                    a();
                }
                return this.f14079c == 1;
            case 2:
                break;
            default:
                return ((i) this.f14078b).hasNext();
        }
        while (true) {
            int i10 = this.f14079c;
            lVar = (l) this.f14080d;
            int i11 = lVar.f20361b;
            it = (Iterator) this.f14078b;
            if (i10 < i11 && it.hasNext()) {
                it.next();
                this.f14079c++;
            }
        }
        return this.f14079c < lVar.f20362c && it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        l lVar;
        Iterator it;
        switch (this.f14077a) {
            case 0:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                Object obj = this.f14078b;
                this.f14079c++;
                Object obj2 = ((Map) this.f14080d).get(obj);
                if (obj2 != null) {
                    this.f14078b = ((a) obj2).f14072b;
                    return obj;
                }
                throw new ConcurrentModificationException("Hash code of an element (" + obj + ") has changed after it was added to the persistent set.");
            case 1:
                if (this.f14079c < 0) {
                    a();
                }
                if (this.f14079c == 0) {
                    throw new NoSuchElementException();
                }
                Object obj3 = this.f14078b;
                m.d(obj3, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
                this.f14079c = -1;
                return obj3;
            case 2:
                break;
            default:
                return ((i) this.f14078b).next();
        }
        while (true) {
            int i10 = this.f14079c;
            lVar = (l) this.f14080d;
            int i11 = lVar.f20361b;
            it = (Iterator) this.f14078b;
            if (i10 < i11 && it.hasNext()) {
                it.next();
                this.f14079c++;
            }
        }
        int i12 = this.f14079c;
        if (i12 >= lVar.f20362c) {
            throw new NoSuchElementException();
        }
        this.f14079c = i12 + 1;
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f14077a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                int i10 = this.f14079c;
                if (i10 != -1) {
                    ((B) this.f14080d).k(i10);
                    this.f14079c = -1;
                    return;
                }
                return;
        }
    }

    public c(l lVar) {
        this.f14077a = 2;
        this.f14080d = lVar;
        this.f14078b = lVar.f20360a.iterator();
    }

    public c(j jVar) {
        this.f14077a = 1;
        this.f14080d = jVar;
        this.f14079c = -2;
    }

    public c(B b10) {
        this.f14077a = 3;
        this.f14080d = b10;
        this.f14079c = -1;
        this.f14078b = R3.a.S(new z(b10, this, null));
    }
}
