package de.julianassmann.flutter_background;

import X2.i;
import Z7.a;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.IBinder;
import android.os.PowerManager;
import androidx.core.app.w;
import kotlin.jvm.internal.m;
import p050e5.k;

/* JADX INFO: loaded from: classes2.dex */
public final class IsolateHolderService extends Service {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f19445c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public PowerManager.WakeLock f19446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WifiManager.WifiLock f19447b;

    public final void a() {
        WifiManager.WifiLock wifiLock;
        PowerManager.WakeLock wakeLock = this.f19446a;
        if (wakeLock != null && wakeLock.isHeld()) {
            wakeLock.release();
        }
        if (a.f14019j && (wifiLock = this.f19447b) != null && wifiLock.isHeld()) {
            wifiLock.release();
        }
        stopForeground(true);
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        m.f(intent, "intent");
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        SharedPreferences sharedPreferences;
        String string;
        String string2;
        String string3;
        String string4;
        Context applicationContext = getApplicationContext();
        if (applicationContext != null) {
            sharedPreferences = applicationContext.getSharedPreferences(applicationContext.getPackageName() + "_preferences", 0);
        } else {
            sharedPreferences = null;
        }
        if (sharedPreferences == null || (string = sharedPreferences.getString("android.notificationTitle", a.f14014e)) == null) {
            string = a.f14014e;
        }
        m.f(string, "<set-?>");
        a.f14014e = string;
        if (sharedPreferences == null || (string2 = sharedPreferences.getString("android.notificationText", a.f14015f)) == null) {
            string2 = a.f14015f;
        }
        m.f(string2, "<set-?>");
        a.f14015f = string2;
        a.f14016g = sharedPreferences != null ? sharedPreferences.getInt("android.notificationImportance", a.f14016g) : a.f14016g;
        if (sharedPreferences == null || (string3 = sharedPreferences.getString("android.notificationIconName", a.f14017h)) == null) {
            string3 = a.f14017h;
        }
        m.f(string3, "<set-?>");
        a.f14017h = string3;
        if (sharedPreferences == null || (string4 = sharedPreferences.getString("android.notificationIconDefType", a.f14018i)) == null) {
            string4 = a.f14018i;
        }
        m.f(string4, "<set-?>");
        a.f14018i = string4;
        a.f14019j = sharedPreferences != null ? sharedPreferences.getBoolean("android.enableWifiLock", false) : false;
        a.k = sharedPreferences != null ? sharedPreferences.getBoolean("android.showBadge", false) : false;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        a();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i10, int i11) {
        if (m.b(intent != null ? intent.getAction() : null, "SHUTDOWN")) {
            a();
            stopSelf();
            return 1;
        }
        if (m.b(intent != null ? intent.getAction() : null, "START")) {
            Intent launchIntentForPackage = getApplicationContext().getPackageManager().getLaunchIntentForPackage(getApplicationContext().getPackageName());
            int i12 = Build.VERSION.SDK_INT;
            PendingIntent activity = PendingIntent.getActivity(this, 0, launchIntentForPackage, 201326592);
            if (i12 >= 26) {
                k.j();
                NotificationChannel notificationChannelB = i.b(a.f14016g, a.f14014e);
                notificationChannelB.setDescription(a.f14015f);
                notificationChannelB.setShowBadge(a.k);
                Object systemService = getSystemService("notification");
                m.d(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
                ((NotificationManager) systemService).createNotificationChannel(notificationChannelB);
            }
            int identifier = getResources().getIdentifier(a.f14017h, a.f14018i, getPackageName());
            w wVar = new w(this, "flutter_background");
            wVar.f14962e = w.b(a.f14014e);
            wVar.f14963f = w.b(a.f14015f);
            wVar.f14976u.icon = identifier;
            wVar.f14964g = activity;
            wVar.f14966i = a.f14016g;
            Notification notificationA = wVar.a();
            m.e(notificationA, "build(...)");
            Object systemService2 = getSystemService("power");
            m.d(systemService2, "null cannot be cast to non-null type android.os.PowerManager");
            PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) systemService2).newWakeLock(1, "FlutterBackgroundPlugin:Wakelock");
            wakeLockNewWakeLock.setReferenceCounted(false);
            wakeLockNewWakeLock.acquire();
            this.f19446a = wakeLockNewWakeLock;
            Object systemService3 = getApplicationContext().getSystemService("wifi");
            m.d(systemService3, "null cannot be cast to non-null type android.net.wifi.WifiManager");
            WifiManager.WifiLock wifiLockCreateWifiLock = ((WifiManager) systemService3).createWifiLock(1, "FlutterBackgroundPlugin:WifiLock");
            wifiLockCreateWifiLock.setReferenceCounted(false);
            wifiLockCreateWifiLock.acquire();
            this.f19447b = wifiLockCreateWifiLock;
            if (i12 >= 34) {
                startForeground(1, notificationA, -1);
                return 1;
            }
            startForeground(1, notificationA);
        }
        return 1;
    }

    @Override // android.app.Service
    public final void onTaskRemoved(Intent rootIntent) {
        m.f(rootIntent, "rootIntent");
        super.onTaskRemoved(rootIntent);
        a();
        stopSelf();
    }
}
