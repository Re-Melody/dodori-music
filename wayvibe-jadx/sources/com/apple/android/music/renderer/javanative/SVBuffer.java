package com.apple.android.music.renderer.javanative;

import java.nio.ByteBuffer;
import org.bytedeco.javacpp.BytePointer;
import org.bytedeco.javacpp.Pointer;
import org.bytedeco.javacpp.annotation.ByRef;
import org.bytedeco.javacpp.annotation.Cast;
import org.bytedeco.javacpp.annotation.Const;
import org.bytedeco.javacpp.annotation.Name;
import org.bytedeco.javacpp.annotation.Platform;

/* JADX INFO: loaded from: classes.dex */
@Platform(include = {"SVBuffer.h"}, link = {"androidappmusic"})
@Name({"SVBuffer"})
public class SVBuffer extends Pointer {
    public SVBuffer(int i10, ByteBuffer byteBuffer) {
        allocate(i10, 0L, byteBuffer, byteBuffer.limit(), false);
    }

    private native void allocate(@ByRef @Cast({"uint8_t"}) @Const int i10, @ByRef @Cast({"uint64_t"}) @Const long j10, @Cast({"const uint8_t*"}) ByteBuffer byteBuffer, @ByRef @Cast({"uint32_t"}) @Const int i11, boolean z10);

    @Cast({"uint8_t*"})
    @Const
    public native BytePointer buffer();

    public native long duration();

    public native int id();

    public native boolean isEOS();

    public native boolean isFull();

    public native int occupancy();

    public native int size();

    public native int state();

    public native long ts();
}
