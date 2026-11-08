package com.apple.android.music.renderer.javanative;

import org.bytedeco.javacpp.Pointer;
import org.bytedeco.javacpp.annotation.Cast;
import org.bytedeco.javacpp.annotation.Name;
import org.bytedeco.javacpp.annotation.Platform;
import org.bytedeco.javacpp.annotation.StdString;

/* JADX INFO: loaded from: classes.dex */
@Platform(include = {"SVError.h"}, link = {"androidappmusic"})
@Name({"SVError"})
public class SVError extends Pointer {
    public native int componentErrorCode();

    @Cast({"int32_t"})
    public native int errorCode();

    @StdString
    public native String errorDescription();
}
