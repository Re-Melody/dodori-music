package com.google.android.gms.common.internal;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.internal.common.zzg;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class Q extends AbstractC1171m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f18022d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f18023e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile zzg f18024f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final N5.a f18025g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f18026h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f18027i;

    public Q(Context context, Looper looper) {
        P p10 = new P(this);
        this.f18023e = context.getApplicationContext();
        this.f18024f = new zzg(looper, p10);
        this.f18025g = N5.a.a();
        this.f18026h = 5000L;
        this.f18027i = 300000L;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1171m
    public final H5.b a(N n6, J j10, String str, Executor executor) {
        H5.b bVarA;
        HashMap map = this.f18022d;
        synchronized (map) {
            try {
                O o10 = (O) map.get(n6);
                if (executor == null) {
                    executor = null;
                }
                if (o10 == null) {
                    o10 = new O(this, n6);
                    o10.f18014a.put(j10, j10);
                    bVarA = o10.a(str, executor);
                    map.put(n6, o10);
                } else {
                    this.f18024f.removeMessages(0, n6);
                    if (o10.f18014a.containsKey(j10)) {
                        String string = n6.toString();
                        StringBuilder sb = new StringBuilder(string.length() + 81);
                        sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                        sb.append(string);
                        throw new IllegalStateException(sb.toString());
                    }
                    o10.f18014a.put(j10, j10);
                    int i10 = o10.f18015b;
                    if (i10 == 1) {
                        j10.onServiceConnected(o10.f18019f, o10.f18017d);
                    } else if (i10 == 2) {
                        bVarA = o10.a(str, executor);
                    }
                    bVarA = null;
                }
                if (o10.f18016c) {
                    return H5.b.f6027f;
                }
                if (bVarA == null) {
                    bVarA = new H5.b(-1, null, null);
                }
                return bVarA;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
