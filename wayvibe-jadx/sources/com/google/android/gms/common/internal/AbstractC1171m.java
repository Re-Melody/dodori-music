package com.google.android.gms.common.internal;

import android.content.ServiceConnection;
import android.os.HandlerThread;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1171m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f18065a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Q f18066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static HandlerThread f18067c;

    public abstract H5.b a(N n6, J j10, String str, Executor executor);

    public final void b(String str, String str2, ServiceConnection serviceConnection, boolean z10) {
        N n6 = new N(str, str2, z10);
        Q q5 = (Q) this;
        E.i(serviceConnection, "ServiceConnection must not be null");
        HashMap map = q5.f18022d;
        synchronized (map) {
            try {
                O o10 = (O) map.get(n6);
                if (o10 == null) {
                    String string = n6.toString();
                    StringBuilder sb = new StringBuilder(string.length() + 50);
                    sb.append("Nonexistent connection status for service config: ");
                    sb.append(string);
                    throw new IllegalStateException(sb.toString());
                }
                if (!o10.f18014a.containsKey(serviceConnection)) {
                    String string2 = n6.toString();
                    StringBuilder sb2 = new StringBuilder(string2.length() + 76);
                    sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                    sb2.append(string2);
                    throw new IllegalStateException(sb2.toString());
                }
                o10.f18014a.remove(serviceConnection);
                if (o10.f18014a.isEmpty()) {
                    q5.f18024f.sendMessageDelayed(q5.f18024f.obtainMessage(0, n6), q5.f18026h);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
