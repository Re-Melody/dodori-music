package p112k2;

import android.media.MediaDataSource;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class a extends MediaDataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f21567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f21568b;

    public a(f fVar) {
        this.f21568b = fVar;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return -1L;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j10, byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        if (j10 < 0) {
            return -1;
        }
        try {
            long j11 = this.f21567a;
            f fVar = this.f21568b;
            if (j11 != j10) {
                if (j11 >= 0 && j10 >= j11 + ((long) fVar.f21569a.available())) {
                    return -1;
                }
                fVar.c(j10);
                this.f21567a = j10;
            }
            if (i11 > fVar.f21569a.available()) {
                i11 = fVar.f21569a.available();
            }
            int i12 = fVar.read(bArr, i10, i11);
            if (i12 >= 0) {
                this.f21567a += (long) i12;
                return i12;
            }
        } catch (IOException unused) {
        }
        this.f21567a = -1L;
        return -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
