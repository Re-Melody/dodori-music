package com.apple.android.music.renderer.javanative;

import org.bytedeco.javacpp.Loader;
import org.bytedeco.javacpp.Pointer;
import org.bytedeco.javacpp.annotation.ByRef;
import org.bytedeco.javacpp.annotation.Cast;
import org.bytedeco.javacpp.annotation.Const;
import org.bytedeco.javacpp.annotation.Name;
import org.bytedeco.javacpp.annotation.Namespace;
import org.bytedeco.javacpp.annotation.Platform;

/* JADX INFO: loaded from: classes.dex */
@Platform(include = {"SVEqualizer.h"}, link = {"androidappmusic"})
@Namespace("")
public class SVFuseEqualizerJNI {

    @Name({"SVEqualizer"})
    public static class SVFuseEqualizer extends Pointer {
        public native boolean audioEffectsEnabled();

        public native void enableAudioEffects(@ByRef @Const boolean z10);

        public native int getBassBoostStrength();

        public native int getCurrentPreset();

        @ByRef
        @Const
        public native SVEqualizerPreset.SVEqualizerPresetsVector getEqualizerPresets();

        @ByRef
        @Const
        public native SVFrequencyBand.SVFrequencyBandSRef getFrequencyBandByIdx(@ByRef @Cast({"uint32_t"}) @Const int i10);

        @ByRef
        @Const
        public native SVFrequencyBand.SVFrequencyBandsVector getFrequencyBands();

        public native boolean isBassBoostSupported();

        public native boolean isEqualizerSupported();

        public native boolean isSurroundSoundSupported();

        public native void setBassBoostStrength(@ByRef @Cast({"uint32_t"}) @Const int i10);

        public native void setEqualizerPreset(@ByRef @Cast({"int32_t"}) @Const int i10);

        public native void setFrequencyBandLevel(@ByRef @Cast({"uint32_t"}) @Const int i10, @ByRef @Cast({"uint32_t"}) @Const int i11);
    }

    @Name({"std::shared_ptr<SVEqualizer>"})
    public static class SVFuseEqualizerPtr extends Pointer {
        public native SVFuseEqualizer get();
    }

    static {
        Loader.load();
    }
}
