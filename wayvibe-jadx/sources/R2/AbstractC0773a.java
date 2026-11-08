package R2;

import B2.AbstractC0111a;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p255y2.C2346w;

/* JADX INFO: renamed from: R2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0773a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f10777a = new ArrayList(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashSet f10778b = new HashSet(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final K2.f f10779c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final K2.f f10780d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Looper f10781e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public p255y2.O f10782f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public G2.m f10783g;

    public AbstractC0773a() {
        int i10 = 0;
        D d10 = null;
        this.f10779c = new K2.f(new CopyOnWriteArrayList(), i10, d10);
        this.f10780d = new K2.f(new CopyOnWriteArrayList(), i10, d10);
    }

    public final K2.f a(D d10) {
        return new K2.f(this.f10779c.f7360c, 0, d10);
    }

    public abstract C b(D d10, V2.e eVar, long j10);

    public final void c(E e2) {
        HashSet hashSet = this.f10778b;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.remove(e2);
        if (zIsEmpty || !hashSet.isEmpty()) {
            return;
        }
        d();
    }

    public final void e(E e2) {
        this.f10781e.getClass();
        HashSet hashSet = this.f10778b;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.add(e2);
        if (zIsEmpty) {
            f();
        }
    }

    public p255y2.O g() {
        return null;
    }

    public abstract C2346w h();

    public boolean i() {
        return !(this instanceof r);
    }

    public abstract void j();

    public final void k(E e2, D2.B b10, G2.m mVar) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.f10781e;
        AbstractC0111a.d(looper == null || looper == looperMyLooper);
        this.f10783g = mVar;
        p255y2.O o10 = this.f10782f;
        this.f10777a.add(e2);
        if (this.f10781e == null) {
            this.f10781e = looperMyLooper;
            this.f10778b.add(e2);
            l(b10);
        } else if (o10 != null) {
            e(e2);
            e2.a(this, o10);
        }
    }

    public abstract void l(D2.B b10);

    public final void m(p255y2.O o10) {
        this.f10782f = o10;
        Iterator it = this.f10777a.iterator();
        while (it.hasNext()) {
            ((E) it.next()).a(this, o10);
        }
    }

    public abstract void n(C c3);

    public final void o(E e2) {
        ArrayList arrayList = this.f10777a;
        arrayList.remove(e2);
        if (!arrayList.isEmpty()) {
            c(e2);
            return;
        }
        this.f10781e = null;
        this.f10782f = null;
        this.f10783g = null;
        this.f10778b.clear();
        p();
    }

    public abstract void p();

    public final void q(K2.g gVar) {
        CopyOnWriteArrayList<K2.e> copyOnWriteArrayList = this.f10780d.f7360c;
        for (K2.e eVar : copyOnWriteArrayList) {
            if (eVar.f7357a == gVar) {
                copyOnWriteArrayList.remove(eVar);
            }
        }
    }

    public final void r(H h10) {
        CopyOnWriteArrayList<G> copyOnWriteArrayList = this.f10779c.f7360c;
        for (G g3 : copyOnWriteArrayList) {
            if (g3.f10662b == h10) {
                copyOnWriteArrayList.remove(g3);
            }
        }
    }

    public void d() {
    }

    public void f() {
    }

    public void s(C2346w c2346w) {
    }
}
