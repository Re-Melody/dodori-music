package com.apple.android.music.renderer;

import com.apple.android.music.renderer.javanative.SVAudioDecoderConfig;
import com.apple.android.music.renderer.javanative.SVAudioDecoderJNI;
import com.apple.android.music.renderer.javanative.SVBuffer;
import com.apple.android.music.renderer.javanative.SVBufferToBeFilledCallback;
import com.apple.android.music.renderer.javanative.SVEndOfStreamCallback;
import com.apple.android.music.renderer.javanative.SVError;
import com.apple.android.music.renderer.javanative.SVErrorCallback;
import com.apple.android.music.renderer.javanative.SVFuseAudioDecoderObserver;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class a implements com.apple.android.music.playback.e.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SVAudioDecoderJNI f17636a = new SVAudioDecoderJNI();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SVBufferToBeFilledCallback f17637b = new SVBufferToBeFilledCallback();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SVErrorCallback f17638c = new SVErrorCallback();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private SVEndOfStreamCallback f17639d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private SVFuseAudioDecoderObserver.SVAudioDecoderObserverPtr f17640e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ArrayList<SVBuffer> f17641f;

    public a() {
        SVEndOfStreamCallback sVEndOfStreamCallback = new SVEndOfStreamCallback();
        this.f17639d = sVEndOfStreamCallback;
        this.f17640e = SVFuseAudioDecoderObserver.SVAudioDecoderObserver.create(this.f17637b, sVEndOfStreamCallback, this.f17638c);
        this.f17641f = new ArrayList<>();
    }

    @Override // com.apple.android.music.playback.e.b
    public void a(com.apple.android.music.playback.e.c cVar) {
        this.f17637b.setObserverJNI(cVar);
        this.f17638c.setObserverJNI(cVar);
        this.f17639d.setObserverJNI(cVar);
        this.f17636a.setObserver(this.f17640e);
    }

    @Override // com.apple.android.music.playback.e.b
    public boolean b() {
        SVAudioDecoderJNI sVAudioDecoderJNI = this.f17636a;
        if (sVAudioDecoderJNI != null) {
            return sVAudioDecoderJNI.hasPendingData();
        }
        return false;
    }

    @Override // com.apple.android.music.playback.e.b
    public boolean c() {
        SVAudioDecoderJNI sVAudioDecoderJNI = this.f17636a;
        if (sVAudioDecoderJNI != null) {
            return sVAudioDecoderJNI.requiresOutputBuffers();
        }
        return false;
    }

    @Override // com.apple.android.music.playback.e.b
    public SVError d() {
        SVAudioDecoderJNI sVAudioDecoderJNI = this.f17636a;
        if (sVAudioDecoderJNI != null) {
            return sVAudioDecoderJNI.start();
        }
        return null;
    }

    @Override // com.apple.android.music.playback.e.b
    public SVError e() {
        SVAudioDecoderJNI sVAudioDecoderJNI = this.f17636a;
        if (sVAudioDecoderJNI != null) {
            return sVAudioDecoderJNI.pause();
        }
        return null;
    }

    @Override // com.apple.android.music.playback.e.b
    public SVError f() {
        SVAudioDecoderJNI sVAudioDecoderJNI = this.f17636a;
        if (sVAudioDecoderJNI != null) {
            return sVAudioDecoderJNI.stop();
        }
        return null;
    }

    @Override // com.apple.android.music.playback.e.b
    public SVError g() {
        SVAudioDecoderJNI sVAudioDecoderJNI = this.f17636a;
        SVError sVErrorReset = sVAudioDecoderJNI != null ? sVAudioDecoderJNI.reset() : null;
        this.f17641f.clear();
        return sVErrorReset;
    }

    @Override // com.apple.android.music.playback.e.b
    public SVError h() {
        SVAudioDecoderJNI sVAudioDecoderJNI = this.f17636a;
        if (sVAudioDecoderJNI != null) {
            return sVAudioDecoderJNI.discardData();
        }
        return null;
    }

    @Override // com.apple.android.music.playback.e.b
    public SVBuffer i() {
        SVAudioDecoderJNI sVAudioDecoderJNI = this.f17636a;
        if (sVAudioDecoderJNI != null) {
            return sVAudioDecoderJNI.bufferToBeRendered();
        }
        return null;
    }

    @Override // com.apple.android.music.playback.e.b
    public int j() {
        SVAudioDecoderJNI sVAudioDecoderJNI = this.f17636a;
        if (sVAudioDecoderJNI != null) {
            return sVAudioDecoderJNI.samplingRate();
        }
        return 0;
    }

    @Override // com.apple.android.music.playback.e.b
    public int k() {
        SVAudioDecoderJNI sVAudioDecoderJNI = this.f17636a;
        if (sVAudioDecoderJNI != null) {
            return sVAudioDecoderJNI.numberOfChannels();
        }
        return 0;
    }

    @Override // com.apple.android.music.playback.e.b
    public int l() {
        SVAudioDecoderJNI sVAudioDecoderJNI = this.f17636a;
        if (sVAudioDecoderJNI != null) {
            return sVAudioDecoderJNI.outputFormat();
        }
        return 0;
    }

    @Override // com.apple.android.music.playback.e.b
    public int m() {
        SVAudioDecoderJNI sVAudioDecoderJNI = this.f17636a;
        if (sVAudioDecoderJNI != null) {
            return sVAudioDecoderJNI.framesPerPacket();
        }
        return 0;
    }

    @Override // com.apple.android.music.playback.e.b
    public void n() {
        SVAudioDecoderJNI sVAudioDecoderJNI = this.f17636a;
        if (sVAudioDecoderJNI != null) {
            sVAudioDecoderJNI.clearOutputBuffers();
            this.f17641f.clear();
        }
    }

    public static int b(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        byteBuffer.position(0);
        return iPosition;
    }

    @Override // com.apple.android.music.playback.e.b
    public int a() {
        SVAudioDecoderJNI sVAudioDecoderJNI = this.f17636a;
        if (sVAudioDecoderJNI != null) {
            return sVAudioDecoderJNI.state();
        }
        return 0;
    }

    @Override // com.apple.android.music.playback.e.b
    public boolean a(ByteBuffer... byteBufferArr) {
        int i10 = 0;
        if (this.f17636a == null || byteBufferArr == null || byteBufferArr.length <= 0) {
            return false;
        }
        ArrayList<SVBuffer> arrayList = new ArrayList<>();
        boolean z10 = false;
        while (i10 < byteBufferArr.length) {
            SVBuffer sVBuffer = new SVBuffer(i10, byteBufferArr[i10]);
            boolean zRegisterOutputBuffer = this.f17636a.registerOutputBuffer(sVBuffer);
            if (!zRegisterOutputBuffer) {
                sVBuffer.deallocate();
                z10 = zRegisterOutputBuffer;
                break;
            }
            arrayList.add(sVBuffer);
            i10++;
            z10 = zRegisterOutputBuffer;
        }
        ArrayList<SVBuffer> arrayList2 = this.f17641f;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        this.f17641f = arrayList;
        return z10;
    }

    @Override // com.apple.android.music.playback.e.b
    public SVError a(ByteBuffer byteBuffer) {
        if (this.f17636a == null) {
            return null;
        }
        SVAudioDecoderConfig.SVAudioDecoderConfigSRef sVAudioDecoderConfigSRefCreate = SVAudioDecoderConfig.SVAudioDecoderConfigSRef.create(byteBuffer, 0, 0);
        SVError sVErrorInit = this.f17636a.init(sVAudioDecoderConfigSRefCreate);
        sVAudioDecoderConfigSRefCreate.deallocate();
        return sVErrorInit;
    }

    @Override // com.apple.android.music.playback.e.b
    public int a(int i10, ByteBuffer byteBuffer) {
        if (this.f17636a == null) {
            return 0;
        }
        SVAudioDecoderConfig.SVAudioDecoderConfigSRef sVAudioDecoderConfigSRefCreate = SVAudioDecoderConfig.SVAudioDecoderConfigSRef.create(i10, byteBuffer);
        this.f17636a.enqueueAudioConfigChange(0L, sVAudioDecoderConfigSRefCreate);
        sVAudioDecoderConfigSRefCreate.deallocate();
        return 0;
    }

    @Override // com.apple.android.music.playback.e.b
    public int a(int i10, long j10, long j11, ByteBuffer byteBuffer, boolean z10) {
        if (this.f17636a == null) {
            return -1;
        }
        int iB = b(byteBuffer);
        int iEnqueueSample = this.f17636a.enqueueSample(i10, j10, j11, byteBuffer, iB, z10);
        byteBuffer.position(iB);
        return iEnqueueSample;
    }

    @Override // com.apple.android.music.playback.e.b
    public void a(int i10, byte[] bArr, byte[] bArr2) {
        SVAudioDecoderJNI sVAudioDecoderJNI = this.f17636a;
        if (sVAudioDecoderJNI != null) {
            sVAudioDecoderJNI.enqueueDecryptionData(i10, bArr, bArr != null ? bArr.length : 0, bArr2, bArr2 != null ? bArr2.length : 0);
        }
    }

    @Override // com.apple.android.music.playback.e.b
    public void a(int i10) {
        SVAudioDecoderJNI sVAudioDecoderJNI = this.f17636a;
        if (sVAudioDecoderJNI != null) {
            sVAudioDecoderJNI.bufferConsumed(i10);
        }
    }
}
