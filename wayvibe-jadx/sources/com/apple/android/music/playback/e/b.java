package com.apple.android.music.playback.e;

import com.apple.android.music.renderer.javanative.SVBuffer;
import com.apple.android.music.renderer.javanative.SVError;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public interface b {
    int a();

    int a(int i10, long j10, long j11, ByteBuffer byteBuffer, boolean z10);

    int a(int i10, ByteBuffer byteBuffer);

    SVError a(ByteBuffer byteBuffer);

    void a(int i10);

    void a(int i10, byte[] bArr, byte[] bArr2);

    void a(c cVar);

    boolean a(ByteBuffer... byteBufferArr);

    boolean b();

    boolean c();

    SVError d();

    SVError e();

    SVError f();

    SVError g();

    SVError h();

    SVBuffer i();

    int j();

    int k();

    int l();

    int m();

    void n();
}
