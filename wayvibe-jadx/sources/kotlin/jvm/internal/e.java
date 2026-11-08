package kotlin.jvm.internal;

import D7.W;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class e implements p075g9.c, d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map f21863b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f21864a;

    static {
        List listU = W.U(Z8.a.class, Z8.c.class, Z8.e.class, Z8.f.class, Z8.g.class, Z8.h.class, Z8.i.class, Z8.j.class, c0.b.class, c0.b.class, c0.b.class, c0.b.class, Z8.b.class, c0.b.class, c0.b.class, c0.b.class, c0.b.class, c0.b.class, c0.b.class, c0.b.class, c0.b.class, c0.b.class, Z8.d.class);
        ArrayList arrayList = new ArrayList(N8.o.o0(listU, 10));
        int i10 = 0;
        for (Object obj : listU) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                W.k0();
                throw null;
            }
            arrayList.add(new M8.l((Class) obj, Integer.valueOf(i10)));
            i10 = i11;
        }
        f21863b = N8.y.p0(arrayList);
    }

    public e(Class jClass) {
        m.f(jClass, "jClass");
        this.f21864a = jClass;
    }

    @Override // kotlin.jvm.internal.d
    public final Class a() {
        return this.f21864a;
    }

    public final String b() {
        String strE;
        Class jClass = this.f21864a;
        m.f(jClass, "jClass");
        String strConcat = null;
        if (jClass.isAnonymousClass() || jClass.isLocalClass()) {
            return null;
        }
        if (!jClass.isArray()) {
            String strE2 = B.e(jClass.getName());
            return strE2 == null ? jClass.getCanonicalName() : strE2;
        }
        Class<?> componentType = jClass.getComponentType();
        if (componentType.isPrimitive() && (strE = B.e(componentType.getName())) != null) {
            strConcat = strE.concat("Array");
        }
        return strConcat == null ? "kotlin.Array" : strConcat;
    }

    public final String c() {
        String strG;
        Class jClass = this.f21864a;
        m.f(jClass, "jClass");
        String strConcat = null;
        if (jClass.isAnonymousClass()) {
            return null;
        }
        if (!jClass.isLocalClass()) {
            if (!jClass.isArray()) {
                String strG2 = B.g(jClass.getName());
                return strG2 == null ? jClass.getSimpleName() : strG2;
            }
            Class<?> componentType = jClass.getComponentType();
            if (componentType.isPrimitive() && (strG = B.g(componentType.getName())) != null) {
                strConcat = strG.concat("Array");
            }
            return strConcat == null ? "Array" : strConcat;
        }
        String simpleName = jClass.getSimpleName();
        Method enclosingMethod = jClass.getEnclosingMethod();
        if (enclosingMethod != null) {
            return p097i9.k.M0(simpleName, enclosingMethod.getName() + '$', simpleName);
        }
        Constructor<?> enclosingConstructor = jClass.getEnclosingConstructor();
        if (enclosingConstructor == null) {
            return p097i9.k.L0('$', simpleName, simpleName);
        }
        return p097i9.k.M0(simpleName, enclosingConstructor.getName() + '$', simpleName);
    }

    public final boolean d(Object obj) {
        Class jClass = this.f21864a;
        m.f(jClass, "jClass");
        Map map = f21863b;
        m.d(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        Integer num = (Integer) map.get(jClass);
        if (num != null) {
            return B.f(num.intValue(), obj);
        }
        if (jClass.isPrimitive()) {
            jClass = p025b9.a.C(z.a(jClass));
        }
        return jClass.isInstance(obj);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof e) && p025b9.a.C(this).equals(p025b9.a.C((p075g9.c) obj));
    }

    public final int hashCode() {
        return p025b9.a.C(this).hashCode();
    }

    public final String toString() {
        return this.f21864a.toString() + " (Kotlin reflection is not available)";
    }
}
