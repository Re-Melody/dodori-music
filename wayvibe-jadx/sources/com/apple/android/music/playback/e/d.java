package com.apple.android.music.playback.e;

import com.apple.android.music.renderer.javanative.SVError;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public interface d {
    int a(int i10, long j10, long j11, ByteBuffer byteBuffer, boolean z10);

    int a(ByteBuffer byteBuffer, int i10, int i11, long j10);

    SVError a(long j10);

    SVError a(ByteBuffer byteBuffer, int i10, int i11);

    void a(float f10);

    void a(int i10, byte[] bArr, byte[] bArr2);

    void a(c cVar);

    boolean a();

    int b();

    SVError c();

    SVError d();

    SVError e();
}
