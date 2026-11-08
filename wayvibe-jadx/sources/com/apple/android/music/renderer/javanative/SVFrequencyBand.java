package com.apple.android.music.renderer.javanative;

import org.bytedeco.javacpp.Loader;
import org.bytedeco.javacpp.Pointer;
import org.bytedeco.javacpp.annotation.ByRef;
import org.bytedeco.javacpp.annotation.Cast;
import org.bytedeco.javacpp.annotation.Name;
import org.bytedeco.javacpp.annotation.Namespace;
import org.bytedeco.javacpp.annotation.Platform;

/* JADX INFO: loaded from: classes.dex */
@Platform(include = {"SVFrequencyBand.h"}, link = {"c++_shared", "androidappmusic"})
@Namespace("")
public class SVFrequencyBand extends Pointer {

    @Name({"SVFrequencyBand"})
    @Namespace("")
    public static class SVFrequencyBandNative extends Pointer {
        public native int getFrequency();

        public native int getIndex();

        public native int getLevel();

        public native int getMaxLevel();

        public native int getMinLevel();
    }

    @Name({"std::shared_ptr<SVFrequencyBand>"})
    @Namespace("")
    public static class SVFrequencyBandSRef extends Pointer {
        public native SVFrequencyBandNative get();
    }

    @Name({"std::vector<std::shared_ptr<SVFrequencyBand>>"})
    @Namespace("")
    public class SVFrequencyBandsVector extends Pointer {
        public SVFrequencyBandsVector() {
        }

        @ByRef
        @Name({"operator[]"})
        public native SVFrequencyBandSRef get(@Cast({"size_t"}) long j10);

        @Name({"empty"})
        public native boolean isEmpty();

        public native long size();
    }

    static {
        Loader.load();
    }
}
