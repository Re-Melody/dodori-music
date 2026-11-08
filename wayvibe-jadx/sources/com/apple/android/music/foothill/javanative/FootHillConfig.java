package com.apple.android.music.foothill.javanative;

import org.bytedeco.javacpp.Pointer;
import org.bytedeco.javacpp.annotation.Name;
import org.bytedeco.javacpp.annotation.Namespace;
import org.bytedeco.javacpp.annotation.Platform;
import org.bytedeco.javacpp.annotation.StdString;

/* JADX INFO: loaded from: classes.dex */
@Platform(include = {"FootHillConfig.h"}, link = {"androidappmusic"})
@Name({"FootHillConfig"})
@Namespace("")
public class FootHillConfig extends Pointer {
    public static native int config(@StdString String str);
}
