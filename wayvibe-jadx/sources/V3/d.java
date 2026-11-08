package V3;

import M8.D;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class d implements InvocationHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kotlin.jvm.internal.e f12553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p020b4.b f12554b;

    public d(kotlin.jvm.internal.e eVar, p020b4.b bVar) {
        this.f12553a = eVar;
        this.f12554b = bVar;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        m.f(obj, "obj");
        m.f(method, "method");
        boolean zB = m.b(method.getName(), "accept");
        p020b4.b bVar = this.f12554b;
        if (zB && objArr != null && objArr.length == 1) {
            Object obj2 = objArr[0];
            kotlin.jvm.internal.e eVar = this.f12553a;
            if (eVar.d(obj2)) {
                m.d(obj2, "null cannot be cast to non-null type T of kotlin.reflect.KClasses.cast");
                bVar.invoke(obj2);
                return D.f8402a;
            }
            throw new ClassCastException("Value cannot be cast to " + eVar.b());
        }
        if (m.b(method.getName(), "equals") && method.getReturnType().equals(Boolean.TYPE) && objArr != null && objArr.length == 1) {
            return Boolean.valueOf(obj == objArr[0]);
        }
        if (m.b(method.getName(), "hashCode") && method.getReturnType().equals(Integer.TYPE) && objArr == null) {
            return Integer.valueOf(bVar.hashCode());
        }
        if (m.b(method.getName(), "toString") && method.getReturnType().equals(String.class) && objArr == null) {
            return bVar.toString();
        }
        throw new UnsupportedOperationException("Unexpected method call object:" + obj + ", method: " + method + ", args: " + objArr);
    }
}
