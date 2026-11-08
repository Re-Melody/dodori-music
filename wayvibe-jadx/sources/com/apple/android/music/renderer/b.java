package com.apple.android.music.renderer;

import com.apple.android.music.playback.e.d;
import com.apple.android.music.renderer.javanative.SVAudioDecoderConfig;
import com.apple.android.music.renderer.javanative.SVBufferToBeFilledCallback;
import com.apple.android.music.renderer.javanative.SVEndOfStreamCallback;
import com.apple.android.music.renderer.javanative.SVError;
import com.apple.android.music.renderer.javanative.SVErrorCallback;
import com.apple.android.music.renderer.javanative.SVFuseAudioRendererJNI;
import com.apple.android.music.renderer.javanative.SVFuseAudioRendererObserver;
import com.apple.android.music.renderer.javanative.SVOpenSLESEngine;
import com.apple.android.music.renderer.javanative.SVPlaybackPositionCallback;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SVFuseAudioRendererJNI.SVFuseAudioRenderer f17651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SVBufferToBeFilledCallback f17652b = new SVBufferToBeFilledCallback();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SVPlaybackPositionCallback f17653c = new SVPlaybackPositionCallback();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private SVErrorCallback f17654d = new SVErrorCallback();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private SVEndOfStreamCallback f17655e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private SVFuseAudioRendererObserver.SVAudioRendererObserverPtr f17656f;

    public b(SVOpenSLESEngine.SVOpenSLESEnginePtr sVOpenSLESEnginePtr) {
        this.f17651a = new SVFuseAudioRendererJNI.SVFuseAudioRendererImpl(sVOpenSLESEnginePtr);
        SVEndOfStreamCallback sVEndOfStreamCallback = new SVEndOfStreamCallback();
        this.f17655e = sVEndOfStreamCallback;
        this.f17656f = SVFuseAudioRendererObserver.SVAudioRendererObserver.create(this.f17652b, this.f17653c, sVEndOfStreamCallback, this.f17654d);
    }

    @Override // com.apple.android.music.playback.e.d
    public void a(com.apple.android.music.playback.e.c cVar) {
        this.f17652b.setObserverJNI(cVar);
        this.f17653c.setObserverJNI(cVar);
        this.f17654d.setObserverJNI(cVar);
        this.f17655e.setObserverJNI(cVar);
        this.f17651a.setRendererObserver(this.f17656f);
    }

    @Override // com.apple.android.music.playback.e.d
    public int b() {
        SVFuseAudioRendererJNI.SVFuseAudioRenderer sVFuseAudioRenderer = this.f17651a;
        if (sVFuseAudioRenderer != null) {
            return sVFuseAudioRenderer.state();
        }
        return 0;
    }

    @Override // com.apple.android.music.playback.e.d
    public SVError c() {
        SVFuseAudioRendererJNI.SVFuseAudioRenderer sVFuseAudioRenderer = this.f17651a;
        if (sVFuseAudioRenderer != null) {
            return sVFuseAudioRenderer.start();
        }
        return null;
    }

    @Override // com.apple.android.music.playback.e.d
    public SVError d() {
        SVFuseAudioRendererJNI.SVFuseAudioRenderer sVFuseAudioRenderer = this.f17651a;
        if (sVFuseAudioRenderer != null) {
            return sVFuseAudioRenderer.pause();
        }
        return null;
    }

    @Override // com.apple.android.music.playback.e.d
    public SVError e() {
        SVFuseAudioRendererJNI.SVFuseAudioRenderer sVFuseAudioRenderer = this.f17651a;
        if (sVFuseAudioRenderer != null) {
            return sVFuseAudioRenderer.reset();
        }
        return null;
    }

    @Override // com.apple.android.music.playback.e.d
    public void a(float f10) {
        SVFuseAudioRendererJNI.SVFuseAudioRenderer sVFuseAudioRenderer = this.f17651a;
        if (sVFuseAudioRenderer != null) {
            sVFuseAudioRenderer.setVolume(f10);
        }
    }

    @Override // com.apple.android.music.playback.e.d
    public boolean a() {
        SVFuseAudioRendererJNI.SVFuseAudioRenderer sVFuseAudioRenderer = this.f17651a;
        if (sVFuseAudioRenderer != null) {
            return sVFuseAudioRenderer.hasPendingData();
        }
        return false;
    }

    @Override // com.apple.android.music.playback.e.d
    public SVError a(ByteBuffer byteBuffer, int i10, int i11) {
        if (this.f17651a == null) {
            return null;
        }
        SVAudioDecoderConfig.SVAudioDecoderConfigSRef sVAudioDecoderConfigSRefCreate = SVAudioDecoderConfig.SVAudioDecoderConfigSRef.create(byteBuffer, i10, i11);
        SVError sVErrorInit = this.f17651a.init(sVAudioDecoderConfigSRefCreate);
        sVAudioDecoderConfigSRefCreate.deallocate();
        return sVErrorInit;
    }

    @Override // com.apple.android.music.playback.e.d
    public SVError a(long j10) {
        SVFuseAudioRendererJNI.SVFuseAudioRenderer sVFuseAudioRenderer = this.f17651a;
        if (sVFuseAudioRenderer != null) {
            return sVFuseAudioRenderer.discardData(j10);
        }
        return null;
    }

    @Override // com.apple.android.music.playback.e.d
    public int a(ByteBuffer byteBuffer, int i10, int i11, long j10) {
        if (this.f17651a == null) {
            return 0;
        }
        SVAudioDecoderConfig.SVAudioDecoderConfigSRef sVAudioDecoderConfigSRefCreate = SVAudioDecoderConfig.SVAudioDecoderConfigSRef.create(byteBuffer, i10, i11);
        this.f17651a.enqueueAudioConfigChange(j10, sVAudioDecoderConfigSRefCreate);
        sVAudioDecoderConfigSRefCreate.deallocate();
        return 0;
    }

    @Override // com.apple.android.music.playback.e.d
    public int a(int i10, long j10, long j11, ByteBuffer byteBuffer, boolean z10) {
        SVFuseAudioRendererJNI.SVFuseAudioRenderer sVFuseAudioRenderer = this.f17651a;
        if (sVFuseAudioRenderer != null) {
            return sVFuseAudioRenderer.enqueueSample(i10, j10, j11, byteBuffer, byteBuffer.position(), z10);
        }
        return -1;
    }

    @Override // com.apple.android.music.playback.e.d
    public void a(int i10, byte[] bArr, byte[] bArr2) {
        SVFuseAudioRendererJNI.SVFuseAudioRenderer sVFuseAudioRenderer = this.f17651a;
        if (sVFuseAudioRenderer != null) {
            sVFuseAudioRenderer.enqueueDecryptionData(i10, bArr, bArr != null ? bArr.length : 0, bArr2, bArr2 != null ? bArr2.length : 0);
        }
    }
}
