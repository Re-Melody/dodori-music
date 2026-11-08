package Fa;

import java.io.Serializable;
import java.util.concurrent.LinkedBlockingQueue;
import org.slf4j.helpers.g;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements Ea.b, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f4675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public g f4676b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LinkedBlockingQueue f4677c;

    @Override // Ea.b
    public final void A(Object obj, String str) {
        d(b.DEBUG, new Object[]{obj});
    }

    @Override // Ea.b
    public final void C(String str, Object obj, Serializable serializable) {
        a(b.DEBUG, str, obj, serializable);
    }

    @Override // Ea.b
    public final void D(Integer num, String str) {
        d(b.INFO, new Object[]{num});
    }

    @Override // Ea.b
    public final void E(String str, Serializable serializable) {
        d(b.TRACE, new Object[]{serializable});
    }

    @Override // Ea.b
    public final void F(String str, Object obj, Serializable serializable) {
        a(b.INFO, str, obj, serializable);
    }

    public final void a(b bVar, String str, Object obj, Object obj2) {
        if (obj2 instanceof Throwable) {
            d(bVar, new Object[]{obj});
        } else {
            d(bVar, new Object[]{obj, obj2});
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0010  */
    public final void b(b bVar, String str, Object[] objArr) {
        Throwable th;
        if (objArr.length == 0) {
            th = null;
        } else {
            Object obj = objArr[objArr.length - 1];
            if (obj instanceof Throwable) {
                th = (Throwable) obj;
            } else {
                th = null;
            }
        }
        if (th == null) {
            d(bVar, objArr);
            return;
        }
        if (objArr.length == 0) {
            throw new IllegalStateException("non-sensical empty or null argument array");
        }
        int length = objArr.length - 1;
        Object[] objArr2 = new Object[length];
        if (length > 0) {
            System.arraycopy(objArr, 0, objArr2, 0, length);
        }
        d(bVar, objArr2);
    }

    public final void d(b bVar, Object[] objArr) {
        c cVar = new c();
        System.currentTimeMillis();
        cVar.f4678a = bVar;
        cVar.f4679b = this.f4676b;
        Thread.currentThread().getName();
        cVar.f4680c = objArr;
        this.f4677c.add(cVar);
    }

    @Override // Ea.b
    public final boolean f() {
        return true;
    }

    @Override // Ea.b
    public final boolean g() {
        return true;
    }

    @Override // Ea.b
    public final String getName() {
        return this.f4675a;
    }

    @Override // Ea.b
    public final void h(String str) {
        d(b.ERROR, null);
    }

    @Override // Ea.b
    public final void i(String str, Throwable th) {
        d(b.ERROR, null);
    }

    @Override // Ea.b
    public final boolean k() {
        return true;
    }

    @Override // Ea.b
    public final void l(String str, Object... objArr) {
        b(b.WARN, str, objArr);
    }

    @Override // Ea.b
    public final boolean m() {
        return true;
    }

    @Override // Ea.b
    public final void n(String str) {
        d(b.DEBUG, null);
    }

    @Override // Ea.b
    public final boolean o() {
        return true;
    }

    @Override // Ea.b
    public final void p(String str, Object obj, Serializable serializable) {
        a(b.TRACE, str, obj, serializable);
    }

    @Override // Ea.b
    public final void q(String str, Object obj) {
        d(b.ERROR, new Object[]{obj});
    }

    @Override // Ea.b
    public final void r(String str, Object... objArr) {
        b(b.DEBUG, str, objArr);
    }

    @Override // Ea.b
    public final void s(Object... objArr) {
        b(b.ERROR, "pipesClientId={} didn't receive ready byte from server within StartupTimeoutMillis {}; ms elapsed {}; did read >{}<", objArr);
    }

    @Override // Ea.b
    public final void t(Integer num, String str) {
        d(b.WARN, new Object[]{num});
    }

    @Override // Ea.b
    public final void u(String str, Throwable th) {
        d(b.WARN, null);
    }

    @Override // Ea.b
    public final void v(Object obj, String str) {
        a(b.ERROR, "Error assigning value '{}' to '{}'", obj, str);
    }

    @Override // Ea.b
    public final void w(String str, Throwable th) {
        d(b.DEBUG, null);
    }

    @Override // Ea.b
    public final void warn(String str) {
        d(b.WARN, null);
    }

    @Override // Ea.b
    public final void x(String str) {
        d(b.INFO, null);
    }

    @Override // Ea.b
    public final void y(String str) {
        d(b.TRACE, null);
    }

    @Override // Ea.b
    public final void z(Object obj, Object obj2, String str) {
        a(b.WARN, str, obj, obj2);
    }
}
