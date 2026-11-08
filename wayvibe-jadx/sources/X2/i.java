package X2;

import android.app.NotificationChannel;
import android.app.job.JobWorkItem;
import android.content.Intent;
import android.media.AudioFocusRequest;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class i {
    public static /* synthetic */ NotificationChannel b(int i10, String str) {
        return new NotificationChannel("flutter_background", str, i10);
    }

    public static /* synthetic */ NotificationChannel c(String str) {
        return new NotificationChannel("geolocator_channel_01", str, 0);
    }

    public static /* synthetic */ JobWorkItem e(Intent intent) {
        return new JobWorkItem(intent);
    }

    public static /* synthetic */ AudioFocusRequest.Builder k() {
        return new AudioFocusRequest.Builder(1);
    }
}
