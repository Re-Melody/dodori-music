package org.maplibre.android.net;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.maplibre.android.log.Logger;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends BroadcastReceiver {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static b f25073e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CopyOnWriteArrayList f25074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f25075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f25076c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Boolean f25077d;

    public static synchronized b c(Context context) {
        try {
            if (f25073e == null) {
                Context applicationContext = context.getApplicationContext();
                b bVar = new b();
                CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                bVar.f25074a = copyOnWriteArrayList;
                bVar.f25075b = applicationContext;
                f25073e = bVar;
                NativeConnectivityListener nativeConnectivityListener = new NativeConnectivityListener();
                nativeConnectivityListener.initialize();
                copyOnWriteArrayList.add(nativeConnectivityListener);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f25073e;
    }

    public final void a() {
        if (this.f25076c == 0) {
            this.f25075b.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
        this.f25076c++;
    }

    public final void b() {
        int i10 = this.f25076c - 1;
        this.f25076c = i10;
        if (i10 == 0) {
            this.f25075b.unregisterReceiver(f25073e);
        }
    }

    public final boolean d() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f25075b.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public final void e(boolean z10) {
        Logger.v("Mbgl-ConnectivityReceiver", z10 ? "connected - true" : "connected - false");
        Iterator it = this.f25074a.iterator();
        while (it.hasNext()) {
            ((NativeConnectivityListener) ((a) it.next())).nativeOnConnectivityStateChanged(z10);
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.f25077d != null) {
            return;
        }
        e(d());
    }
}
