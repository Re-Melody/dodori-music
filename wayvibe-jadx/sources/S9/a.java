package S9;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements InvocationHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f11146a;

    public a(Object obj) {
        this.f11146a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        boolean z10 = obj instanceof a;
        Object obj2 = this.f11146a;
        return z10 ? obj2.equals(((a) obj).f11146a) : obj2.equals(obj);
    }

    public final int hashCode() {
        return this.f11146a.hashCode();
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        Object obj2 = this.f11146a;
        try {
            return Class.forName(method.getDeclaringClass().getName(), true, obj2.getClass().getClassLoader()).getDeclaredMethod(method.getName(), method.getParameterTypes()).invoke(obj2, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getTargetException();
        } catch (ReflectiveOperationException e4) {
            throw new RuntimeException("Reflection failed for method " + method, e4);
        }
    }
}
