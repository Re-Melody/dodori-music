package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public interface b0 {
    default Z create(Class modelClass) {
        kotlin.jvm.internal.m.f(modelClass, "modelClass");
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    default Z create(Class cls, p165p2.c extras) {
        kotlin.jvm.internal.m.f(extras, "extras");
        return create(cls);
    }

    default Z create(p075g9.c cVar, p165p2.c cVar2) {
        return create(p025b9.a.B(cVar), cVar2);
    }
}
