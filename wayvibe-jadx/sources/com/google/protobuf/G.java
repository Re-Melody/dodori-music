package com.google.protobuf;

/* JADX INFO: loaded from: classes.dex */
public abstract class G implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J f18673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public J f18674b;

    public G(J j10) {
        this.f18673a = j10;
        if (j10.l()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f18674b = j10.o();
    }

    public static void e(Object obj, Object obj2) {
        C1280z0 c1280z0 = C1280z0.f18824c;
        c1280z0.getClass();
        c1280z0.a(obj.getClass()).a(obj, obj2);
    }

    public final J b() {
        J jC = c();
        jC.getClass();
        if (J.k(jC, true)) {
            return jC;
        }
        throw new O0();
    }

    public final J c() {
        if (!this.f18674b.l()) {
            return this.f18674b;
        }
        J j10 = this.f18674b;
        j10.getClass();
        C1280z0 c1280z0 = C1280z0.f18824c;
        c1280z0.getClass();
        c1280z0.a(j10.getClass()).b(j10);
        j10.m();
        return this.f18674b;
    }

    public final Object clone() {
        G g3 = (G) this.f18673a.h(I.NEW_BUILDER);
        g3.f18674b = c();
        return g3;
    }

    public final void d() {
        if (this.f18674b.l()) {
            return;
        }
        J jO = this.f18673a.o();
        e(jO, this.f18674b);
        this.f18674b = jO;
    }
}
