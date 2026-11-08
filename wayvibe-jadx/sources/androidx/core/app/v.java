package androidx.core.app;

import D8.AbstractC0311s0;
import android.app.Notification;

/* JADX INFO: loaded from: classes.dex */
public final class v extends AbstractC0311s0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CharSequence f14957b;

    @Override // D8.AbstractC0311s0
    public final void a(B2.s sVar) {
        new Notification.BigTextStyle((Notification.Builder) sVar.f619b).setBigContentTitle(null).bigText(this.f14957b);
    }

    @Override // D8.AbstractC0311s0
    public final String c() {
        return "androidx.core.app.NotificationCompat$BigTextStyle";
    }
}
