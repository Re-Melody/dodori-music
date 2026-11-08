package com.apple.android.music.renderer.javanative;

import java.nio.ByteBuffer;
import org.bytedeco.javacpp.IntPointer;
import org.bytedeco.javacpp.Loader;
import org.bytedeco.javacpp.Pointer;
import org.bytedeco.javacpp.annotation.Cast;
import org.bytedeco.javacpp.annotation.Name;
import org.bytedeco.javacpp.annotation.Namespace;
import org.bytedeco.javacpp.annotation.Platform;

/* JADX INFO: loaded from: classes.dex */
@Platform(include = {"SVDecryptor.h"}, link = {"androidappmusic"})
@Namespace("")
public class SVDecryptor {

    @Name({"SVDecryptor"})
    public static class SVDecryptorNative extends Pointer {
        public native void decryptSample(@Cast({"uint8_t*"}) ByteBuffer byteBuffer, @Cast({"uint32_t"}) int i10, @Cast({"uint32_t*"}) IntPointer intPointer);
    }

    @Name({"std::shared_ptr<SVDecryptor>"})
    public static class SVDecryptorPtr extends Pointer {
        public native SVDecryptorNative get();
    }

    static {
        Loader.load();
    }
}
