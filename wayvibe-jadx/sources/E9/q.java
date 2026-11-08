package E9;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class q extends AbstractC0355p {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y f3409c;

    public q(y delegate) {
        kotlin.jvm.internal.m.f(delegate, "delegate");
        this.f3409c = delegate;
    }

    @Override // E9.AbstractC0355p
    public final M A(C file) {
        kotlin.jvm.internal.m.f(file, "file");
        return this.f3409c.A(file);
    }

    public final K B(C file) {
        kotlin.jvm.internal.m.f(file, "file");
        this.f3409c.getClass();
        kotlin.jvm.internal.m.f(file, "file");
        return new C0343d(1, new FileOutputStream(file.e(), true), new O());
    }

    public final void C(C source, C target) throws IOException {
        kotlin.jvm.internal.m.f(source, "source");
        kotlin.jvm.internal.m.f(target, "target");
        this.f3409c.B(source, target);
    }

    @Override // E9.AbstractC0355p
    public final void c(C dir) throws IOException {
        kotlin.jvm.internal.m.f(dir, "dir");
        this.f3409c.c(dir);
    }

    @Override // E9.AbstractC0355p, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f3409c.getClass();
    }

    @Override // E9.AbstractC0355p
    public final void e(C path) throws IOException {
        kotlin.jvm.internal.m.f(path, "path");
        this.f3409c.e(path);
    }

    @Override // E9.AbstractC0355p
    public final List q(C dir) throws IOException {
        kotlin.jvm.internal.m.f(dir, "dir");
        List listQ = this.f3409c.q(dir);
        ArrayList arrayList = new ArrayList();
        for (C path : (ArrayList) listQ) {
            kotlin.jvm.internal.m.f(path, "path");
            arrayList.add(path);
        }
        N8.q.q0(arrayList);
        return arrayList;
    }

    public final String toString() {
        return kotlin.jvm.internal.z.a(getClass()).c() + '(' + this.f3409c + ')';
    }

    @Override // E9.AbstractC0355p
    public final C0354o w(C path) {
        kotlin.jvm.internal.m.f(path, "path");
        C0354o c0354oW = this.f3409c.w(path);
        if (c0354oW == null) {
            return null;
        }
        C c3 = (C) c0354oW.f3401d;
        if (c3 == null) {
            return c0354oW;
        }
        Map extras = (Map) c0354oW.f3406i;
        kotlin.jvm.internal.m.f(extras, "extras");
        return new C0354o(c0354oW.f3399b, c0354oW.f3400c, c3, (Long) c0354oW.f3402e, (Long) c0354oW.f3403f, (Long) c0354oW.f3404g, (Long) c0354oW.f3405h, extras);
    }

    @Override // E9.AbstractC0355p
    public final x x(C c3) {
        return this.f3409c.x(c3);
    }

    @Override // E9.AbstractC0355p
    public K z(C file) {
        kotlin.jvm.internal.m.f(file, "file");
        return this.f3409c.z(file);
    }
}
