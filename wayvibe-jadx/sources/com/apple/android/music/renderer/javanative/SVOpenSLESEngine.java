package com.apple.android.music.renderer.javanative;

import org.bytedeco.javacpp.Loader;
import org.bytedeco.javacpp.Pointer;
import org.bytedeco.javacpp.annotation.ByRef;
import org.bytedeco.javacpp.annotation.ByVal;
import org.bytedeco.javacpp.annotation.Name;
import org.bytedeco.javacpp.annotation.Namespace;
import org.bytedeco.javacpp.annotation.Platform;

/* JADX INFO: loaded from: classes.dex */
@Platform(include = {"SVOpenSLESEngine.h"}, link = {"androidappmusic"})
@Namespace("")
public class SVOpenSLESEngine {

    @Name({"SVOpenSLESEngine"})
    public static class SVOpenSLESEngineNative extends Pointer {
        @ByVal
        public static native SVOpenSLESEnginePtr create();

        @ByRef
        public native SVOpenSLESOutputMix.SVOpenSLESOutputMixPtr outputMix();
    }

    @Name({"std::shared_ptr<SVOpenSLESEngine>"})
    public static class SVOpenSLESEnginePtr extends Pointer {
        public native SVOpenSLESEngineNative get();
    }

    static {
        Loader.load();
    }
}
