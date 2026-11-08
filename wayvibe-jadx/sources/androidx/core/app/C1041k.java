package androidx.core.app;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import com.revenuecat.purchases.common.networking.HTTPTimeoutManager;

/* JADX INFO: renamed from: androidx.core.app.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1041k extends q {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f14931d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final PowerManager.WakeLock f14932e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final PowerManager.WakeLock f14933f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f14934g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f14935h;

    public C1041k(Context context, ComponentName componentName) {
        super(componentName);
        this.f14931d = context.getApplicationContext();
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, componentName.getClassName() + ":launch");
        this.f14932e = wakeLockNewWakeLock;
        wakeLockNewWakeLock.setReferenceCounted(false);
        PowerManager.WakeLock wakeLockNewWakeLock2 = powerManager.newWakeLock(1, componentName.getClassName() + ":run");
        this.f14933f = wakeLockNewWakeLock2;
        wakeLockNewWakeLock2.setReferenceCounted(false);
    }

    @Override // androidx.core.app.q
    public final void a(Intent intent) {
        Intent intent2 = new Intent(intent);
        intent2.setComponent(this.f14946a);
        if (this.f14931d.startService(intent2) != null) {
            synchronized (this) {
                try {
                    if (!this.f14934g) {
                        this.f14934g = true;
                        if (!this.f14935h) {
                            this.f14932e.acquire(60000L);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // androidx.core.app.q
    public final void c() {
        synchronized (this) {
            try {
                if (this.f14935h) {
                    if (this.f14934g) {
                        this.f14932e.acquire(60000L);
                    }
                    this.f14935h = false;
                    this.f14933f.release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.core.app.q
    public final void d() {
        synchronized (this) {
            try {
                if (!this.f14935h) {
                    this.f14935h = true;
                    this.f14933f.acquire(HTTPTimeoutManager.TIMEOUT_RESET_INTERVAL_MS);
                    this.f14932e.release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.core.app.q
    public final void e() {
        synchronized (this) {
            this.f14934g = false;
        }
    }
}
