package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public class d0 implements b0 {
    public static final c0 Companion = new c0();
    public static final p165p2.b VIEW_MODEL_KEY = p183r2.c.f25759a;
    private static d0 _instance;

    public static final d0 getInstance() {
        Companion.getClass();
        if (_instance == null) {
            _instance = new d0();
        }
        d0 d0Var = _instance;
        kotlin.jvm.internal.m.c(d0Var);
        return d0Var;
    }

    @Override // androidx.lifecycle.b0
    public Z create(Class modelClass) {
        kotlin.jvm.internal.m.f(modelClass, "modelClass");
        return p025b9.a.v(modelClass);
    }

    @Override // androidx.lifecycle.b0
    public <T extends Z> T create(Class<T> modelClass, p165p2.c extras) {
        kotlin.jvm.internal.m.f(modelClass, "modelClass");
        kotlin.jvm.internal.m.f(extras, "extras");
        return (T) create(modelClass);
    }

    @Override // androidx.lifecycle.b0
    public <T extends Z> T create(p075g9.c modelClass, p165p2.c extras) {
        kotlin.jvm.internal.m.f(modelClass, "modelClass");
        kotlin.jvm.internal.m.f(extras, "extras");
        return (T) create(p025b9.a.B(modelClass), extras);
    }
}
