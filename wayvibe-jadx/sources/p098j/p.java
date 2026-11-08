package p098j;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class p implements Executor {
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        new Thread(runnable).start();
    }
}
