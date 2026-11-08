package p223v2;

import android.app.NotificationChannel;
import android.media.AudioFocusRequest;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class b {
    public static /* synthetic */ NotificationChannel a() {
        return new NotificationChannel("offline", "Offline", 3);
    }

    public static /* bridge */ /* synthetic */ AudioFocusRequest b(Object obj) {
        return (AudioFocusRequest) obj;
    }
}
