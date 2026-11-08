package com.apple.android.music.renderer.javanative;

import java.nio.ByteBuffer;
import org.bytedeco.javacpp.Pointer;
import org.bytedeco.javacpp.annotation.ByPtr;
import org.bytedeco.javacpp.annotation.ByRef;
import org.bytedeco.javacpp.annotation.ByVal;
import org.bytedeco.javacpp.annotation.Cast;
import org.bytedeco.javacpp.annotation.Const;
import org.bytedeco.javacpp.annotation.Name;
import org.bytedeco.javacpp.annotation.Platform;

/* JADX INFO: loaded from: classes.dex */
@Platform(include = {"SVAudioDecoderJNI.h", "SVAudioDecoderObserverJNI.h", "SVBuffer.h", "SVAudioSample.h"}, link = {"androidappmusic"})
@Name({"SVAudioDecoderJNI"})
public class SVAudioDecoderJNI extends Pointer {
    public SVAudioDecoderJNI() {
        allocate();
    }

    private native void allocate();

    public native void bufferConsumed(int i10);

    @Const
    public native SVBuffer bufferToBeRendered();

    public native void clearOutputBuffers();

    @ByVal
    public native SVError discardData();

    @Cast({"int8_t"})
    public native int enqueueAudioConfigChange(@ByRef @Const long j10, @ByRef @Const SVAudioDecoderConfig.SVAudioDecoderConfigSRef sVAudioDecoderConfigSRef);

    public native void enqueueDecryptionData(@ByRef @Const int i10, @Cast({"const uint8_t*"}) byte[] bArr, @ByRef @Cast({"uint32_t"}) @Const int i11, @Cast({"const uint8_t*"}) byte[] bArr2, @ByRef @Cast({"uint32_t"}) @Const int i12);

    @Cast({"int8_t"})
    public native int enqueueSample(@ByRef @Cast({"uint8_t"}) @Const int i10, @ByRef @Cast({"uint64_t"}) @Const long j10, @ByRef @Cast({"uint64_t"}) @Const long j11, @Cast({"const uint8_t*"}) ByteBuffer byteBuffer, @ByRef @Cast({"uint32_t"}) @Const int i11, boolean z10);

    public native int framesPerPacket();

    public native boolean hasPendingData();

    @ByVal
    public native SVError init(@ByRef @Const SVAudioDecoderConfig.SVAudioDecoderConfigSRef sVAudioDecoderConfigSRef);

    public native int numberOfChannels();

    public native int outputFormat();

    @ByVal
    public native SVError pause();

    public native boolean registerOutputBuffer(@Const @ByPtr SVBuffer sVBuffer);

    public native boolean requiresOutputBuffers();

    @ByVal
    public native SVError reset();

    public native int samplingRate();

    public native void setObserver(@ByRef @Const SVFuseAudioDecoderObserver.SVAudioDecoderObserverPtr sVAudioDecoderObserverPtr);

    @ByVal
    public native SVError start();

    @Cast({"int8_t"})
    public native int state();

    @ByVal
    public native SVError stop();
}
