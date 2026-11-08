package ua;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        c cVar;
        String stringExtra = intent.getStringExtra("org.maplibre.android.plugins.offline.state");
        if (intent.getParcelableExtra("org.maplibre.android.plugins.offline.download.object") != null) {
            throw new ClassCastException();
        }
        synchronized (c.class) {
            try {
                if (c.f27292d == null) {
                    context.getApplicationContext();
                    c.f27292d = new c(0, (byte) 0);
                }
                cVar = c.f27292d;
            } catch (Throwable th) {
                throw th;
            }
        }
        stringExtra.getClass();
        switch (stringExtra) {
            case "org.maplibre.android.plugins.offline.state.error":
                intent.getStringExtra("org.maplibre.android.plugins.offline.region");
                intent.getStringExtra("org.maplibre.android.plugins.offline.error");
                ((a) cVar.f27294b).c();
                ((ArrayList) cVar.f27295c).remove((Object) null);
                return;
            case "org.maplibre.android.plugins.offline.state.started":
                ((ArrayList) cVar.f27295c).add(null);
                ((a) cVar.f27294b).b();
                return;
            case "org.maplibre.android.plugins.offline.state.progress":
                intent.getIntExtra("org.maplibre.android.plugins.offline.progress", 0);
                ((a) cVar.f27294b).d();
                return;
            default:
                boolean zEquals = stringExtra.equals("org.maplibre.android.plugins.offline.state.cancel");
                a aVar = (a) cVar.f27294b;
                if (zEquals) {
                    aVar.a();
                } else {
                    aVar.e();
                }
                ((ArrayList) cVar.f27295c).remove((Object) null);
                return;
        }
    }
}
