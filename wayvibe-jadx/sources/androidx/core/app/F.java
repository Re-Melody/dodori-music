package androidx.core.app;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class F {

    /* JADX INFO: renamed from: d */
    public static String f14901d;

    /* JADX INFO: renamed from: g */
    public static E f14904g;

    /* JADX INFO: renamed from: a */
    public final Context f14905a;

    /* JADX INFO: renamed from: b */
    public final NotificationManager f14906b;

    /* JADX INFO: renamed from: c */
    public static final Object f14900c = new Object();

    /* JADX INFO: renamed from: e */
    public static HashSet f14902e = new HashSet();

    /* JADX INFO: renamed from: f */
    public static final Object f14903f = new Object();

    public F(Context context) {
        this.f14905a = context;
        this.f14906b = (NotificationManager) context.getSystemService("notification");
    }

    public final void a(int i10, Notification notification) {
        Bundle bundle = notification.extras;
        NotificationManager notificationManager = this.f14906b;
        if (bundle == null || !bundle.getBoolean("android.support.useSideChannel")) {
            notificationManager.notify(null, i10, notification);
            return;
        }
        B b10 = new B(this.f14905a.getPackageName(), i10, notification);
        synchronized (f14903f) {
            try {
                if (f14904g == null) {
                    f14904g = new E(this.f14905a.getApplicationContext());
                }
                f14904g.f14897b.obtainMessage(0, b10).sendToTarget();
            } catch (Throwable th) {
                throw th;
            }
        }
        notificationManager.cancel(null, i10);
    }
}
