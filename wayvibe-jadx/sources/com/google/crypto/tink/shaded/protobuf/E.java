package com.google.crypto.tink.shaded.protobuf;

import A9.AbstractC0106f;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public abstract class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f18377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f18378b;

    static {
        Charset.forName("US-ASCII");
        f18377a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f18378b = bArr;
        ByteBuffer.wrap(bArr);
        AbstractC0106f.h(bArr, 0, 0, false);
    }

    public static void a(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static int b(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }
}
