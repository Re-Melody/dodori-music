package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class J implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC1164f f18003b;

    public J(AbstractC1164f abstractC1164f, int i10) {
        Objects.requireNonNull(abstractC1164f);
        this.f18003b = abstractC1164f;
        this.f18002a = i10;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        AbstractC1164f abstractC1164f = this.f18003b;
        if (iBinder == null) {
            abstractC1164f.zzf(16);
            return;
        }
        synchronized (abstractC1164f.zzh()) {
            try {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                abstractC1164f.zzi((iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC1175q)) ? new D(iBinder) : (InterfaceC1175q) iInterfaceQueryLocalInterface);
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f18003b.zzb(0, null, this.f18002a);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        AbstractC1164f abstractC1164f = this.f18003b;
        synchronized (abstractC1164f.zzh()) {
            abstractC1164f.zzi(null);
        }
        AbstractC1164f abstractC1164f2 = this.f18003b;
        int i10 = this.f18002a;
        Handler handler = abstractC1164f2.zzb;
        handler.sendMessage(handler.obtainMessage(6, i10, 1));
    }
}
