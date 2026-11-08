package com.apple.android.music.playback.reporting;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;

/* JADX INFO: loaded from: classes.dex */
public final class ReportingService extends Service implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Handler f17546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HandlerThread f17547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.apple.android.music.playback.c.d f17548c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private e f17549d;

    private void a(a aVar) {
        this.f17549d.b(aVar);
        if (this.f17546a == null) {
            return;
        }
        if (this.f17549d.a(aVar)) {
            this.f17546a.sendEmptyMessage(2);
        } else {
            this.f17546a.sendEmptyMessageDelayed(2, this.f17549d.a());
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) throws Throwable {
        int i10 = message.what;
        if (i10 == 1) {
            a((a) message.obj);
            return true;
        }
        if (i10 == 2) {
            a();
            return true;
        }
        if (i10 != 3) {
            return false;
        }
        this.f17549d.c();
        return true;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        HandlerThread handlerThread = new HandlerThread("ReportingService:Handler", 10);
        this.f17547b = handlerThread;
        handlerThread.start();
        this.f17546a = new Handler(this.f17547b.getLooper(), this);
        com.apple.android.music.playback.c.d dVarA = com.apple.android.music.playback.c.e.a(getApplicationContext());
        this.f17548c = dVarA;
        this.f17549d = new e(dVarA);
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.f17546a.obtainMessage(3).sendToTarget();
        this.f17547b.quitSafely();
        this.f17546a = null;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        a aVar;
        if (intent == null || !"com.apple.android.music.playback.reporting.PLAY_ACTIVITY".equals(intent.getAction()) || (aVar = (a) intent.getParcelableExtra("playActivityEvent")) == null) {
            return 2;
        }
        this.f17546a.obtainMessage(1, aVar).sendToTarget();
        return 2;
    }

    private void a() throws Throwable {
        if (this.f17548c.i()) {
            this.f17549d.b();
        }
    }
}
