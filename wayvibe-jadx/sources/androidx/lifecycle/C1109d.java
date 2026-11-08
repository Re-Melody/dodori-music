package androidx.lifecycle;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: androidx.lifecycle.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1109d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1109d f15549c = new C1109d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f15550a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f15551b = new HashMap();

    public static void b(HashMap map, C1108c c1108c, EnumC1119n enumC1119n, Class cls) {
        EnumC1119n enumC1119n2 = (EnumC1119n) map.get(c1108c);
        if (enumC1119n2 == null || enumC1119n == enumC1119n2) {
            if (enumC1119n2 == null) {
                map.put(c1108c, enumC1119n);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + c1108c.f15548b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + enumC1119n2 + ", new value " + enumC1119n);
    }

    public final C1107b a(Class cls, Method[] methodArr) {
        int i10;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        HashMap map2 = this.f15550a;
        if (superclass != null) {
            C1107b c1107bA = (C1107b) map2.get(superclass);
            if (c1107bA == null) {
                c1107bA = a(superclass, null);
            }
            map.putAll(c1107bA.f15546b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            C1107b c1107bA2 = (C1107b) map2.get(cls2);
            if (c1107bA2 == null) {
                c1107bA2 = a(cls2, null);
            }
            for (Map.Entry entry : c1107bA2.f15546b.entrySet()) {
                b(map, (C1108c) entry.getKey(), (EnumC1119n) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e2) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e2);
            }
        }
        boolean z10 = false;
        for (Method method : methodArr) {
            E e4 = (E) method.getAnnotation(E.class);
            if (e4 != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i10 = 0;
                } else {
                    if (!InterfaceC1125u.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i10 = 1;
                }
                EnumC1119n enumC1119nValue = e4.value();
                if (parameterTypes.length > 1) {
                    if (!EnumC1119n.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (enumC1119nValue != EnumC1119n.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i10 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                b(map, new C1108c(i10, method), enumC1119nValue, cls);
                z10 = true;
            }
        }
        C1107b c1107b = new C1107b(map);
        map2.put(cls, c1107b);
        this.f15551b.put(cls, Boolean.valueOf(z10));
        return c1107b;
    }
}
