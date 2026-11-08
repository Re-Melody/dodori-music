package org.slf4j.helpers;

import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes2.dex */
public final class g implements Ea.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Ea.b f25127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Boolean f25128c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Method f25129d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Fa.a f25130e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinkedBlockingQueue f25131f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f25132g;

    public g(String str, LinkedBlockingQueue linkedBlockingQueue, boolean z10) {
        this.f25126a = str;
        this.f25131f = linkedBlockingQueue;
        this.f25132g = z10;
    }

    @Override // Ea.b
    public final void A(Object obj, String str) {
        a().A(obj, str);
    }

    @Override // Ea.b
    public final boolean B(Fa.b bVar) {
        return a().B(bVar);
    }

    @Override // Ea.b
    public final void C(String str, Object obj, Serializable serializable) {
        a().C(str, obj, serializable);
    }

    @Override // Ea.b
    public final void D(Integer num, String str) {
        a().D(num, str);
    }

    @Override // Ea.b
    public final void E(String str, Serializable serializable) {
        a().E(str, serializable);
    }

    @Override // Ea.b
    public final void F(String str, Object obj, Serializable serializable) {
        a().F(str, obj, serializable);
    }

    public final Ea.b a() {
        if (this.f25127b != null) {
            return this.f25127b;
        }
        if (this.f25132g) {
            return b.f25121a;
        }
        if (this.f25130e == null) {
            Fa.a aVar = new Fa.a();
            aVar.f4676b = this;
            aVar.f4675a = this.f25126a;
            aVar.f4677c = this.f25131f;
            this.f25130e = aVar;
        }
        return this.f25130e;
    }

    public final boolean b() {
        Boolean bool = this.f25128c;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            this.f25129d = this.f25127b.getClass().getMethod("log", Fa.c.class);
            this.f25128c = Boolean.TRUE;
        } catch (NoSuchMethodException unused) {
            this.f25128c = Boolean.FALSE;
        }
        return this.f25128c.booleanValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && g.class == obj.getClass() && this.f25126a.equals(((g) obj).f25126a);
    }

    @Override // Ea.b
    public final boolean f() {
        return a().f();
    }

    @Override // Ea.b
    public final boolean g() {
        return a().g();
    }

    @Override // Ea.b
    public final String getName() {
        return this.f25126a;
    }

    @Override // Ea.b
    public final void h(String str) {
        a().h(str);
    }

    public final int hashCode() {
        return this.f25126a.hashCode();
    }

    @Override // Ea.b
    public final void i(String str, Throwable th) {
        a().i(str, th);
    }

    @Override // Ea.b
    public final boolean k() {
        return a().k();
    }

    @Override // Ea.b
    public final void l(String str, Object... objArr) {
        a().l(str, objArr);
    }

    @Override // Ea.b
    public final boolean m() {
        return a().m();
    }

    @Override // Ea.b
    public final void n(String str) {
        a().n(str);
    }

    @Override // Ea.b
    public final boolean o() {
        return a().o();
    }

    @Override // Ea.b
    public final void p(String str, Object obj, Serializable serializable) {
        a().p(str, obj, serializable);
    }

    @Override // Ea.b
    public final void q(String str, Object obj) {
        a().q(str, obj);
    }

    @Override // Ea.b
    public final void r(String str, Object... objArr) {
        a().r(str, objArr);
    }

    @Override // Ea.b
    public final void s(Object... objArr) {
        a().s(objArr);
    }

    @Override // Ea.b
    public final void t(Integer num, String str) {
        a().t(num, str);
    }

    @Override // Ea.b
    public final void u(String str, Throwable th) {
        a().u(str, th);
    }

    @Override // Ea.b
    public final void v(Object obj, String str) {
        a().v(obj, str);
    }

    @Override // Ea.b
    public final void w(String str, Throwable th) {
        a().w(str, th);
    }

    @Override // Ea.b
    public final void warn(String str) {
        a().warn(str);
    }

    @Override // Ea.b
    public final void x(String str) {
        a().x(str);
    }

    @Override // Ea.b
    public final void y(String str) {
        a().y(str);
    }

    @Override // Ea.b
    public final void z(Object obj, Object obj2, String str) {
        a().z(obj, obj2, str);
    }
}
