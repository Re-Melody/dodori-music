package androidx.lifecycle;

import android.os.Looper;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class B {
    public static final Object k = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f15469a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p172q.f f15470b = new p172q.f();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15471c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f15472d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile Object f15473e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile Object f15474f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f15475g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f15476h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f15477i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final D8.O f15478j;

    public B() {
        Object obj = k;
        this.f15474f = obj;
        this.f15478j = new D8.O(this, 24);
        this.f15473e = obj;
        this.f15475g = -1;
    }

    public static void a(String str) {
        p162p.a.e0().f25138b.getClass();
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException(V0.p.o("Cannot invoke ", str, " on a background thread"));
        }
    }

    public final void b(A a10) {
        if (a10.f15466b) {
            if (!a10.e()) {
                a10.a(false);
                return;
            }
            int i10 = a10.f15467c;
            int i11 = this.f15475g;
            if (i10 >= i11) {
                return;
            }
            a10.f15467c = i11;
            a10.f15465a.c(this.f15473e);
        }
    }

    public final void c(A a10) {
        if (this.f15476h) {
            this.f15477i = true;
            return;
        }
        this.f15476h = true;
        do {
            this.f15477i = false;
            if (a10 != null) {
                b(a10);
                a10 = null;
            } else {
                p172q.f fVar = this.f15470b;
                fVar.getClass();
                p172q.d dVar = new p172q.d(fVar);
                fVar.f25376c.put(dVar, Boolean.FALSE);
                while (dVar.hasNext()) {
                    b((A) ((Map.Entry) dVar.next()).getValue());
                    if (this.f15477i) {
                        break;
                    }
                }
            }
        } while (this.f15477i);
        this.f15476h = false;
    }

    public final void d(InterfaceC1125u interfaceC1125u, D d10) {
        Object obj;
        a("observe");
        if (interfaceC1125u.getLifecycle().getCurrentState() == EnumC1120o.DESTROYED) {
            return;
        }
        C1130z c1130z = new C1130z(this, interfaceC1125u, d10);
        p172q.f fVar = this.f15470b;
        p172q.c cVarA = fVar.a(d10);
        if (cVarA != null) {
            obj = cVarA.f25368b;
        } else {
            p172q.c cVar = new p172q.c(d10, c1130z);
            fVar.f25377d++;
            p172q.c cVar2 = fVar.f25375b;
            if (cVar2 == null) {
                fVar.f25374a = cVar;
                fVar.f25375b = cVar;
            } else {
                cVar2.f25369c = cVar;
                cVar.f25370d = cVar2;
                fVar.f25375b = cVar;
            }
            obj = null;
        }
        A a10 = (A) obj;
        if (a10 != null && !a10.d(interfaceC1125u)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (a10 != null) {
            return;
        }
        interfaceC1125u.getLifecycle().addObserver(c1130z);
    }

    public void g(D d10) {
        a("removeObserver");
        A a10 = (A) this.f15470b.c(d10);
        if (a10 == null) {
            return;
        }
        a10.b();
        a10.a(false);
    }

    public abstract void h(Object obj);

    public void e() {
    }

    public void f() {
    }
}
