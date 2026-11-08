package p119k9;

import Q8.j;
import java.util.concurrent.Executor;
import r9.e;

/* JADX INFO: loaded from: classes2.dex */
public final class N implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f21696a;

    public N(e eVar) {
        this.f21696a = eVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        j jVar = j.f10595a;
        e eVar = this.f21696a;
        eVar.getClass();
        eVar.l(jVar, runnable);
    }

    public final String toString() {
        this.f21696a.getClass();
        return "Dispatchers.IO";
    }
}
