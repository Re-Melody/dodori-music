package com.apple.android.music.playback.c.c;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p199t.C2230e;

/* JADX INFO: loaded from: classes.dex */
public final class i extends BroadcastReceiver implements W4.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f17146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<W4.c, a> f17147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<a> f17148c;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final long f17149a = SystemClock.elapsedRealtime();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f17150b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f17151c;

        public long a() {
            long jElapsedRealtime = this.f17150b;
            if (jElapsedRealtime == 0) {
                jElapsedRealtime = SystemClock.elapsedRealtime();
            }
            long j10 = (jElapsedRealtime - this.f17149a) / 1000;
            if (j10 == 0) {
                return 0L;
            }
            return ((this.f17151c * 8) / 1000) / j10;
        }
    }

    public i(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f17146a = applicationContext;
        this.f17147b = Collections.synchronizedMap(new C2230e(0));
        this.f17148c = Collections.synchronizedList(new ArrayList(10));
        applicationContext.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    public void b() {
        this.f17146a.unregisterReceiver(this);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            this.f17148c.clear();
        }
    }

    public long a() {
        synchronized (this.f17148c) {
            try {
                int size = this.f17148c.size();
                if (size == 0) {
                    return -1L;
                }
                if (size == 1) {
                    return this.f17148c.get(0).a();
                }
                long jA = this.f17148c.get(size - 1).a();
                long jA2 = jA;
                for (int i10 = size - 2; i10 >= 0; i10--) {
                    jA2 = (long) ((jA2 * 0.25f) + (this.f17148c.get(i10).a() * 0.75f));
                    jA += jA2;
                }
                return jA / ((long) size);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // W4.o
    public void a(W4.c cVar, W4.e eVar) {
        a aVar = new a();
        this.f17147b.put(cVar, aVar);
        while (this.f17148c.size() >= 10) {
            this.f17148c.remove(0);
        }
        this.f17148c.add(aVar);
    }

    @Override // W4.o
    public void a(W4.c cVar, int i10) {
        a aVar = this.f17147b.get(cVar);
        if (aVar != null) {
            aVar.f17151c += (long) i10;
        }
    }

    @Override // W4.o
    public void a(W4.c cVar) {
        a aVarRemove = this.f17147b.remove(cVar);
        if (aVarRemove != null) {
            aVarRemove.f17150b = SystemClock.elapsedRealtime();
        }
    }
}
