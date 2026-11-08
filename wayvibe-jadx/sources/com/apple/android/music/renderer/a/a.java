package com.apple.android.music.renderer.a;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioTrack;
import android.os.Handler;
import com.apple.android.music.playback.e.a.d;
import com.apple.android.music.playback.e.e;
import com.apple.android.music.renderer.javanative.SVOpenSLESEngine;
import java.util.Objects;
import java.util.UUID;
import p235w4.v;
import p246x4.c;
import p246x4.g;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private UUID f17642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SVOpenSLESEngine.SVOpenSLESEnginePtr f17643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private d f17644c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private v f17645d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.apple.android.music.playback.e.a.b f17646e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f17647f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private AudioTrack f17648g;

    public a(com.apple.android.music.playback.e.a.b bVar, Context context) {
        Objects.toString(this.f17642a);
        if (com.apple.android.music.playback.d.a.a(context).l()) {
            this.f17647f = e();
        } else {
            this.f17642a = UUID.randomUUID();
            this.f17646e = bVar;
            this.f17643b = SVOpenSLESEngine.SVOpenSLESEngineNative.create();
            this.f17644c = b();
        }
        this.f17645d = null;
    }

    private int e() {
        AudioTrack audioTrack = new AudioTrack(3, 44100, 12, 2, AudioTrack.getMinBufferSize(44100, 12, 2), 1);
        this.f17648g = audioTrack;
        return audioTrack.getAudioSessionId();
    }

    public UUID a() {
        return this.f17642a;
    }

    public d b() {
        synchronized (a.class) {
            try {
                if (this.f17644c == null) {
                    Objects.toString(this.f17642a);
                    d dVar = new d(new com.apple.android.music.renderer.b.a(this.f17643b));
                    this.f17644c = dVar;
                    if (this.f17646e != null) {
                        dVar.a(dVar.a() && this.f17646e.d());
                        this.f17644c.a(this.f17646e.a());
                        if (this.f17646e.c()) {
                            this.f17644c.a(this.f17646e.b());
                        }
                        if (this.f17644c.b()) {
                            this.f17644c.b(this.f17646e.e());
                        }
                    }
                } else {
                    Objects.toString(this.f17642a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f17644c;
    }

    public int c() {
        return this.f17647f;
    }

    public boolean d() {
        return this.f17647f != 0;
    }

    public v a(Handler handler, g gVar, Context context) {
        synchronized (a.class) {
            try {
                if (this.f17645d == null) {
                    if (this.f17647f != 0) {
                        c cVar = c.f28437c;
                        Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
                        this.f17645d = new com.apple.android.music.playback.e.g((intentRegisterReceiver == null || intentRegisterReceiver.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) == 0) ? c.f28437c : new c(intentRegisterReceiver.getIntArrayExtra("android.media.extra.ENCODINGS"), intentRegisterReceiver.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 0)), this.f17647f, handler, gVar);
                        Intent intent = new Intent("android.media.action.OPEN_AUDIO_EFFECT_CONTROL_SESSION");
                        intent.putExtra("android.media.extra.AUDIO_SESSION", b.a().b().c());
                        intent.putExtra("android.media.extra.PACKAGE_NAME", context.getPackageName());
                        context.sendBroadcast(intent);
                    } else {
                        this.f17645d = new e(handler, gVar, this.f17643b);
                    }
                    Objects.toString(d() ? Integer.valueOf(this.f17647f) : this.f17642a);
                } else {
                    Objects.toString(d() ? Integer.valueOf(this.f17647f) : this.f17642a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f17645d;
    }
}
