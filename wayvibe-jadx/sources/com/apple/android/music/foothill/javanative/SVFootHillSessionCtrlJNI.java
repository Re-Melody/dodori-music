package com.apple.android.music.foothill.javanative;

import org.bytedeco.javacpp.Pointer;
import org.bytedeco.javacpp.annotation.ByRef;
import org.bytedeco.javacpp.annotation.ByVal;
import org.bytedeco.javacpp.annotation.Const;
import org.bytedeco.javacpp.annotation.Name;
import org.bytedeco.javacpp.annotation.Platform;
import org.bytedeco.javacpp.annotation.StdString;

/* JADX INFO: loaded from: classes.dex */
@Platform(include = {"SVFootHillSessionCtrl.h"}, link = {"androidappmusic"})
public class SVFootHillSessionCtrlJNI {

    @Name({"SVFootHillSessionCtrl"})
    public static class SVFootHillSessionCtrlPtr extends Pointer {
        public static native void destroy();

        public static native SVFootHillSessionCtrlPtr instance();

        public native int error();

        public native long generateSessionContext(@StdString String str, @StdString String str2);

        @ByVal
        public native SVData.SVDataPtr generateSessionExchange(@StdString String str, @ByRef @Const SVData.SVDataPtr sVDataPtr, @StdString String str2, @StdString String str3);

        @Name({"resetAllContexts"})
        public native void reset();

        public native void resetSessionContext(@StdString String str);
    }
}
