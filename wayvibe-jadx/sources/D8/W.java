package D8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes2.dex */
public final class W implements B, Ea.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile boolean f2397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f2398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Collection f2399c;

    public W() {
        this.f2397a = false;
        this.f2398b = new ConcurrentHashMap();
        this.f2399c = new LinkedBlockingQueue();
    }

    @Override // Ea.a
    public synchronized Ea.b a(String str) {
        org.slf4j.helpers.g gVar;
        gVar = (org.slf4j.helpers.g) ((ConcurrentHashMap) this.f2398b).get(str);
        if (gVar == null) {
            gVar = new org.slf4j.helpers.g(str, (LinkedBlockingQueue) this.f2399c, this.f2397a);
            ((ConcurrentHashMap) this.f2398b).put(str, gVar);
        }
        return gVar;
    }

    public void b(Runnable runnable) {
        synchronized (this) {
            try {
                if (this.f2397a) {
                    runnable.run();
                } else {
                    ((List) this.f2399c).add(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // D8.B
    public void q(B8.r0 r0Var, A a10, B8.e0 e0Var) {
        b(new RunnableC0257a(this, r0Var, a10, e0Var, 1));
    }

    @Override // D8.B
    public void t(B8.e0 e0Var) {
        b(new K(12, this, e0Var));
    }

    @Override // D8.B
    public void u() {
        if (this.f2397a) {
            ((B) this.f2398b).u();
        } else {
            b(new O(this, 1));
        }
    }

    @Override // D8.B
    public void x(F5.i iVar) {
        if (this.f2397a) {
            ((B) this.f2398b).x(iVar);
        } else {
            b(new K(11, this, iVar));
        }
    }

    public W(B b10) {
        this.f2399c = new ArrayList();
        this.f2398b = b10;
    }
}
