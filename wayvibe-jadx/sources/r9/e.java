package r9;

import java.util.concurrent.Executor;
import p119k9.AbstractC2003a0;
import p119k9.AbstractC2040y;
import p9.s;

/* JADX INFO: loaded from: classes2.dex */
public final class e extends AbstractC2003a0 implements Executor {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f26007c = new e();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AbstractC2040y f26008d;

    static {
        m mVar = m.f26021c;
        int i10 = s.f25341a;
        if (64 >= i10) {
            i10 = 64;
        }
        f26008d = mVar.x(p9.a.j(i10, 12, "kotlinx.coroutines.io.parallelism"));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        l(Q8.j.f10595a, runnable);
    }

    @Override // p119k9.AbstractC2040y
    public final void l(Q8.i iVar, Runnable runnable) {
        f26008d.l(iVar, runnable);
    }

    @Override // p119k9.AbstractC2040y
    public final String toString() {
        return "Dispatchers.IO";
    }

    @Override // p119k9.AbstractC2040y
    public final void v(Q8.i iVar, Runnable runnable) {
        f26008d.v(iVar, runnable);
    }

    @Override // p119k9.AbstractC2040y
    public final AbstractC2040y x(int i10) {
        return m.f26021c.x(1);
    }
}
