package com.apple.android.music.playback.c.c;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.apple.android.music.playback.model.ErrorConditionException;
import com.apple.android.music.playback.model.PlayerMediaItem;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class d extends Handler implements Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static String f17124h = "d";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final h f17125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final j f17126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final boolean f17127c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final PlayerMediaItem f17128d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final com.apple.android.music.playback.c.d f17129e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final com.apple.android.music.playback.c.a.a f17130f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected final j.a f17131g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final b f17132i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final c f17133j;

    public d(h hVar, PlayerMediaItem playerMediaItem, com.apple.android.music.playback.c.d dVar, j jVar, boolean z10, b bVar, com.apple.android.music.playback.c.a.a aVar, Looper looper, c cVar, j.a aVar2) {
        super(looper);
        this.f17125a = hVar;
        this.f17128d = playerMediaItem;
        this.f17129e = dVar;
        this.f17126b = jVar;
        this.f17127c = z10;
        this.f17132i = bVar;
        this.f17130f = aVar;
        this.f17133j = cVar;
        this.f17131g = aVar2;
    }

    public abstract com.apple.android.music.playback.model.i a();

    public boolean a(boolean z10, boolean z11) {
        return false;
    }

    public String[] b() {
        return this.f17132i.a(this.f17128d);
    }

    public boolean c() {
        long jQ = this.f17129e.q();
        return this.f17128d.isExplicitContent() && 0 <= jQ && jQ < System.currentTimeMillis();
    }

    public void d() throws com.apple.android.music.playback.model.m {
        if (!this.f17129e.r() && !this.f17129e.a("https://www.apple.com")) {
            throw new com.apple.android.music.playback.model.m("Checking captive portal, Host is unreachable with current settings ");
        }
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 1) {
            this.f17133j.a(this.f17128d, (com.apple.android.music.playback.model.i) message.obj);
        } else {
            if (i10 != 2) {
                return;
            }
            this.f17133j.a(this.f17128d, (IOException) message.obj);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            obtainMessage(1, a()).sendToTarget();
        } catch (IOException e2) {
            obtainMessage(2, e2).sendToTarget();
        }
    }

    public void a(boolean z10) {
        if (this.f17129e.e() && this.f17127c) {
            Boolean.toString(z10);
            this.f17125a.a(true, z10);
        }
    }

    public void a(long j10) {
        if (c()) {
            this.f17131g.a(3770, Long.toString(j10));
            throw new ErrorConditionException("PLAYBACK_ERRORCODE_AGE_VERIFICATION_REQUIRED", 3770);
        }
    }
}
