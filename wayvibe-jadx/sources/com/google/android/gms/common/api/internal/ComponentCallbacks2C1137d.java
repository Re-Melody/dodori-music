package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ComponentCallbacks2C1137d implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ComponentCallbacks2C1137d f17918e = new ComponentCallbacks2C1137d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f17919a = new AtomicBoolean();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f17920b = new AtomicBoolean();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f17921c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f17922d = false;

    public static void b(Application application) {
        ComponentCallbacks2C1137d componentCallbacks2C1137d = f17918e;
        synchronized (componentCallbacks2C1137d) {
            try {
                if (!componentCallbacks2C1137d.f17922d) {
                    application.registerActivityLifecycleCallbacks(componentCallbacks2C1137d);
                    application.registerComponentCallbacks(componentCallbacks2C1137d);
                    componentCallbacks2C1137d.f17922d = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(InterfaceC1136c interfaceC1136c) {
        synchronized (f17918e) {
            this.f17921c.add(interfaceC1136c);
        }
    }

    public final void c(boolean z10) {
        synchronized (f17918e) {
            try {
                Iterator it = this.f17921c.iterator();
                while (it.hasNext()) {
                    ((InterfaceC1136c) it.next()).a(z10);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        AtomicBoolean atomicBoolean = this.f17920b;
        boolean zCompareAndSet = this.f17919a.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (zCompareAndSet) {
            c(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        AtomicBoolean atomicBoolean = this.f17920b;
        boolean zCompareAndSet = this.f17919a.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (zCompareAndSet) {
            c(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i10) {
        if (i10 == 20 && this.f17919a.compareAndSet(false, true)) {
            this.f17920b.set(true);
            c(true);
        }
    }
}
