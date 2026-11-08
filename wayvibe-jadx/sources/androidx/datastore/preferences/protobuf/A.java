package androidx.datastore.preferences.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public abstract class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f15023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f15024b;

    static {
        Charset.forName("US-ASCII");
        f15023a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f15024b = bArr;
        ByteBuffer.wrap(bArr);
        try {
            new C1050h(bArr, 0, 0, false).l(0);
        } catch (C e2) {
            throw new IllegalArgumentException(e2);
        }
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
