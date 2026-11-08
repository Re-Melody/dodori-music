package Z9;

import com.google.firebase.firestore.h0;
import com.google.firebase.firestore.i0;
import com.google.protobuf.AbstractC1252l;
import com.google.protobuf.C1250k;
import com.google.protobuf.D0;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p140m7.V;

/* JADX INFO: loaded from: classes2.dex */
public final class s implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14051a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f14052b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f14053c;

    public s(r rVar, y yVar) {
        this.f14052b = rVar;
        this.f14053c = yVar;
    }

    public C1250k a() {
        C1250k c1250k;
        C1250k c1250k2 = (C1250k) this.f14053c;
        if (c1250k2 == null) {
            throw new NoSuchElementException();
        }
        do {
            ArrayDeque arrayDeque = (ArrayDeque) this.f14052b;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                c1250k = null;
                break;
            }
            AbstractC1252l abstractC1252l = ((D0) arrayDeque.pop()).f18665f;
            while (abstractC1252l instanceof D0) {
                D0 d10 = (D0) abstractC1252l;
                arrayDeque.push(d10);
                abstractC1252l = d10.f18664e;
            }
            c1250k = (C1250k) abstractC1252l;
        } while (c1250k.isEmpty());
        this.f14053c = c1250k;
        return c1250k2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f14051a) {
            case 0:
                r rVar = (r) this.f14052b;
                return (rVar == null || rVar == ((y) this.f14053c)) ? false : true;
            case 1:
                return ((Iterator) ((p044d7.d) this.f14052b).f19302b).hasNext();
            default:
                return ((C1250k) this.f14053c) != null;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f14051a) {
            case 0:
                r rVar = (r) this.f14052b;
                this.f14052b = rVar.f14049e;
                return rVar;
            case 1:
                p170p7.n nVar = (p170p7.n) ((p044d7.d) this.f14052b).next();
                i0 i0Var = (i0) this.f14053c;
                V v3 = i0Var.f18602b;
                return new h0(i0Var.f18603c, nVar.f25269a, nVar, v3.f22440e, v3.f22441f.f19303a.a(nVar.f25269a));
            default:
                return a();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f14051a) {
            case 0:
                throw new UnsupportedOperationException("remove");
            case 1:
                throw new UnsupportedOperationException("QuerySnapshot does not support remove().");
            default:
                throw new UnsupportedOperationException();
        }
    }

    public s(i0 i0Var, p044d7.d dVar) {
        this.f14053c = i0Var;
        this.f14052b = dVar;
    }

    public s(AbstractC1252l abstractC1252l) {
        if (abstractC1252l instanceof D0) {
            D0 d10 = (D0) abstractC1252l;
            ArrayDeque arrayDeque = new ArrayDeque(d10.f18667h);
            this.f14052b = arrayDeque;
            arrayDeque.push(d10);
            AbstractC1252l abstractC1252l2 = d10.f18664e;
            while (abstractC1252l2 instanceof D0) {
                D0 d11 = (D0) abstractC1252l2;
                ((ArrayDeque) this.f14052b).push(d11);
                abstractC1252l2 = d11.f18664e;
            }
            this.f14053c = (C1250k) abstractC1252l2;
            return;
        }
        this.f14052b = null;
        this.f14053c = (C1250k) abstractC1252l;
    }
}
