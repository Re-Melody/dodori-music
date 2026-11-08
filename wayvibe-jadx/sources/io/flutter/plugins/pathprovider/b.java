package io.flutter.plugins.pathprovider;

import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import p161o8.w;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends w {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f21041d = new b();

    @Override // p161o8.w
    public final Object f(byte b10, ByteBuffer byteBuffer) {
        if (b10 != -127) {
            return super.f(b10, byteBuffer);
        }
        Object objE = e(byteBuffer);
        if (objE == null) {
            return null;
        }
        return c.values()[((Long) objE).intValue()];
    }

    @Override // p161o8.w
    public final void k(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        if (!(obj instanceof c)) {
            super.k(byteArrayOutputStream, obj);
        } else {
            byteArrayOutputStream.write(129);
            k(byteArrayOutputStream, obj == null ? null : Integer.valueOf(((c) obj).index));
        }
    }
}
