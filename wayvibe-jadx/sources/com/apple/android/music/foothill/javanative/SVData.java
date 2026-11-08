package com.apple.android.music.foothill.javanative;

import org.bytedeco.javacpp.Pointer;
import org.bytedeco.javacpp.annotation.ByVal;
import org.bytedeco.javacpp.annotation.Cast;
import org.bytedeco.javacpp.annotation.Const;
import org.bytedeco.javacpp.annotation.Name;
import org.bytedeco.javacpp.annotation.Namespace;
import org.bytedeco.javacpp.annotation.Platform;

/* JADX INFO: loaded from: classes.dex */
@Platform(include = {"SVData.h"}, link = {"androidappmusic"})
public class SVData {

    @Name({"SVData"})
    public static class SVDataNative extends Pointer {
        @Const
        @Name({"bytes"})
        public native Pointer getBytes();

        @Name({"length"})
        public native long getLength();

        public byte[] toBytes() {
            if (getLength() <= 0) {
                return null;
            }
            int length = (int) getLength();
            byte[] bArr = new byte[length];
            getBytes().position(0L).limit(length).asByteBuffer().get(bArr);
            return bArr;
        }

        @Override // org.bytedeco.javacpp.Pointer
        public String toString() {
            if (getLength() <= 0) {
                return null;
            }
            int length = (int) getLength();
            byte[] bArr = new byte[length];
            getBytes().position(0L).limit(length).asByteBuffer().get(bArr);
            return new String(bArr);
        }
    }

    @Name({"std::shared_ptr<SVData>"})
    public static class SVDataPtr extends Pointer {
        @ByVal
        @Name({"SVData::create"})
        @Namespace("")
        public static native SVDataPtr create(@Cast({"const void*"}) byte[] bArr, int i10, boolean z10);

        public native SVDataNative get();
    }
}
