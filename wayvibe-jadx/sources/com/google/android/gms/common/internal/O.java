package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class O implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f18014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f18015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f18016c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public IBinder f18017d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final N f18018e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ComponentName f18019f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Q f18020g;

    public O(Q q5, N n6) {
        Objects.requireNonNull(q5);
        this.f18020g = q5;
        this.f18018e = n6;
        this.f18014a = new HashMap();
        this.f18015b = 2;
    }

    public final H5.b a(String str, Executor executor) throws Throwable {
        try {
            Intent intentA = G.a(this.f18020g.f18023e, this.f18018e);
            this.f18015b = 3;
            StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
            if (Build.VERSION.SDK_INT >= 31) {
                StrictMode.setVmPolicy(O5.e.a(new StrictMode.VmPolicy.Builder(vmPolicy)).build());
            }
            try {
                Q q5 = this.f18020g;
                N5.a aVar = q5.f18025g;
                Context context = q5.f18023e;
                N n6 = this.f18018e;
                try {
                    boolean zC = aVar.c(context, str, intentA, this, 4225, executor);
                    this.f18016c = zC;
                    if (zC) {
                        q5.f18024f.sendMessageDelayed(q5.f18024f.obtainMessage(1, n6), q5.f18027i);
                        H5.b bVar = H5.b.f6027f;
                        StrictMode.setVmPolicy(vmPolicy);
                        return bVar;
                    }
                    this.f18015b = 2;
                    try {
                        q5.f18025g.b(q5.f18023e, this);
                    } catch (IllegalArgumentException unused) {
                    }
                    H5.b bVar2 = new H5.b(16, null, null);
                    StrictMode.setVmPolicy(vmPolicy);
                    return bVar2;
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    StrictMode.setVmPolicy(vmPolicy);
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (F e2) {
            return e2.f17997a;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Q q5 = this.f18020g;
        synchronized (q5.f18022d) {
            try {
                q5.f18024f.removeMessages(1, this.f18018e);
                this.f18017d = iBinder;
                this.f18019f = componentName;
                Iterator it = this.f18014a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.f18015b = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Q q5 = this.f18020g;
        synchronized (q5.f18022d) {
            try {
                q5.f18024f.removeMessages(1, this.f18018e);
                this.f18017d = null;
                this.f18019f = componentName;
                Iterator it = this.f18014a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.f18015b = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
