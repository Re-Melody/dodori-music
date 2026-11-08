package com.apple.android.music.renderer.javanative;

import org.bytedeco.javacpp.Pointer;
import org.bytedeco.javacpp.annotation.ByVal;
import org.bytedeco.javacpp.annotation.Cast;
import org.bytedeco.javacpp.annotation.Name;
import org.bytedeco.javacpp.annotation.Platform;

/* JADX INFO: loaded from: classes.dex */
@Platform(include = {"SVDecryptorFactory.h"}, link = {"androidappmusic"})
@Name({"SVDecryptorFactory"})
public class SVDecryptorFactory extends Pointer {
    @ByVal
    public static native SVDecryptor.SVDecryptorPtr create(@Cast({"SVDecryptor::SVDecryptorType"}) int i10, @Cast({"const uint8_t*"}) byte[] bArr, @Cast({"uint32_t"}) int i11, @Cast({"const uint8_t*"}) byte[] bArr2, @Cast({"uint32_t"}) int i12, @Cast({"SVDecryptor::SVDecryptorTrackType"}) int i13, boolean z10);
}
