package p033c7;

import X2.w;
import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public final class a implements ThreadFactory {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ThreadFactory f15948e = Executors.defaultThreadFactory();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicLong f15949a = new AtomicLong();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f15950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f15951c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final StrictMode.ThreadPolicy f15952d;

    public a(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        this.f15950b = str;
        this.f15951c = i10;
        this.f15952d = threadPolicy;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = f15948e.newThread(new w(7, this, runnable));
        Locale locale = Locale.ROOT;
        threadNewThread.setName(this.f15950b + " Thread #" + this.f15949a.getAndIncrement());
        return threadNewThread;
    }
}
