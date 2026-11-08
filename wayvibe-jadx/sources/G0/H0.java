package G0;

import T0.InterfaceC0815s;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class H0 implements Q8.h, InterfaceC0815s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ H0 f5009a = new H0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u1 f5010b = new u1();

    public static final boolean a() {
        Class cls = A.f4867Q0;
        try {
            if (A.f4867Q0 == null) {
                Class<?> cls2 = Class.forName(com.amazon.a.a.o.b.at);
                A.f4867Q0 = cls2;
                A.f4868R0 = cls2.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE);
            }
            Method method = A.f4868R0;
            Object objInvoke = method != null ? method.invoke(null, "debug.layout", Boolean.FALSE) : null;
            Boolean bool = objInvoke instanceof Boolean ? (Boolean) objInvoke : null;
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }
}
