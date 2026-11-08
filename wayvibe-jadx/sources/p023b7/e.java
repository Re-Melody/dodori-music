package p023b7;

import android.os.Build;
import android.os.StrictMode;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.Collections;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import p033c7.a;
import p033c7.g;
import p227v7.b;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15779a;

    public /* synthetic */ e(int i10) {
        this.f15779a = i10;
    }

    @Override // p227v7.b
    public final Object get() {
        switch (this.f15779a) {
            case 0:
                return Collections.EMPTY_SET;
            case 1:
                return null;
            case 2:
                m mVar = ExecutorsRegistrar.f18521a;
                StrictMode.ThreadPolicy.Builder builderDetectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
                int i10 = Build.VERSION.SDK_INT;
                builderDetectNetwork.detectResourceMismatches();
                if (i10 >= 26) {
                    builderDetectNetwork.detectUnbufferedIo();
                }
                return new g(Executors.newFixedThreadPool(4, new a("Firebase Background", 10, builderDetectNetwork.penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.f18524d.get());
            case 3:
                m mVar2 = ExecutorsRegistrar.f18521a;
                return new g(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new a("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.f18524d.get());
            case 4:
                m mVar3 = ExecutorsRegistrar.f18521a;
                return new g(Executors.newCachedThreadPool(new a("Firebase Blocking", 11, null)), (ScheduledExecutorService) ExecutorsRegistrar.f18524d.get());
            default:
                m mVar4 = ExecutorsRegistrar.f18521a;
                return Executors.newSingleThreadScheduledExecutor(new a("Firebase Scheduler", 0, null));
        }
    }
}
