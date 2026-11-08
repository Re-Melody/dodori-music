package okhttp3.internal.cache;

import E9.s;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class DiskLruCache$Entry$newSource$1 extends s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f24171b;

    @Override // E9.s, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
        if (this.f24171b) {
            return;
        }
        this.f24171b = true;
        throw null;
    }
}
