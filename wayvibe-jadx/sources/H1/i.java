package H1;

import android.os.Process;

/* JADX INFO: loaded from: classes.dex */
public final class i extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5761a;

    public i(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.f5761a = 10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.f5761a);
        super.run();
    }
}
