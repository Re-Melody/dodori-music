package O2;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public interface k {
    ByteBuffer A(int i10);

    void B(Surface surface);

    ByteBuffer C(int i10);

    void D(X2.k kVar, Handler handler);

    void b(int i10, E2.c cVar, long j10, int i11);

    void d(Bundle bundle);

    void e(int i10, int i11, int i12, long j10);

    void flush();

    MediaFormat i();

    default boolean k(t tVar) {
        return false;
    }

    void o(int i10, long j10);

    int p();

    void release();

    int s(MediaCodec.BufferInfo bufferInfo);

    void w(int i10, boolean z10);

    void y(int i10);
}
