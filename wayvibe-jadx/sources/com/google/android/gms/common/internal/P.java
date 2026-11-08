package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class P implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Q f18021a;

    public /* synthetic */ P(Q q5) {
        Objects.requireNonNull(q5);
        this.f18021a = q5;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 0) {
            Q q5 = this.f18021a;
            synchronized (q5.f18022d) {
                try {
                    N n6 = (N) message.obj;
                    O o10 = (O) q5.f18022d.get(n6);
                    if (o10 != null && o10.f18014a.isEmpty()) {
                        if (o10.f18016c) {
                            N n10 = o10.f18018e;
                            Q q9 = o10.f18020g;
                            q9.f18024f.removeMessages(1, n10);
                            q9.f18025g.b(q9.f18023e, o10);
                            o10.f18016c = false;
                            o10.f18015b = 2;
                        }
                        q5.f18022d.remove(n6);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return true;
        }
        if (i10 != 1) {
            return false;
        }
        Q q10 = this.f18021a;
        synchronized (q10.f18022d) {
            try {
                N n11 = (N) message.obj;
                O o11 = (O) q10.f18022d.get(n11);
                if (o11 != null && o11.f18015b == 3) {
                    String strValueOf = String.valueOf(n11);
                    StringBuilder sb = new StringBuilder(strValueOf.length() + 47);
                    sb.append("Timeout waiting for ServiceConnection callback ");
                    sb.append(strValueOf);
                    Log.e("GmsClientSupervisor", sb.toString(), new Exception());
                    ComponentName componentName = o11.f18019f;
                    if (componentName == null) {
                        n11.getClass();
                        componentName = null;
                    }
                    if (componentName == null) {
                        String str = n11.f18012b;
                        E.h(str);
                        componentName = new ComponentName(str, "unknown");
                    }
                    o11.onServiceDisconnected(componentName);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return true;
    }
}
