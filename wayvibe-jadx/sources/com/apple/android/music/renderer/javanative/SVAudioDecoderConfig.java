package com.apple.android.music.renderer.javanative;

import com.apple.android.music.renderer.a;
import java.nio.ByteBuffer;
import org.bytedeco.javacpp.Loader;
import org.bytedeco.javacpp.Pointer;
import org.bytedeco.javacpp.annotation.ByRef;
import org.bytedeco.javacpp.annotation.ByVal;
import org.bytedeco.javacpp.annotation.Cast;
import org.bytedeco.javacpp.annotation.Const;
import org.bytedeco.javacpp.annotation.Name;
import org.bytedeco.javacpp.annotation.Namespace;
import org.bytedeco.javacpp.annotation.Platform;

/* JADX INFO: loaded from: classes.dex */
@Platform(include = {"SVAudioDecoderConfig.h"}, link = {"androidappmusic"})
public class SVAudioDecoderConfig {
    static {
        Loader.load();
    }

    @Name({"std::shared_ptr<SVAudioDecoderConfig>"})
    @Namespace("")
    public static class SVAudioDecoderConfigSRef extends Pointer {
        public static SVAudioDecoderConfigSRef create(ByteBuffer byteBuffer, int i10, int i11) {
            int iB = a.b(byteBuffer);
            SVAudioDecoderConfigSRef sVAudioDecoderConfigSRefCreateSharedPtr = createSharedPtr(byteBuffer, iB, i10, i11);
            byteBuffer.position(iB);
            return sVAudioDecoderConfigSRefCreateSharedPtr;
        }

        @ByVal
        @Name({"std::make_shared<SVAudioDecoderConfig>"})
        @Namespace("")
        private static native SVAudioDecoderConfigSRef createSharedPtr(@ByRef @Cast({"uint32_t"}) @Const int i10, @Cast({"const uint8_t*"}) ByteBuffer byteBuffer, @ByRef @Cast({"uint32_t"}) @Const int i11);

        @ByVal
        @Name({"std::make_shared<SVAudioDecoderConfig>"})
        @Namespace("")
        private static native SVAudioDecoderConfigSRef createSharedPtr(@Cast({"const uint8_t*"}) ByteBuffer byteBuffer, @ByRef @Cast({"uint32_t"}) @Const int i10, @ByRef @Cast({"uint32_t"}) @Const int i11, @ByRef @Cast({"uint32_t"}) @Const int i12);

        public static SVAudioDecoderConfigSRef create(int i10, ByteBuffer byteBuffer) {
            int iB = a.b(byteBuffer);
            SVAudioDecoderConfigSRef sVAudioDecoderConfigSRefCreateSharedPtr = createSharedPtr(i10, byteBuffer, iB);
            byteBuffer.position(iB);
            return sVAudioDecoderConfigSRefCreateSharedPtr;
        }
    }
}
