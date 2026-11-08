package androidx.core.app;

import android.app.Notification;

/* JADX INFO: loaded from: classes.dex */
public abstract class z {
    public static void a(Notification.Action.Builder builder) {
        builder.setAuthenticationRequired(false);
    }

    public static void b(Notification.Builder builder, int i10) {
        builder.setForegroundServiceBehavior(i10);
    }
}
