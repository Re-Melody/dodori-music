package com.apple.android.music.renderer.javanative;

import org.bytedeco.javacpp.Loader;
import org.bytedeco.javacpp.Pointer;
import org.bytedeco.javacpp.annotation.ByRef;
import org.bytedeco.javacpp.annotation.Name;
import org.bytedeco.javacpp.annotation.Namespace;
import org.bytedeco.javacpp.annotation.Platform;

/* JADX INFO: loaded from: classes.dex */
@Platform(include = {"SVOpenSLESOutputMix.h"}, link = {"androidappmusic"})
@Namespace("")
public class SVOpenSLESOutputMix {

    @Name({"SVOpenSLESOutputMix"})
    public static class SVOpenSLESOutputMixNative extends Pointer {
        @ByRef
        public native SVFuseEqualizerJNI.SVFuseEqualizerPtr equalizer();
    }

    @Name({"std::shared_ptr<SVOpenSLESOutputMix>"})
    public static class SVOpenSLESOutputMixPtr extends Pointer {
        public native SVOpenSLESOutputMixNative get();
    }

    static {
        Loader.load();
    }
}
