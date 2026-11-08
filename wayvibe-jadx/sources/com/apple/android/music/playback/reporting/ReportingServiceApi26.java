package com.apple.android.music.playback.reporting;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import androidx.core.app.r;
import org.apache.tika.pipes.pipesiterator.PipesIterator;

/* JADX INFO: loaded from: classes.dex */
public class ReportingServiceApi26 extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.apple.android.music.playback.c.d f17550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private e f17551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Handler f17552c;

    public static class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f17553a;

        public a(Context context) {
            this.f17553a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            Intent intent = new Intent();
            intent.setAction("com.apple.android.music.playback.reporting.SEND_PLAY_ACTIVITY_EVENTS");
            ReportingServiceApi26.a(this.f17553a, intent);
        }
    }

    public static void a(Context context, Intent intent) {
        r.enqueueWork(context, (Class<?>) ReportingServiceApi26.class, PipesIterator.DEFAULT_QUEUE_SIZE, intent);
    }

    @Override // androidx.core.app.r, android.app.Service
    public void onCreate() {
        super.onCreate();
        com.apple.android.music.playback.c.d dVarA = com.apple.android.music.playback.c.e.a(getApplicationContext());
        this.f17550a = dVarA;
        this.f17551b = new e(dVarA);
        this.f17552c = new Handler(Looper.getMainLooper());
    }

    @Override // androidx.core.app.r, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f17551b.c();
    }

    @Override // androidx.core.app.r
    public void onHandleWork(Intent intent) throws Throwable {
        String action = intent.getAction();
        if (!"com.apple.android.music.playback.reporting.PLAY_ACTIVITY".equals(action)) {
            if ("com.apple.android.music.playback.reporting.SEND_PLAY_ACTIVITY_EVENTS".equals(action)) {
                a();
            }
        } else {
            com.apple.android.music.playback.reporting.a aVar = (com.apple.android.music.playback.reporting.a) intent.getParcelableExtra("playActivityEvent");
            if (aVar != null) {
                a(aVar);
            }
        }
    }

    private void a(com.apple.android.music.playback.reporting.a aVar) throws Throwable {
        this.f17551b.b(aVar);
        if (this.f17551b.a(aVar)) {
            a();
        } else {
            this.f17552c.postDelayed(new a(getApplicationContext()), this.f17551b.a());
        }
    }

    private void a() throws Throwable {
        if (this.f17550a.i()) {
            this.f17551b.b();
        }
    }
}
