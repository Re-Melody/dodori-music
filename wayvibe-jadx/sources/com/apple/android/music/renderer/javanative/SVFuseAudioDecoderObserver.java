package com.apple.android.music.renderer.javanative;

import org.bytedeco.javacpp.Loader;
import org.bytedeco.javacpp.Pointer;
import org.bytedeco.javacpp.annotation.ByVal;
import org.bytedeco.javacpp.annotation.Name;
import org.bytedeco.javacpp.annotation.Namespace;
import org.bytedeco.javacpp.annotation.Platform;

/* JADX INFO: loaded from: classes.dex */
@Platform(include = {"SVAudioDecoderObserverJNI.h"}, link = {"androidappmusic"})
public class SVFuseAudioDecoderObserver {

    @Name({"SVAudioDecoderObserverJNI"})
    public static class SVAudioDecoderObserver extends Pointer {
        @ByVal
        public static native SVAudioDecoderObserverPtr create(SVBufferToBeFilledCallback sVBufferToBeFilledCallback, SVEndOfStreamCallback sVEndOfStreamCallback, SVErrorCallback sVErrorCallback);
    }

    @Name({"std::shared_ptr<SVAudioDecoderObserverJNI>"})
    @Namespace("")
    public static class SVAudioDecoderObserverPtr extends Pointer {
        @ByVal
        @Name({"std::make_shared<SVAudioDecoderObserverJNI>"})
        @Namespace("")
        public static native SVAudioDecoderObserverPtr create(SVBufferToBeFilledCallback sVBufferToBeFilledCallback, SVEndOfStreamCallback sVEndOfStreamCallback, SVErrorCallback sVErrorCallback);
    }

    static {
        Loader.load();
    }
}
