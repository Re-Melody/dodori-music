package W6;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import p199t.C2229d;

/* JADX INFO: loaded from: classes.dex */
public final class g extends BroadcastReceiver {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicReference f12861b = new AtomicReference();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f12862a;

    public g(Context context) {
        this.f12862a = context;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        synchronized (h.k) {
            try {
                Iterator it = ((C2229d) h.f12863l.values()).iterator();
                while (it.hasNext()) {
                    ((h) it.next()).g();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f12862a.unregisterReceiver(this);
    }
}
