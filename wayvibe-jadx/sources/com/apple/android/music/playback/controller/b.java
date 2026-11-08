package com.apple.android.music.playback.controller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
final class b extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final IntentFilter f17238a = new IntentFilter("android.media.AUDIO_BECOMING_NOISY");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f17239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f17240c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final MediaPlayerController f17241d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f17242e = false;

    public b(Context context, Handler handler, MediaPlayerController mediaPlayerController) {
        this.f17239b = context.getApplicationContext();
        this.f17240c = handler;
        this.f17241d = mediaPlayerController;
    }

    public void a() {
        if (this.f17242e) {
            return;
        }
        this.f17239b.registerReceiver(this, f17238a, null, this.f17240c);
        this.f17242e = true;
    }

    public void b() {
        if (this.f17242e) {
            this.f17239b.unregisterReceiver(this);
            this.f17242e = false;
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.f17241d.pause();
        }
    }
}
