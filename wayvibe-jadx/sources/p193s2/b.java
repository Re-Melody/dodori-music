package p193s2;

import A9.C0108h;
import F5.d;
import androidx.lifecycle.C;
import androidx.lifecycle.D;

/* JADX INFO: loaded from: classes.dex */
public final class b extends C {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final d f26067l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Object f26068m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public C0108h f26069n;

    public b(d dVar) {
        this.f26067l = dVar;
        if (dVar.f4530a != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        dVar.f4530a = this;
    }

    @Override // androidx.lifecycle.B
    public final void e() {
        d dVar = this.f26067l;
        dVar.f4531b = true;
        dVar.f4533d = false;
        dVar.f4532c = false;
        dVar.f4538i.drainPermits();
        dVar.c();
    }

    @Override // androidx.lifecycle.B
    public final void f() {
        this.f26067l.f4531b = false;
    }

    @Override // androidx.lifecycle.B
    public final void g(D d10) {
        super.g(d10);
        this.f26068m = null;
        this.f26069n = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.lifecycle.u, java.lang.Object] */
    public final void i() {
        ?? r10 = this.f26068m;
        C0108h c0108h = this.f26069n;
        if (r10 == 0 || c0108h == null) {
            return;
        }
        super.g(c0108h);
        d(r10, c0108h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append("LoaderInfo{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" #0 : ");
        Class<?> cls = this.f26067l.getClass();
        sb.append(cls.getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(cls)));
        sb.append("}}");
        return sb.toString();
    }
}
