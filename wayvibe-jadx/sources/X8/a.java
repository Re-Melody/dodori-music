package X8;

import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends ByteArrayOutputStream {
    public byte[] b() {
        return ((ByteArrayOutputStream) this).buf;
    }

    public byte[] c() {
        byte[] buf = ((ByteArrayOutputStream) this).buf;
        kotlin.jvm.internal.m.e(buf, "buf");
        return buf;
    }
}
