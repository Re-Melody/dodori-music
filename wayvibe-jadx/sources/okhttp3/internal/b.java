package okhttp3.internal;

import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f24165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f24166b;

    public /* synthetic */ b(String str, boolean z10) {
        this.f24165a = str;
        this.f24166b = z10;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        TimeZone timeZone = _UtilJvmKt.f24160a;
        Thread thread = new Thread(runnable, this.f24165a);
        thread.setDaemon(this.f24166b);
        return thread;
    }
}
