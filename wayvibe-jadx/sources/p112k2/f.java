package p112k2;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class f extends b {
    public f(byte[] bArr) {
        super(bArr);
        this.f21569a.mark(com.google.android.gms.common.api.f.API_PRIORITY_OTHER);
    }

    public final void c(long j10) throws IOException {
        int i10 = this.f21570b;
        if (i10 > j10) {
            this.f21570b = 0;
            this.f21569a.reset();
        } else {
            j10 -= (long) i10;
        }
        b((int) j10);
    }

    public f(InputStream inputStream) {
        super(inputStream);
        if (inputStream.markSupported()) {
            this.f21569a.mark(com.google.android.gms.common.api.f.API_PRIORITY_OTHER);
            return;
        }
        throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
    }
}
