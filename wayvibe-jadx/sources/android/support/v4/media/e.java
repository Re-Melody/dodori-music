package android.support.v4.media;

import G0.AbstractC0454b;
import W9.j;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f14345b = Log.isLoggable("MediaBrowserCompat", 3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f14346a;

    public e(Context context, ComponentName componentName, AbstractC0454b abstractC0454b) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f14346a = new d(context, componentName, abstractC0454b);
        } else {
            this.f14346a = new c(context, componentName, abstractC0454b);
        }
    }

    public final void a() {
        Messenger messenger;
        c cVar = this.f14346a;
        j jVar = cVar.f14342f;
        if (jVar != null && (messenger = cVar.f14343g) != null) {
            try {
                jVar.b0(7, null, messenger);
            } catch (RemoteException unused) {
                Log.i("MediaBrowserCompat", "Remote error unregistering client messenger.");
            }
        }
        cVar.f14338b.disconnect();
    }
}
