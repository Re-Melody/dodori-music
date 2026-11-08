package org.maplibre.android.plugins.offline.offline;

import Ha.a;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.IBinder;
import androidx.core.app.F;
import org.maplibre.android.MapLibre;
import ua.b;

/* JADX INFO: loaded from: classes2.dex */
public class OfflineDownloadService extends Service {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f25113a;

    public OfflineDownloadService() {
        int i10 = 10 * 8;
        for (int i11 = 4; i11 < 32; i11++) {
            int i12 = (1 << i11) - 12;
            if (i10 <= i12) {
                i10 = i12;
                break;
            }
        }
        int i13 = i10 / 8;
        long[] jArr = new long[i13];
        Object[] objArr = new Object[i13];
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        Ha.b.f6244a.getClass();
        a.c(new Object[0]);
        new F(this);
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationManager notificationManager = (NotificationManager) MapLibre.getApplicationContext().getSystemService("notification");
            NotificationChannel notificationChannelA = p223v2.b.a();
            notificationChannelA.setLightColor(-16711936);
            notificationChannelA.setLockscreenVisibility(0);
            notificationManager.createNotificationChannel(notificationChannelA);
        }
        this.f25113a = new b();
        getApplicationContext().registerReceiver(this.f25113a, new IntentFilter("org.maplibre.android.plugins.offline"));
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        if (this.f25113a != null) {
            getApplicationContext().unregisterReceiver(this.f25113a);
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i10, int i11) {
        Ha.b.f6244a.getClass();
        a.c(new Object[0]);
        if (intent == null) {
            return 1;
        }
        if (intent.getParcelableExtra("org.maplibre.android.plugins.offline.download.object") != null) {
            throw new ClassCastException();
        }
        stopSelf(i11);
        throw new NullPointerException("A DownloadOptions instance must be passed into the service to begin downloading.");
    }
}
