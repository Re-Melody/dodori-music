package com.apple.android.music.renderer.javanative;

import org.bytedeco.javacpp.Loader;
import org.bytedeco.javacpp.Pointer;
import org.bytedeco.javacpp.annotation.ByRef;
import org.bytedeco.javacpp.annotation.Cast;
import org.bytedeco.javacpp.annotation.Name;
import org.bytedeco.javacpp.annotation.Namespace;
import org.bytedeco.javacpp.annotation.Platform;
import org.bytedeco.javacpp.annotation.StdString;

/* JADX INFO: loaded from: classes.dex */
@Platform(include = {"SVEqualizerPreset.h"}, link = {"c++_shared", "androidappmusic"})
@Namespace("")
public class SVEqualizerPreset {

    @Name({"SVEqualizerPreset"})
    public static class SVEqualizerPresetNative extends Pointer {
        public native int idx();

        @StdString
        public native String name();
    }

    @Name({"std::shared_ptr<SVEqualizerPreset>"})
    @Namespace("")
    public static class SVEqualizerPresetSRef extends Pointer {
        public native SVEqualizerPresetNative get();
    }

    @Name({"std::vector<std::shared_ptr<SVEqualizerPreset>>"})
    public class SVEqualizerPresetsVector extends Pointer {
        public SVEqualizerPresetsVector() {
        }

        @ByRef
        @Name({"operator[]"})
        public native SVEqualizerPresetSRef get(@Cast({"size_t"}) long j10);

        @Name({"empty"})
        public native boolean isEmpty();

        public native long size();
    }

    static {
        Loader.load();
    }
}
