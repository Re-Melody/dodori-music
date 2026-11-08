package X4;

import java.io.Serializable;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class i implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Serializable f13231b;

    public i() {
        this.f13230a = 1;
        this.f13231b = new AtomicInteger(0);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f13230a) {
            case 0:
                return new Thread(runnable, (String) this.f13231b);
            default:
                Thread thread = new Thread(runnable);
                thread.setName("arch_disk_io_" + ((AtomicInteger) this.f13231b).getAndIncrement());
                return thread;
        }
    }

    public i(String str) {
        this.f13230a = 0;
        this.f13231b = str;
    }
}
