package B8;

import com.google.protobuf.AbstractC1230a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;

/* JADX INFO: loaded from: classes2.dex */
public abstract class A {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.util.ArrayList] */
    public static List f(Class cls, List list, ClassLoader classLoader, p0 p0Var) {
        ?? Load;
        Object objNewInstance;
        int i10 = 0;
        try {
            Class.forName("android.app.Application", false, classLoader);
            Load = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Class cls2 = (Class) it.next();
                try {
                    objNewInstance = cls2.asSubclass(cls).getConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (ClassCastException unused) {
                    objNewInstance = null;
                } catch (Throwable th) {
                    throw new ServiceConfigurationError(String.format("Provider %s could not be instantiated %s", cls2.getName(), th), th);
                }
                if (objNewInstance != null) {
                    Load.add(objNewInstance);
                }
            }
        } catch (Exception unused2) {
            ServiceLoader serviceLoaderLoad = ServiceLoader.load(cls, classLoader);
            Load = !serviceLoaderLoad.iterator().hasNext() ? ServiceLoader.load(cls) : serviceLoaderLoad;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : Load) {
            if (p0Var.b(obj)) {
                arrayList.add(obj);
            }
        }
        Collections.sort(arrayList, Collections.reverseOrder(new o0(p0Var, i10)));
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000f  */
    public C0135w a() {
        boolean z10;
        List listB = b();
        if (listB != null) {
            z10 = listB.size() == 1;
        }
        p229v9.a.n(listB, "%s does not have exactly one group", z10);
        return (C0135w) listB.get(0);
    }

    public abstract List b();

    public abstract C0115b c();

    public abstract AbstractC0120g d();

    public abstract Object e();

    public abstract void g(r0 r0Var, e0 e0Var);

    public abstract void h(r0 r0Var);

    public abstract void j(AbstractC1230a abstractC1230a);

    public abstract void l(k0 k0Var);

    public abstract void m();

    public abstract void n();

    public abstract void o(P p10);

    public abstract void p(List list);

    public void k() {
    }

    public void i(e0 e0Var) {
    }
}
