package Z7;

import U.P;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f14027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f14028b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f14029c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ P f14030d;

    public d(P p10) {
        this.f14030d = p10;
        this.f14029c = new c(p10, 1);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        m.f(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        m.f(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        m.f(activity, "activity");
        if (this.f14030d.f11785b) {
            this.f14027a = true;
            this.f14028b.postDelayed(this.f14029c, 60000L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        m.f(activity, "activity");
        if (this.f14027a) {
            P p10 = this.f14030d;
            if (p10.f11785b) {
                this.f14028b.postDelayed(new c(p10, 0), 500L);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        m.f(activity, "activity");
        m.f(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        m.f(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        m.f(activity, "activity");
    }
}
