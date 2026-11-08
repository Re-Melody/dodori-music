package p247x5;

import A9.C0108h;
import E2.i;
import H5.f;
import H5.g;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.internal.E;
import com.google.android.gms.internal.ads_identifier.zze;
import com.google.android.gms.internal.ads_identifier.zzf;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public H5.a f28586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public zzf f28587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f28588c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f28589d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b f28590e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Context f28591f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f28592g;

    public a(Application application) {
        E.h(application);
        Context applicationContext = application.getApplicationContext();
        this.f28591f = applicationContext != null ? applicationContext : application;
        this.f28588c = false;
        this.f28592g = -1L;
    }

    public static C0108h a(Application application) {
        a aVar = new a(application);
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            aVar.d();
            C0108h c0108hB = aVar.b();
            e(c0108hB, SystemClock.elapsedRealtime() - jElapsedRealtime, null);
            aVar.c();
            return c0108hB;
        } catch (Throwable th) {
            try {
                e(null, -1L, th);
                throw th;
            } catch (Throwable th2) {
                aVar.c();
                throw th2;
            }
        }
    }

    public static void e(C0108h c0108h, long j10, Throwable th) {
        if (Math.random() <= 0.0d) {
            HashMap map = new HashMap();
            map.put("app_context", "1");
            if (c0108h != null) {
                map.put("limit_ad_tracking", true != c0108h.f463b ? "0" : "1");
                String str = (String) c0108h.f464c;
                if (str != null) {
                    map.put("ad_id_size", Integer.toString(str.length()));
                }
            }
            if (th != null) {
                map.put("error", th.getClass().getName());
            }
            map.put("tag", "AdvertisingIdClient");
            map.put("time_spent", Long.toString(j10));
            new i(map, 1).start();
        }
    }

    public final C0108h b() {
        C0108h c0108h;
        E.g("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (!this.f28588c) {
                    synchronized (this.f28589d) {
                        b bVar = this.f28590e;
                        if (bVar == null || !bVar.f28596d) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        d();
                        if (!this.f28588c) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.");
                        }
                    } catch (Exception e2) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.", e2);
                    }
                }
                E.h(this.f28586a);
                E.h(this.f28587b);
                try {
                    c0108h = new C0108h(8, this.f28587b.zzc(), this.f28587b.zze(true));
                } catch (RemoteException e4) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e4);
                    throw new IOException("Remote exception");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.f28589d) {
            b bVar2 = this.f28590e;
            if (bVar2 != null) {
                bVar2.f28595c.countDown();
                try {
                    this.f28590e.join();
                } catch (InterruptedException unused) {
                }
            }
            long j10 = this.f28592g;
            if (j10 > 0) {
                this.f28590e = new b(this, j10);
            }
        }
        return c0108h;
    }

    public final void c() {
        E.g("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f28591f == null || this.f28586a == null) {
                    return;
                }
                try {
                    if (this.f28588c) {
                        N5.a.a().b(this.f28591f, this.f28586a);
                    }
                } catch (Throwable th) {
                    Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th);
                }
                this.f28588c = false;
                this.f28587b = null;
                this.f28586a = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d() {
        E.g("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f28588c) {
                    c();
                }
                Context context = this.f28591f;
                try {
                    context.getPackageManager().getPackageInfo("com.android.vending", 0);
                    int iC = f.f6043b.c(context, 12451000);
                    if (iC != 0 && iC != 2) {
                        throw new IOException("Google Play services not available");
                    }
                    H5.a aVar = new H5.a();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    try {
                        if (!N5.a.a().c(context, context.getClass().getName(), intent, aVar, 1, null)) {
                            throw new IOException("Connection failure");
                        }
                        this.f28586a = aVar;
                        try {
                            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                            this.f28587b = zze.zza(aVar.a());
                            this.f28588c = true;
                        } catch (InterruptedException unused) {
                            throw new IOException("Interrupted exception");
                        } catch (Throwable th) {
                            throw new IOException(th);
                        }
                    } catch (Throwable th2) {
                        throw new IOException(th2);
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    throw new g();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void finalize() throws Throwable {
        c();
        super.finalize();
    }
}
