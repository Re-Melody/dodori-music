package E9;

import java.io.Closeable;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: E9.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0355p implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y f3407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final F9.i f3408b;

    static {
        y yVar;
        try {
            Class.forName("java.nio.file.Files");
            yVar = new A();
        } catch (ClassNotFoundException unused) {
            yVar = new y();
        }
        f3407a = yVar;
        String str = C.f3333b;
        String property = System.getProperty("java.io.tmpdir");
        kotlin.jvm.internal.m.e(property, "getProperty(...)");
        K8.c.p(property);
        ClassLoader classLoader = F9.i.class.getClassLoader();
        kotlin.jvm.internal.m.e(classLoader, "getClassLoader(...)");
        f3408b = new F9.i(classLoader);
    }

    public abstract M A(C c3);

    public final void b(C c3) {
        N8.k kVar = new N8.k();
        while (c3 != null && !l(c3)) {
            kVar.addFirst(c3);
            c3 = c3.b();
        }
        Iterator<E> it = kVar.iterator();
        while (it.hasNext()) {
            c((C) it.next());
        }
    }

    public abstract void c(C c3);

    public abstract void e(C c3);

    public final void g(C path) {
        kotlin.jvm.internal.m.f(path, "path");
        e(path);
    }

    public final boolean l(C path) {
        kotlin.jvm.internal.m.f(path, "path");
        return w(path) != null;
    }

    public abstract List q(C c3);

    public final C0354o v(C path) throws FileNotFoundException {
        kotlin.jvm.internal.m.f(path, "path");
        C0354o c0354oW = w(path);
        if (c0354oW != null) {
            return c0354oW;
        }
        throw new FileNotFoundException("no such file: " + path);
    }

    public abstract C0354o w(C c3);

    public abstract x x(C c3);

    public abstract K z(C c3);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
