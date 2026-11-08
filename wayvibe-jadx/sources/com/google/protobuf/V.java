package com.google.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public abstract class V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f18703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f18704b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ByteBuffer f18705c;

    static {
        Charset.forName("US-ASCII");
        f18703a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f18704b = bArr;
        f18705c = ByteBuffer.wrap(bArr);
        AbstractC1260p.f(bArr, 0, 0, false);
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
