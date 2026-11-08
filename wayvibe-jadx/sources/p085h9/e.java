package p085h9;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.m;
import p013a9.a;

/* JADX INFO: loaded from: classes2.dex */
public final class e implements Iterator, a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Iterator f20346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f20347c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f20348d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h f20349e;

    public e(f fVar) {
        this.f20345a = 0;
        this.f20349e = fVar;
        this.f20346b = fVar.f20350a.iterator();
        this.f20347c = -1;
    }

    public void a() {
        Object next;
        f fVar;
        do {
            Iterator it = this.f20346b;
            if (!it.hasNext()) {
                this.f20347c = 0;
                return;
            } else {
                next = it.next();
                fVar = (f) this.f20349e;
            }
        } while (((Boolean) fVar.f20352c.invoke(next)).booleanValue() != fVar.f20351b);
        this.f20348d = next;
        this.f20347c = 1;
    }

    public boolean b() {
        Iterator it;
        Iterator it2 = (Iterator) this.f20348d;
        if (it2 != null && it2.hasNext()) {
            this.f20347c = 1;
            return true;
        }
        do {
            Iterator it3 = this.f20346b;
            if (!it3.hasNext()) {
                this.f20347c = 2;
                this.f20348d = null;
                return false;
            }
            Object next = it3.next();
            g gVar = (g) this.f20349e;
            gVar.getClass();
            it = (Iterator) k.f20359a.invoke(gVar.f20355c.invoke(next));
        } while (!it.hasNext());
        this.f20348d = it;
        this.f20347c = 1;
        return true;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f20345a) {
            case 0:
                if (this.f20347c == -1) {
                    a();
                }
                return this.f20347c == 1;
            default:
                int i10 = this.f20347c;
                if (i10 == 1) {
                    return true;
                }
                if (i10 == 2) {
                    return false;
                }
                return b();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f20345a) {
            case 0:
                if (this.f20347c == -1) {
                    a();
                }
                if (this.f20347c == 0) {
                    throw new NoSuchElementException();
                }
                Object obj = this.f20348d;
                this.f20348d = null;
                this.f20347c = -1;
                return obj;
            default:
                int i10 = this.f20347c;
                if (i10 == 2) {
                    throw new NoSuchElementException();
                }
                if (i10 == 0 && !b()) {
                    throw new NoSuchElementException();
                }
                this.f20347c = 0;
                Iterator it = (Iterator) this.f20348d;
                m.c(it);
                return it.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f20345a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public e(g gVar) {
        this.f20345a = 1;
        this.f20349e = gVar;
        this.f20346b = gVar.f20354b.iterator();
    }
}
