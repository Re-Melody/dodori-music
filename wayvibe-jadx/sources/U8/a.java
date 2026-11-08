package U8;

import java.lang.reflect.Method;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Method f12332a;

    static {
        Method method;
        Method[] methods = Throwable.class.getMethods();
        m.c(methods);
        int length = methods.length;
        int i10 = 0;
        while (true) {
            method = null;
            if (i10 >= length) {
                break;
            }
            Method method2 = methods[i10];
            if (m.b(method2.getName(), "addSuppressed")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                m.e(parameterTypes, "getParameterTypes(...)");
                if (m.b(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                    method = method2;
                    break;
                }
            }
            i10++;
        }
        f12332a = method;
        int length2 = methods.length;
        for (int i11 = 0; i11 < length2 && !m.b(methods[i11].getName(), "getSuppressed"); i11++) {
        }
    }
}
