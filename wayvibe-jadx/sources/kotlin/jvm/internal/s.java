package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes2.dex */
public class s extends t implements p075g9.i {
    public s(Class cls, String str, String str2, int i10) {
        super(c.NO_RECEIVER, cls, str, str2, i10);
    }

    @Override // kotlin.jvm.internal.c
    public final p075g9.b computeReflected() {
        z.f21874a.getClass();
        return this;
    }

    @Override // p075g9.i
    public final void f() {
        ((p075g9.i) getReflected()).f();
    }

    public Object get(Object obj) {
        f();
        throw null;
    }

    @Override // Z8.c
    public final Object invoke(Object obj) {
        return get(obj);
    }
}
