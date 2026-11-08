package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: androidx.lifecycle.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1107b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f15545a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f15546b;

    public C1107b(HashMap map) {
        this.f15546b = map;
        for (Map.Entry entry : map.entrySet()) {
            EnumC1119n enumC1119n = (EnumC1119n) entry.getValue();
            List arrayList = (List) this.f15545a.get(enumC1119n);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f15545a.put(enumC1119n, arrayList);
            }
            arrayList.add((C1108c) entry.getKey());
        }
    }

    public static void a(List list, InterfaceC1125u interfaceC1125u, EnumC1119n enumC1119n, InterfaceC1124t interfaceC1124t) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                C1108c c1108c = (C1108c) list.get(size);
                c1108c.getClass();
                try {
                    int i10 = c1108c.f15547a;
                    Method method = c1108c.f15548b;
                    if (i10 == 0) {
                        method.invoke(interfaceC1124t, new Object[0]);
                    } else if (i10 == 1) {
                        method.invoke(interfaceC1124t, interfaceC1125u);
                    } else if (i10 == 2) {
                        method.invoke(interfaceC1124t, interfaceC1125u, enumC1119n);
                    }
                } catch (IllegalAccessException e2) {
                    throw new RuntimeException(e2);
                } catch (InvocationTargetException e4) {
                    throw new RuntimeException("Failed to call observer method", e4.getCause());
                }
            }
        }
    }
}
