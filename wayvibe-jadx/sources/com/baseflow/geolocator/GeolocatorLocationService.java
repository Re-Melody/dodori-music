package com.baseflow.geolocator;

import G0.L0;
import W4.m;
import android.app.Service;
import android.content.Intent;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.IBinder;
import android.os.PowerManager;
import android.util.Log;
import p031c5.b;
import p045d8.AbstractActivityC1932d;
import p050e5.d;
import p050e5.h;

/* JADX INFO: loaded from: classes.dex */
public class GeolocatorLocationService extends Service {
    public static final /* synthetic */ int k = 0;

    /* JADX INFO: renamed from: g */
    public h f17691g;

    /* JADX INFO: renamed from: a */
    public final b f17685a = new b(this);

    /* JADX INFO: renamed from: b */
    public boolean f17686b = false;

    /* JADX INFO: renamed from: c */
    public int f17687c = 0;

    /* JADX INFO: renamed from: d */
    public int f17688d = 0;

    /* JADX INFO: renamed from: e */
    public AbstractActivityC1932d f17689e = null;

    /* JADX INFO: renamed from: f */
    public d f17690f = null;

    /* JADX INFO: renamed from: h */
    public PowerManager.WakeLock f17692h = null;

    /* JADX INFO: renamed from: i */
    public WifiManager.WifiLock f17693i = null;

    /* JADX INFO: renamed from: j */
    public m f17694j = null;

    public final void a(L0 l10) {
        WifiManager wifiManager;
        PowerManager powerManager;
        b();
        if (l10.f5047b && (powerManager = (PowerManager) getApplicationContext().getSystemService("power")) != null) {
            PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, "GeolocatorLocationService:Wakelock");
            this.f17692h = wakeLockNewWakeLock;
            wakeLockNewWakeLock.setReferenceCounted(false);
            this.f17692h.acquire();
        }
        if (!l10.f5046a || (wifiManager = (WifiManager) getApplicationContext().getSystemService("wifi")) == null) {
            return;
        }
        WifiManager.WifiLock wifiLockCreateWifiLock = wifiManager.createWifiLock(Build.VERSION.SDK_INT < 29 ? 3 : 4, "GeolocatorLocationService:WifiLock");
        this.f17693i = wifiLockCreateWifiLock;
        wifiLockCreateWifiLock.setReferenceCounted(false);
        this.f17693i.acquire();
    }

    public final void b() {
        PowerManager.WakeLock wakeLock = this.f17692h;
        if (wakeLock != null && wakeLock.isHeld()) {
            this.f17692h.release();
            this.f17692h = null;
        }
        WifiManager.WifiLock wifiLock = this.f17693i;
        if (wifiLock == null || !wifiLock.isHeld()) {
            return;
        }
        this.f17693i.release();
        this.f17693i = null;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        Log.d("FlutterGeolocator", "Binding to location service.");
        return this.f17685a;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        Log.d("FlutterGeolocator", "Creating service.");
    }

    @Override // android.app.Service
    public final void onDestroy() {
        d dVar;
        Log.d("FlutterGeolocator", "Destroying location service.");
        this.f17688d--;
        Log.d("FlutterGeolocator", "Stopping location service.");
        h hVar = this.f17691g;
        if (hVar != null && (dVar = this.f17690f) != null) {
            dVar.f19591a.remove(hVar);
            hVar.e();
        }
        if (this.f17686b) {
            Log.d("FlutterGeolocator", "Stop service in foreground.");
            stopForeground(1);
            b();
            this.f17686b = false;
            this.f17694j = null;
        }
        this.f17690f = null;
        this.f17694j = null;
        Log.d("FlutterGeolocator", "Destroyed location service.");
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i10, int i11) {
        return 1;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        Log.d("FlutterGeolocator", "Unbinding from location service.");
        return super.onUnbind(intent);
    }
}
